package day5.BookBazaar;

abstract class Book implements IDiscountable {

    private String title;
    private String author;
    protected double price;   // protected → subclasses can access
    private int stock;

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Encapsulation: stock updated only via methods
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

