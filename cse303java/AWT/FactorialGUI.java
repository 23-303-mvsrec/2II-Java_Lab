package cse303java.AWT;
import java.awt.*;
import java.awt.event.*;

public class FactorialGUI extends Frame implements ActionListener {
    TextField inputField, resultField;
    Button calculateButton, clearButton;

    FactorialGUI() {
        setTitle("Factorial Calculator");
        setSize(400, 200);
        setLayout(new FlowLayout());

        Label inputLabel = new Label("Enter a number:");
        inputField = new TextField(10);
        calculateButton = new Button("Calculate");
        clearButton = new Button("Clear");
        resultField = new TextField(20);
        resultField.setEditable(false);

        add(inputLabel);
        add(inputField);
        add(calculateButton);
        add(clearButton);
        add(resultField);

        calculateButton.addActionListener(this);
        clearButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            System.out.println(e);
            try {
                int number = Integer.parseInt(inputField.getText());
                long factorial = calculateFactorial(number);
                resultField.setText("Factorial: " + factorial);
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input!");
            }
        } else if (e.getSource() == clearButton) {
            inputField.setText("");
            resultField.setText("");
        }
    }

    private long calculateFactorial(int n) {
        if (n < 0) return -1; // Factorial is not defined for negative numbers
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        new FactorialGUI();
    }
}
