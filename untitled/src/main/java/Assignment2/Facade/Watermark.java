package Assignment2.Facade;

public class Watermark extends  Documents{
    private Documents document;

    public Watermark(Documents document) {
        super(document.getTitle());
        this.document = document;
    }

    @Override
    public void display() {
        document.display();
        addWatermark();
    }

    private void addWatermark() {
        System.out.println("Adding watermark to document: " + document.getTitle());
    }
}
