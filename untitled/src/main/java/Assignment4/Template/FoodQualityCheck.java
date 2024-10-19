package Assignment4.Template;

// Переписанный этап 2 под товар
public class FoodQualityCheck extends QualityCheck{
    @Override
    protected void checkCharacteristics() {
        System.out.println("Прошла проверку срока годности");
        System.out.println("Прошла проверку состава");
    }
}
