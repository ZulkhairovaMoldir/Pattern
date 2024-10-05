package Assignment2.Composite;

public class RAWdocument implements Document{
    private String name;
    private int size;

    public RAWdocument(String name,int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("RAWdocuments: name= " + name+ " size= "+ size);
    }
}
