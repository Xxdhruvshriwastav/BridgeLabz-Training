package day5.BookBazaar;
class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Polymorphism
    @Override
    public double applyDiscount(double price, int quantity) {
        return price * quantity * 0.20;  // 20% discount
    }
}
