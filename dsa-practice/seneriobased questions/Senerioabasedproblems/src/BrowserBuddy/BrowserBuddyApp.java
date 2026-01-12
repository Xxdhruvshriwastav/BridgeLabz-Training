package BrowserBuddy;

public class BrowserBuddyApp {

    public static void main(String[] args) {

        BrowserBuddy browser = new BrowserBuddy();

        browser.openPage("google.com");
        browser.openPage("youtube.com");
        browser.openPage("chatgpt.com");

        browser.back();      // youtube.com
        browser.back();      // google.com
        browser.forward();   // youtube.com

        browser.closeTab();  // tab closed

        browser.reopenTab(); // restore closed tab
    }
}

