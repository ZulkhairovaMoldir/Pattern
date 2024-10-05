package Assignment2;

import Assignment2.Adapter.Document;
import Assignment2.Adapter.PDFDocumentAdapter;
import Assignment2.Bridge.*;
import Assignment2.Composite.DOCdocument;
import Assignment2.Composite.DocumentGroup;
import Assignment2.Composite.RAWdocument;
import Assignment2.Decorator.BasicDocument;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Facade.DocumentFacade;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.Proxy.ProxyDocument;


public class Main {
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        //Adapter

        Document pdfDocument = new PDFDocumentAdapter("example.pdf");

        pdfDocument.open(); // Используем адаптер
        pdfDocument.display();

        //Bridge

        RenderEngine simpleEngine = new SimpleRenderEngine();
        DocumentRenderer simpleRenderer = new SimpleDocumentRenderer(simpleEngine);
        simpleRenderer.render("Это простой документ");

        RenderEngine highlightEngine = new HighlightRenderEngine();
        DocumentRenderer highlightRenderer = new SimpleDocumentRenderer(highlightEngine);
        highlightRenderer.render("Это выделенный документ");

        //Composite Pattern


        RAWdocument doc1 = new RAWdocument("Document 1", 5);
        RAWdocument doc2 = new RAWdocument("Document 2", 6);
        DOCdocument doc3 = new DOCdocument("Document 3", 7);


        DocumentGroup group1 = new DocumentGroup();
        group1.addDocument(doc1);
        group1.addDocument(doc2);

        group1.removeDocument(doc2);

        DocumentGroup group2 = new DocumentGroup();
        group2.addDocument(doc3);

        DocumentGroup groups = new DocumentGroup();
        groups.addDocument(group1);
        groups.addDocument(group2);

        groups.display();

        //Decorator

        // Создаем простой документ
        Assignment2.Decorator.Document basic = new BasicDocument();
        System.out.println("Basic Document:");
        basic.display();

        System.out.println("Watermark Document:");

        Assignment2.Decorator.Document watermark = new WatermarkDecorator(new BasicDocument());
        watermark.display();

        //Facade

        DocumentFacade facade = new DocumentFacade();

        facade.displayDocument("My Document");
        facade.displayDocumentWithWatermark("My Watermarked Document");
        facade.renderDocument("My Rendered Document");

        //Flyweight

        Assignment2.Flyweight.Document pwd1 = DocumentFactory.getDocument(10);
        Assignment2.Flyweight.Document  pwd2 = DocumentFactory.getDocument(10);
        Assignment2.Flyweight.Document  pwd3 = DocumentFactory.getDocument(20);


        pwd1.display(10);
        pwd2.display(10);
        pwd3.display(20);

        //Proxy pattern

        Assignment2.Proxy.Document document = new ProxyDocument("test_document.docx");

        System.out.println("First call:");
        document.display();

        System.out.println("Second call:");
        document.display();

    }
}