package SmartShelf;

public class SmartShelf {

	public static void main (String [] args) {
		Book [] book = {
				new Book("Atomic Habit", "jhon Doe"),
				new Book("Story of my Life", "Hellen Keller"),
				new Book("Nerver give-up", "Walter "),
				new Book("Avoid toxicity", "Mohan")
		};
		
		
		for(int i = 1; i < book.length; i++) {
			
			Book key = book[i];
			int j = i -1;
			
			while(j >= 0 && book[j].title.compareTo(key.title) > 0) {
				book[j+1] = book[j];
				j--;
			}
			book[j+1] = key;
		}
		
		for(Book P : book) {
			System.out.println(P.title + ", this is the writer name and the story name  is " + P.name);
		}
	}
}
