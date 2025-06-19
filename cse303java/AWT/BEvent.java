package cse303java.AWT;
import java.awt.*;
import java.awt.event.*;


public class BEvent extends Frame implements ActionListener {
    TextField tf;
    BEvent(){
        tf = new TextField("");
        tf.setBounds(60, 50, 180, 25);
        Button b = new Button("Click Me");
        b.setBounds(100, 120, 80, 30);
        setSize(400, 300);
        setTitle("Employee Information");
        b.addActionListener(this);
        add(b);
        add(tf);
        setVisible(true);
        setLayout(null);
        // addWindowListener(new WindowAdapter() {
        //     public void windowClosing(WindowEvent windowEvent) {
        //         System.exit(0);
        //     }
        // });
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("MVSR!");
    }
    public static void main(String[] args) {
        new BEvent();
    }
}
