package Assignment4.Visitor;

// Класс определяет exe файл и реализует метод accept

public class ExecutableFile implements File{
    private String fileName;
    private String code;

    public ExecutableFile(String fileName, String code) {
        this.fileName = fileName;
        this.code = code;
    }

    public String getFileName() {
        return fileName;
    }

    public String getCode() {
        return code;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
