package Assignment2.Composite;

public class DOCdocument implements Document{
    private String name;
    private int size;

    public DOCdocument(String name,int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("DOCdocuments: name= " + name+ " size= "+ size);
    }
}
