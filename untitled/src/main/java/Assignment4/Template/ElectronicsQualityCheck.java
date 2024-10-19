package Assignment4.Template;

// Переписанный этап 2 под товар
public class ElectronicsQualityCheck extends QualityCheck{
    @Override
    protected void checkCharacteristics() {
        System.out.println("Прошла проверку  работоспособности");
        System.out.println("Прошла проверку наличие гарантий");
    }
}
