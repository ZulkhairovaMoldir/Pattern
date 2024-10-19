package Assignment4.Template;

// Три этапа проверки с написынным 1 и 3 этапом для всех общее
// И второй для ереписания
// метод который вызывает все этапы проверки

public abstract class QualityCheck {

    public final void checkProduct() {
        checkAppearance();
        checkCharacteristics();
        generateReport();
    }

    private void checkAppearance() {
        System.out.println("Прошла проверку внешного вида продукта");
    }

    protected abstract void checkCharacteristics();

    private void generateReport() {
        System.out.println("Заключительный отчёт");
    }
}
