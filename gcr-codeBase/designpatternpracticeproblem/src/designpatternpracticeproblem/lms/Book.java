package designpatternpracticeproblem.lms;



public class Book {

    String title;
    String author;
    int edition;
    String genre;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.edition = builder.edition;
        this.genre = builder.genre;
    }

    public String getTitle() {
        return title;
    }

    // BUILDER
    public static class BookBuilder {

        private String title;
        private String author;
        private int edition;
        private String genre;

        public BookBuilder(String title) {   // mandatory
            this.title = title;
        }

        public BookBuilder author(String author) { // optional setter
            this.author = author;
            return this;
        }

        public BookBuilder edition(int edition) { 
            this.edition = edition;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Book build() {
            return new Book(this); //Builder apna poora data utha ke

            					   //Book ke private constructor me bhej raha
        }
    }
}
