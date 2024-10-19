package Assignment4.Visitor;

// Интерфейс для посещений два разных файла

public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}
