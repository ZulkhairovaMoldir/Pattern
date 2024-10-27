package MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    private JTextField resultField = new JTextField(10);
    private JTextArea historyArea = new JTextArea(8, 20);

    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");
    private JButton powerButton = new JButton("^");
    private JButton sqrtButton = new JButton("√");
    private JButton clearButton = new JButton("Очистить");
    private JButton clearHistoryButton = new JButton("Очистить историю");

    public CalculatorView() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Первое число:"));
        panel.add(firstNumber);
        panel.add(new JLabel("Второе число (необязательно для √):"));
        panel.add(secondNumber);
        panel.add(new JLabel("Результат:"));
        panel.add(resultField);
        resultField.setEditable(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(powerButton);
        buttonPanel.add(sqrtButton);
        buttonPanel.add(clearButton);

        JPanel historyPanel = new JPanel();
        historyPanel.setBorder(BorderFactory.createTitledBorder("История"));
        historyArea.setEditable(false);
        historyPanel.add(new JScrollPane(historyArea));

        JPanel clearHistoryPanel = new JPanel();
        clearHistoryPanel.add(clearHistoryButton);

        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);
        this.add(historyPanel, BorderLayout.SOUTH);
        this.add(clearHistoryPanel, BorderLayout.WEST);

        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return secondNumber.getText().isEmpty() ? 0 : Double.parseDouble(secondNumber.getText());
    }

    public void setResult(String result) {
        resultField.setText(result);
    }

    public void addHistory(String entry) {
        historyArea.append(entry + "\n");
    }

    public void clearFields() {
        firstNumber.setText("");
        secondNumber.setText("");
        resultField.setText("");
    }

    public void clearHistory() {
        historyArea.setText("");
    }

    public void addOperationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
        powerButton.addActionListener(listener);
        sqrtButton.addActionListener(listener);
        clearButton.addActionListener(listener);
        clearHistoryButton.addActionListener(listener);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubtractButton() {
        return subtractButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }

    public JButton getPowerButton() {
        return powerButton;
    }

    public JButton getSqrtButton() {
        return sqrtButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getClearHistoryButton() {
        return clearHistoryButton;
    }
}
