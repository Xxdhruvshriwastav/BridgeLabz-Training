package FitnessTracker;

import java.util.*;

public class FitnessTracker {

	// using bubble sort for hasmap to sort data based on steps

	public static void bubbleSort(HashMap<String, Integer> map) {

		// convert hashmap to list for index because hashpmap has no index but list has
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		int n = list.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (list.get(j).getValue() > list.get(j + 1).getValue()) {
					
					// swap
					Map.Entry<String, Integer> temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}

		// printing sorted data
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " steps");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// using hashmap to store data via user input and bubble sort for sorting
		
		HashMap<String, Integer> fitnessData = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter name of person " + (i + 1) + " -");
			String name = sc.nextLine();
			System.out.print("Enter steps taken by " + name + " -");
			int steps = sc.nextInt();
			sc.nextLine();
			fitnessData.put(name, steps);
		}

		System.out.println("\nFitness Data Sorted by Steps:");
		bubbleSort(fitnessData);
		sc.close();

	}

}
