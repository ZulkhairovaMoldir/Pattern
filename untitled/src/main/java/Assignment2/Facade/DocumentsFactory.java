package Assignment2.Facade;



import Assignment2.Facade.Documents;

// Фабрика для создания документов
public class DocumentsFactory {
    public static Documents createDocument(String title) {
        return new Documents(title);
    }
}

