package TextEditor;

import java.util.Stack;

public class TextEditorManager {

    private String content;
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;

    public TextEditorManager() {
        content = "";
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Insert text
    public void insert(String text) {
        content += text;
        undoStack.push(new Action("INSERT", text));
        redoStack.clear(); // new action -> redo clear
        System.out.println("Inserted: " + text);
    }

    // Delete last characters
    public void delete(int length) {

        if (content.length() < length) {
            System.out.println("Delete not possible");
            return;
        }

        String deletedText =
                content.substring(content.length() - length);

        content =
                content.substring(0, content.length() - length);

        undoStack.push(new Action("DELETE", deletedText));
        redoStack.clear();

        System.out.println("Deleted: " + deletedText);
    }

    // Undo last action
    public void undo() {

        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("INSERT")) {
            content =
                content.substring(0, content.length() - action.text.length());
        } else if (action.type.equals("DELETE")) {
            content += action.text;
        }

        redoStack.push(action);
        System.out.println("Undo performed");
    }

    // Redo last undone action
    public void redo() {

        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("INSERT")) {
            content += action.text;
        } else if (action.type.equals("DELETE")) {
            content =
                content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed");
    }

    // Display editor content
    public void showContent() {
        System.out.println("📄 Current Text: " + content);
    }
}

