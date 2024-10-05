package Assignment2.Adapter;

// Адаптер для интеграции PDF документа
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    //Задача: Реализуйте логику для адаптера, чтобы методы PDF-документа могли быть использованы через интерфейс Document.

    @Override
    public void open() {
        pdfDocument.openPDF(); /// Реализуем метод из Документов
    }

    @Override
    public void display() {
        pdfDocument.showPDF(); // Реализуем метод из Документов
    }
}

