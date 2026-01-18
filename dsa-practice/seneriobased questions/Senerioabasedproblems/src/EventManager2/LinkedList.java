package EventManager2;

public class LinkedList {

    public Node head;

    // insert
    public void insert(int price) {

        Node temp = new Node(price);

        if (head == null) {
            head = temp;
            return;
        }

        Node curr = head;
        while (curr.next != null)
            curr = curr.next;

        curr.next = temp;
    }

    // merge sort
    public Node mergeSort(Node head) {

        if (head == null || head.next == null)
            return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    // merge two lists
    private Node sortedMerge(Node a, Node b) {

        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.price <= b.price) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }

        return result;
    }

    // find middle
    private Node getMiddle(Node head) {

        if (head == null)
            return head;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // display
    public void display() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.price + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
