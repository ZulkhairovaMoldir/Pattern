package Assignment2.Proxy;

public class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadDocument();
    }

    private void loadDocument() {
        System.out.println("Loading document: " + title);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + title);
    }
}
