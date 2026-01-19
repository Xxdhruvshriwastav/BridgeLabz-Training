package FlashDealz;

public class FlashDealz {

	public static void quickSort(int arr[], int low, int high) {

		if (low < high) {

			int piviotIndex = partion(arr, low, high);

			quickSort(arr, low, piviotIndex - 1);
			quickSort(arr, piviotIndex + 1, high);
		}
	}

	public static int partion(int arr[], int low, int high) {

		int piviot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < piviot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		i++;
		int temp = arr[i];
		arr[i] = piviot;
		arr[high] = temp;

		return i;
	}

	public static void main(String[] args) {
		// using quick sort

		int prices[] = { 442, 299, 499, 699, 1299, 199, 165, 99, 87 };

		quickSort(prices, 0, prices.length - 1);

		for (int x : prices) {
			System.out.print(" " + x);
		}
	}
}
