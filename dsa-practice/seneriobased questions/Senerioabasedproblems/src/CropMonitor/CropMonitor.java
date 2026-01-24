package CropMonitor;
import java.util.*;

public class CropMonitor {

    public static void main(String[] args) {

        Map<Double, String> l = new HashMap<>();

        l.put(10.30, "29 Degree");
        l.put(1.30, "24 Degree");
        l.put(12.30, "26 Degree");
        l.put(9.30, "22 Degree");
        l.put(8.30, "21 Degree");
        l.put(7.30, "12 Degree");

        // store time in arraylist
        
        List<Double> l1 = new ArrayList<>(l.keySet());

        // sort using quick sort
        quickSort(l1, 0, l1.size() - 1);

        System.out.println("Sorted by time:");
        for (Double t : l1) {
            System.out.println(t + " => " + l.get(t));
        }
    }

    // QUICK SORT
    public static void quickSort(List<Double> list, int low, int high) {

        if (low < high) {

            int pv = partition(list, low, high);

            quickSort(list, low, pv - 1);
            quickSort(list, pv + 1, high);
        }
    }

    // PARTITION
    public static int partition(List<Double> list, int low, int high) {

        double pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (list.get(j) < pivot) {
                i++;

                double temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        // pivot final position
        double temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }
}
