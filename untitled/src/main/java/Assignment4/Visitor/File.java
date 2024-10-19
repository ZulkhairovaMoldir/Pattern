package Assignment4.Visitor;

// Принимает посетителей
public interface File {
    void accept(Visitor visitor);
}
