package Assignment4.Visitor;

// Выводит отчет проверки
public class ReportVisitor implements Visitor{

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Отчёт текстового файла: " + textFile.getFileName());
        System.out.println(" " + textFile.getContent());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Отчёт исполняемого файла: " + executableFile.getFileName());
        System.out.println(" " + executableFile.getCode());
    }
}
