package MedWarehouse;
import java.util.*;



public class MedWarehouse {

    public static void main(String[] args) {

        List<Medicine> list = new ArrayList<>();

        list.add(new Medicine("Paracetamol", 10));
        list.add(new Medicine("Vitamin C", 25));
        list.add(new Medicine("Insulin", 60));
        list.add(new Medicine("Cough Syrup", 5));
        list.add(new Medicine("Antibiotic", 20));
        list.add(new Medicine("Painkiller", 45));

        
        // merge sort
        mergeSort(list, 0, list.size() - 1);

        System.out.println("Sorted Medicines by Expiry:");
        for (Medicine m : list) {
            System.out.println(m.name + " → " + m.expiryDays + " days");
        }

        System.out.println("Expiring Soon (≤ 7 days):");
        for (Medicine m : list) {
            if (m.expiryDays <= 7) {
                System.out.println(m.name);
            }
        }
    }

    
    // MERGE SORT
    public static void mergeSort(List<Medicine> list, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            mergeSort(list, low, mid);
            mergeSort(list, mid + 1, high);

            merge(list, low, mid, high);
        }
    }

    
    // MERGE
    public static void merge(List<Medicine> list, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        List<Medicine> left = new ArrayList<>();
        List<Medicine> right = new ArrayList<>();

        for (int i = 0; i < n1; i++)
            left.add(list.get(low + i));

        for (int j = 0; j < n2; j++)
            right.add(list.get(mid + 1 + j));

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {

            if (left.get(i).expiryDays <= right.get(j).expiryDays) {
                list.set(k++, left.get(i++));   // stable
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < n1)
            list.set(k++, left.get(i++));

        while (j < n2)
            list.set(k++, right.get(j++));
    }
}
