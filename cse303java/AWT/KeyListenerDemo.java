package cse303java.AWT;

import java.awt.*;
import java.awt.event.*;

public class KeyListenerDemo extends Frame implements KeyListener {
    Label label;
    TextField tf;

    KeyListenerDemo() {
        label = new Label("Key Listener Example");
        label.setBounds(50, 40, 200, 30);
        tf = new TextField();
        tf.setBounds(50, 60, 200, 30);
        tf.addKeyListener(this);
        
        add(label);
        add(tf);
        
        setSize(300, 200);
        setTitle("KeyListener Example");
        setLayout(null);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }
    
}
