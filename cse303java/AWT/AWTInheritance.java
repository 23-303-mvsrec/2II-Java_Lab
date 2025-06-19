package cse303java.AWT;
import java.awt.*;
import java.awt.event.*;

public class AWTInheritance extends Frame {
    AWTInheritance() {
        Button b = new Button("Click Me");
        b.setBounds(30, 100, 80, 30);
        add(b);
        
        setSize(300, 300);
        setTitle("AWT Inheritance Example");
        setLayout(null);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new AWTInheritance();
    }    
}
