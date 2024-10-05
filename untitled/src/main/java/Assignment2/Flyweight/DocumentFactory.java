package Assignment2.Flyweight;

import java.util.HashMap;
import java.util.Map;



// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<Integer, Document> documentMap = new HashMap<>();

    // Задача: Реализуйте фабрику, которая будет хранить и переиспользовать документы,
    // чтобы не создавать их повторно для одного и того же заголовка.

    public static Document getDocument(int size) {
        Document document = documentMap.get(size);

        if (document == null) {
            document = new PWDDocument(size);
            documentMap.put(size, document);
            System.out.println("Creating document with size " + size);
        }
        return document;
    }
}

