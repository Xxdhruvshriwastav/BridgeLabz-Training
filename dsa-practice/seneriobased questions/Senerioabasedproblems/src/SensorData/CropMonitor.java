package SensorData;

import java.util.Scanner;

class SensorData {
    long timestamp;
    double temperature;

    SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}

public class CropMonitor {

    // Partition method
    public static int partition(SensorData[] arr, int low, int high) {

        long pivot = arr[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].timestamp < pivot) {
                i++;

                SensorData temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        SensorData temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort
    public static void quickSort(SensorData[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Print sensor records
    public static void printData(SensorData[] arr) {

        for (SensorData s : arr) {
            System.out.println(
                "Timestamp: " + s.timestamp +
                " | Temp: " + s.temperature + "°C"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        SensorData[] data = new SensorData[n];

        System.out.println("Enter timestamp and temperature:");

        for (int i = 0; i < n; i++) {
            long ts = sc.nextLong();
            double temp = sc.nextDouble();
            data[i] = new SensorData(ts, temp);
        }

        System.out.println("\nBefore sorting:");
        printData(data);

        quickSort(data, 0, n - 1);

        System.out.println("\nAfter sorting by timestamp:");
        printData(data);

        sc.close();
    }
}
