package designpatternpracticeproblem.librarycatlog;

public class Test {

	public static void main(String[] args) {
		LibraryCatalog c1 = LibraryCatalog.getInstance();
		LibraryCatalog c2 = LibraryCatalog.getInstance();
		
		c1.show();
		c2.show();
		
		System.out.println(c1==c2); // this means , no new object created, catalog sirf ek baar bana aur wahi same object baar baar use ho rhe hai 
	}
}
