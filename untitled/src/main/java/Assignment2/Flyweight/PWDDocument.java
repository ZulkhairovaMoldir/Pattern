package Assignment2.Flyweight;

public class PWDDocument implements Document {
    private int size;

    public PWDDocument(int size) {
        this.size = size;
    }

    @Override
    public void display(int size) {
        System.out.println("Create PWD document with size " + this.size);
    }
}
