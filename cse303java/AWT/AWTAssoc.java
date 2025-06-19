package cse303java.AWT;
import java.awt.*;

public class AWTAssoc {
    AWTAssoc() {
       Frame f = new Frame("AWT Association Example");
       Label l = new Label("Employee ID: ");
       Button b = new Button("Submit");
       TextField tf = new TextField(20);
       l.setBounds(20, 80, 80, 30);
       tf.setBounds(20,100,80,40);
       b.setBounds(100, 100, 80, 30);
       f.add(l);
       f.add(tf);
       f.add(b);
       f.setSize(400, 300);
       f.setLayout(null);
       f.setVisible(true);
       f.setTitle("Employee Information");
    //    f.addWindowListener(new java.awt.event.WindowAdapter() {
    //         public void windowClosing(java.awt.event.WindowEvent windowEvent) {
    //             System.exit(0);
    //         }
    //     });
    }

    public static void main(String[] args) {
        new AWTAssoc();
    }
}
