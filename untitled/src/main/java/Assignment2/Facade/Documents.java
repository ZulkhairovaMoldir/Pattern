package Assignment2.Facade;

public class Documents {
    private String title;

    public Documents(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println("Displaying document: " + title);
    }
}
