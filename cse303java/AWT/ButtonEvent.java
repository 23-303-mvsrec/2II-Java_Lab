package cse303java.AWT;
import java.awt.*;
import java.awt.event.*;
public class ButtonEvent extends Frame implements ActionListener {
    Button b1, b2;
    TextField tf;

    ButtonEvent() {
        b1 = new Button("Click Me");
        b2 = new Button("Exit");
        tf = new TextField("Press Button");
        
        b1.setBounds(30, 100, 80, 30);
        b2.setBounds(120, 100, 80, 30);
        tf.setBounds(30, 150, 200, 30);
        
        add(b1);
        add(b2);
        add(tf);
        
        setSize(300, 300);
        setTitle("AWT Button Event Example");
        setLayout(null);
        setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            tf.setText("Button Clicked!");
        } else if (e.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ButtonEvent();
    }
    
}
