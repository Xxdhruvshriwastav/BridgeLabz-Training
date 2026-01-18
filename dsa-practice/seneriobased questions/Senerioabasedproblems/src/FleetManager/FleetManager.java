package FleetManager;

import java.util.Scanner;

public class FleetManager {

    // Merge two sorted halves
    public static void merge(Vehicle[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] L = new Vehicle[n1];
        Vehicle[] R = new Vehicle[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // merge in ascending mileage order
        while (i < n1 && j < n2) {

            if (L[i].mileage <= R[j].mileage) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Merge Sort
    public static void mergeSort(Vehicle[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Print master schedule
    public static void printVehicles(Vehicle[] arr) {

        for (Vehicle v : arr) {
            System.out.println(
                "Vehicle: " + v.vehicleNumber +
                " | Mileage: " + v.mileage + " km"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total vehicles from all depots: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        System.out.println("Enter vehicle number and mileage:");

        for (int i = 0; i < n; i++) {
            String number = sc.next();
            int mileage = sc.nextInt();
            vehicles[i] = new Vehicle(number, mileage);
        }

        System.out.println("Before master scheduling:");
        printVehicles(vehicles);

        mergeSort(vehicles, 0, n - 1);

        System.out.println("After Merge Sort (Maintenance Priority):");
        printVehicles(vehicles);

        sc.close();
    }
}
