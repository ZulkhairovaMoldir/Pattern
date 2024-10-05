package Assignment2.Facade;



public class Render {
    private String renderingEngine;

    public Render(String renderingEngine) {
        this.renderingEngine = renderingEngine;
    }

    public void rendering(Documents document) {
        System.out.println("Рендировка документа " + document.getTitle() + " используя " + renderingEngine );
    }
}
