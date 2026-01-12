package BrowserBuddy;

public class Tab {

    private HistoryNode current;

    // Open / Visit new page
    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }

        current = newNode;
        System.out.println("Visited: " + url);
    }

    // Back navigation
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No page to go back");
        }
    }

    // Forward navigation
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No page to go forward");
        }
    }

    // Get current page
    public String getCurrentPage() {
        return (current != null) ? current.url : "Empty Tab";
    }
}
