package day5.BookBazaar;
class Order {

    private String userName;
    private Book book;
    private int quantity;
    private String status; // Encapsulation

    public Order(String userName, Book book, int quantity) {
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
        this.status = "CREATED";
    }

    // Total Cost = price × quantity − discount
    public double calculateTotal() {
        double discount = book.applyDiscount(book.getPrice(), quantity);
        return (book.getPrice() * quantity) - discount;
    }

    // Restricted update (access control)
    protected void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getStatus() {
        return status;
    }
}
