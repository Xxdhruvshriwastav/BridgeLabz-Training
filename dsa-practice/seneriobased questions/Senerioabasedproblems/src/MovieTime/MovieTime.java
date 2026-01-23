package MovieTime;

import java.util.ArrayList;


public class MovieTime {

	public static void insertionSort(ArrayList<Time> list) {
		
		for (int i = 1; i < list.size(); i++) {
			
			Time key = list.get(i);
			int j = i - 1;
			
			while(j >= 0 && list.get(j).totalMinutes > key.totalMinutes) {
				list.set(j + 1, list.get(j));
                j--;
			}
			
			 list.set(j + 1, key);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Time> shows = new ArrayList<>();
			
		shows.add(new Time(10, 30, "PM"));
		shows.add(new Time(9, 15, "AM"));
        shows.add(new Time(1, 00, "PM"));
        shows.add(new Time(11, 00, "AM"));
        shows.add(new Time(7, 45, "AM"));
        
        shows.add(new Time(5, 45, "AM"));
        
        insertionSort(shows);
        
        System.out.println("Sorted Show Times:");
        
        for (Time t : shows) {
            System.out.println(t);
        }
	}
}
