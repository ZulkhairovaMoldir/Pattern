package Assignment4.Visitor;

// Реализует медоот  проверку используя вызов данных

public class AntivirusVisitor implements Visitor{
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Сканировануем текстовый файл " + textFile.getFileName());
        if (textFile.getContent().contains("запрещенное слово")) {
            System.out.println("Содержит запрещенное слова");
        } else {
            System.out.println("Проверка текста прошла успешна");
        }
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Сканирование исполняемого файла " + executableFile.getFileName());
        if (executableFile.getCode().contains("вирус")) {
            System.out.println("Содержит вирус");
        } else {
            System.out.println("Проверка кода прошла успешна");
        }
    }
}
