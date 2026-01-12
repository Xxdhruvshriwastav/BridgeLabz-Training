package BrowserBuddy;
import java.util.Stack; 

public class BrowserBuddy {

    private Tab activeTab;
    private Stack<Tab> closedTabs;

    public BrowserBuddy() {
        activeTab = new Tab();
        closedTabs = new Stack<>();
    }

    // Open page in active tab
    public void openPage(String url) {
        activeTab.visit(url);
    }

    // Back navigation
    public void back() {
        activeTab.back();
    }

    // Forward navigation
    public void forward() {
        activeTab.forward();
    }

    // Close current tab
    public void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new Tab();
        System.out.println("Tab closed");
    }

    // Reopen last closed tab
    public void reopenTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Reopened tab with page: " + activeTab.getCurrentPage());
        } else {
            System.out.println("No closed tabs to reopen");
        }
    }
}

