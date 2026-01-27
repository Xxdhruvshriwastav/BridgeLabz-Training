package reflection.AnnotationReader;

public class AnnotationReader {

    public static void main(String[] args) {

        // Get Class object
        Class<Book> bookClass = Book.class;

        // Check annotation present or not
        if (bookClass.isAnnotationPresent(Author.class)) {

            // Get annotation
            Author author =
                    bookClass.getAnnotation(Author.class);

            // Read annotation value
            System.out.println("Author Name: " + author.name());
        }
    }
}
