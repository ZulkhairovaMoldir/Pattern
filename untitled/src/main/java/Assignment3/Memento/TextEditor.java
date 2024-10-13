package Assignment3.Memento;

public class TextEditor {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public TextMemento saveText() {
        return new TextMemento(text);
    }
    public void restoreState(TextMemento memento) {
        this.text = memento.getText();
    }

    public String textEdier(String text, String newText) {
        this.text = text + newText;
        return this.text;
    }

    public String getText() {
        return text;
    }

}
