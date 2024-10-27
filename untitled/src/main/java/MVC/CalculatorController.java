package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addOperationListener(new OperationListener());
    }

    class OperationListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = view.getFirstNumber();
                double secondNumber = view.getSecondNumber();
                double result = 0;

                if (e.getSource() == view.getAddButton()) {
                    result = model.add(firstNumber, secondNumber);
                } else if (e.getSource() == view.getSubtractButton()) {
                    result = model.subtract(firstNumber, secondNumber);
                } else if (e.getSource() == view.getMultiplyButton()) {
                    result = model.multiply(firstNumber, secondNumber);
                } else if (e.getSource() == view.getDivideButton()) {
                    result = model.divide(firstNumber, secondNumber);
                } else if (e.getSource() == view.getPowerButton()) {
                    result = model.power(firstNumber, secondNumber);
                } else if (e.getSource() == view.getSqrtButton()) {
                    result = model.sqrt(firstNumber);
                } else if (e.getSource() == view.getClearButton()) {
                    view.clearFields();
                    return;
                } else if (e.getSource() == view.getClearHistoryButton()) {
                    view.clearHistory();
                    return;
                }

                view.setResult(String.valueOf(result));
                view.addHistory(firstNumber + " " + e.getActionCommand() + " " + (e.getSource() == view.getSqrtButton() ? "" : secondNumber) + " = " + result);

            } catch (NumberFormatException ex) {
                view.setResult("Ошибка!");
            } catch (ArithmeticException ex) {
                view.setResult(ex.getMessage());
            }
        }
    }
}

