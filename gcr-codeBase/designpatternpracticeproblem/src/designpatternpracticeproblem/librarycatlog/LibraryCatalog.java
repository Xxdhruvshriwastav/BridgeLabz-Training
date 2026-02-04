package designpatternpracticeproblem.librarycatlog;

public class LibraryCatalog {

	private static LibraryCatalog instance;
	
	private LibraryCatalog() {
		System.out.println("Library Catalog Created");
	}
	
	
	public static LibraryCatalog getInstance() {
		
		if(instance == null) {
			
			instance = new LibraryCatalog();
		}
		return instance;
	}
	
	public void show() {
		System.out.println("Library Catalog Accessed");
	}
}
