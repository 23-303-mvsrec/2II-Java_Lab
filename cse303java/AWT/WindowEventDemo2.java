package cse303java.AWT;

import java.awt.*;
import java.awt.event.*;
/**
 * This class demonstrates handling window events in AWT.
 * It implements the WindowListener interface to respond to various window events.
 */
public class WindowEventDemo2 extends Frame {
    Label label;

    WindowEventDemo2() {
        label = new Label("Window Event Example");
        label.setBounds(50, 40, 200, 30);
        
        add(label);
        
        setSize(400, 400);
        setTitle("Window Event Example");
        setLayout(null);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
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
        });
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    
    public static void main(String[] args) {
        new WindowEventDemo2();
    }
    
}
