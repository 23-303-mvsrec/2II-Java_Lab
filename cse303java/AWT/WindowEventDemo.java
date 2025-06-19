package cse303java.AWT;
import java.awt.*;
import java.awt.event.*;

public class WindowEventDemo extends Frame implements WindowListener {
    Label label;

    WindowEventDemo() {
        label = new Label("Window Event Example");
        label.setBounds(50, 40, 200, 30);
        
        add(label);
        
        setSize(300, 200);
        setTitle("Window Event Example");
        setLayout(null);
        setVisible(true);
        
        addWindowListener(this);
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) {
        new WindowEventDemo();
    }
    
}
