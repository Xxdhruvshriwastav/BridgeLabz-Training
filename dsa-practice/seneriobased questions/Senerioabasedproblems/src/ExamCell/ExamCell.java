package ExamCell;


class ExamCell {

    // Merge Sort
    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted halves
    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Main Method
    public static void main(String[] args) {

        // Pre-sorted center-wise scores
        int[] center1 = {45, 60, 72, 85};
        int[] center2 = {50, 66, 78, 90};
        int[] center3 = {40, 55, 70, 88};

        // merge all center scores
        int totalLength = center1.length + center2.length + center3.length;
        int[] allScores = new int[totalLength];

        int index = 0;

        for (int x : center1) 
        	allScores[index++] = x;
        for (int x : center2)
        	allScores[index++] = x;
        for (int x : center3)
        	allScores[index++] = x;

        // Apply Merge Sort
        mergeSort(allScores, 0, allScores.length - 1);

        
        
        int rank = 1;
        for (int i = allScores.length - 1; i >= 0; i--) {
            System.out.println("Rank " + rank++ + " → Score: " + allScores[i]);
        }
    }
}
