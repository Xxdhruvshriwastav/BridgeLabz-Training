package FoodFest;
import java.util.*;

public class FoodFest {

    public static void main(String[] args) {

        // Zone A
        List<Integer> l = new ArrayList<>();
        l.add(120);
        l.add(140);
        l.add(220);

        // Zone B
        List<Integer> l1 = new ArrayList<>();
        l1.add(110);
        l1.add(150);
        l1.add(230);

        // Zone C
        List<Integer> l3 = new ArrayList<>();
        l3.add(90);
        l3.add(160);
        l3.add(270);

        // combine all zones
        List<Integer> l4 = new ArrayList<>();
        l4.addAll(l);
        l4.addAll(l1);
        l4.addAll(l3);

        // merge sort
        mergeSort(l4, 0, l4.size() - 1);

        System.out.println("Final sorted footfall:");
        System.out.println(l4);
    }

    // MERGE SORT
    public static void mergeSort(List<Integer> list, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            mergeSort(list, low, mid);
            mergeSort(list, mid + 1, high);

            merge(list, low, mid, high);
        }
    }

    // MERGE TWO SORTED PARTS
    public static void merge(List<Integer> list, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < n1; i++)
            left.add(list.get(low + i));

        for (int j = 0; j < n2; j++)
            right.add(list.get(mid + 1 + j));

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {

            if (left.get(i) <= right.get(j)) {   // STABLE
                list.set(k, left.get(i));
                i++;
            } else {
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            list.set(k++, left.get(i++));
        }

        while (j < n2) {
            list.set(k++, right.get(j++));
        }
    }
}
