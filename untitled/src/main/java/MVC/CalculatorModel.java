package MVC;

public class CalculatorModel {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка! Цифра не делиться на 0");
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Ошибка! Не можна вывести корен у отрицательного числа");
        }
        return Math.sqrt(a);
    }
}
