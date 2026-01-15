package ZipZipMart;
import java.time.LocalDate;

public class TransactionMergeSort {

    // MERGE SORT
    static void mergeSort(Transaction[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // MERGE LOGIC
    static void merge(Transaction[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        
        while (i < n1 && j < n2) {
            if (L[i].amount <= R[j].amount) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Transaction[] t1 = {
            new Transaction(LocalDate.of(2026, 8, 12), 1800.00),
            new Transaction(LocalDate.of(2026, 8, 17), 1600.00),
            new Transaction(LocalDate.of(2026, 8, 13), 2200.00),
            new Transaction(LocalDate.of(2026, 8, 11), 900.00)
        };

        mergeSort(t1, 0, t1.length - 1);

        for (Transaction t : t1) {
            System.out.println(t.date + " → " + t.amount);
        }
    }
}
