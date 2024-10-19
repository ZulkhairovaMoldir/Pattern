package Assignment4.Visitor;

// Класс определяет текстовый файл и реализует метод accept

public class TextFile implements File{
    private String fileName;
    private String content;

    public TextFile(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
