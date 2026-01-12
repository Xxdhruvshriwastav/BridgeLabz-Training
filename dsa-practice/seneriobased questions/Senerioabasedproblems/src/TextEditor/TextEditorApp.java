package TextEditor;



public class TextEditorApp {

    public static void main(String[] args) {

        TextEditorManager editor = new TextEditorManager();

        editor.insert("Hello");
        editor.insert(" World");
        editor.showContent();

        editor.delete(6);
        editor.showContent();

        editor.undo();
        editor.showContent();

        editor.redo();
        editor.showContent();
    }
}

