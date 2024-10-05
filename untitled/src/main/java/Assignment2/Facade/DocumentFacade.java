package Assignment2.Facade;

// Фасад для работы с документами
public class DocumentFacade {
    private DocumentsFactory documentFactory;
    private Render render;
    private Watermark watermarkDecorator;

    public DocumentFacade() {
        this.documentFactory = new DocumentsFactory();
        this.render = new Render("PDF"); // Укажите нужный движок рендеринга
    }

    // Метод для отображения документа
    public void displayDocument(String title) {
        Documents document = documentFactory.createDocument(title);
        document.display();
    }

    // Метод для отображения документа с водяным знаком
    public void displayDocumentWithWatermark(String title) {
        Documents document = documentFactory.createDocument(title);
        watermarkDecorator = new Watermark(document);
        watermarkDecorator.display();
    }

    // Метод для рендеринга документа
    public void renderDocument(String title) {
        Documents document = documentFactory.createDocument(title);
        render.rendering(document);
    }

    public void startComputer() {
        System.out.println("Starting computer...");
        System.out.println("Computer successfully started.");
    }
    //Задачи:
    //Метод для отображения документа:
    //Используйте фабрику документов, чтобы получить документ по заданному заголовку.
    //Вызовите метод для отображения документа.

    //Метод для отображения документа с водяным знаком:
    //Получите документ по заголовку с помощью фабрики документов.
    //Оберните полученный документ декоратором, который добавляет водяной знак.
    //Вызовите метод для отображения обёрнутого документа.

    //Метод для рендеринга документа:
    //Создайте объект рендерера, передав в конструктор выбранный движок рендеринга.
    //Вызовите метод рендеринга в рендерере для заданного документа.


}

