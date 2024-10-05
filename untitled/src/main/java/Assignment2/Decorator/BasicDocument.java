package Assignment2.Decorator;
import Assignment2.Decorator.Document;

public class BasicDocument implements Document{

    @Override
    public void display(){
        System.out.println("Basic Document");
    }
}
