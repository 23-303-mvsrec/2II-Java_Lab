package cse303java.AWT;

import java.awt.*;
import java.awt.event.*;

public class FactGUI extends Frame implements ActionListener {
    TextField t;
    Button b,b1;

    FactGUI() {
        t = new TextField(20);
        b = new Button("Calculate Factorial");

        t.setBounds(50, 50, 150, 30);
        b.setBounds(50, 100, 150, 30);

        add(t);
        add(b);

        setSize(300, 250);
        setTitle("Factorial Calculator");
        setLayout(null);
        setVisible(true);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });       
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action called: " + e.getActionCommand());
        int x = Integer.parseInt(t.getText());
        long result = factorial(x);
        t.setText("Factorial of " + x + " is " + result);
    }

    private long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        new FactGUI();
    }
    
}
