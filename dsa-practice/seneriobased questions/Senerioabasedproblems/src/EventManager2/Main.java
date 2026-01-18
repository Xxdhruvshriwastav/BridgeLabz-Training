package EventManager2;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        int[] ticketPrices = {
                600, 700, 1800, 200, 400,
                900, 1000, 750, 1800,
                1600, 3760, 150
        };

        for (int price : ticketPrices)
            list.insert(price);

        System.out.println("Before Sorting:");
        list.display();

        list.head = list.mergeSort(list.head);

        System.out.println("\nAfter Sorting:");
        list.display();
    }
}
