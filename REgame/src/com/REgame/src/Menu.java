package com.REgame.src;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
 
/* 
 * ButtonDemo.java requires the following files:
 *   images/right.gif
 *   images/middle.gif
 *   images/left.gif
 */
public class Menu extends JPanel
                        implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = -419819552024662933L;
	protected JButton b1, b2, b3;
 
    public Menu() {
    	
        ImageIcon leftButtonIcon = createImageIcon("images/right.gif");
        ImageIcon RightButtonIcon = createImageIcon("images/right.gif");
 
        b1 = new JButton("Start the Game", leftButtonIcon);
        b1.setVerticalTextPosition(AbstractButton.LEFT);
        b1.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("disable");
        
        b2 = new JButton("Enable middle button", rightButtonIcon);
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b2.setMnemonic(KeyEvent.VK_E);
        b2.setActionCommand("enable");
        b.setEnabled(false); 

        //Listen for actions on buttons 1 and 3.
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setToolTipText("Click Here for begin the game.");
        b2.setToolTipText("Close the game.");
 
        //Add Components to this container, using the default FlowLayout.
        add(b1);
        add(b2);
    }
 
    public void actionPerformed(ActionEvent e) {
        if ("disable".equals(e.getActionCommand())) {
            b1.setEnabled(false);
            b1.setEnabled(false);
        } else {
            b1.setEnabled(true);
            b1.setEnabled(true);
        }
    }
 
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Menu.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
 
    /**
     * Create the GUI and show it.  For thread safety, 
     * this method should be invoked from the 
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
 
        //Create and set up the window.
        JFrame frame = new JFrame("Game test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        Menu newContentPane = new Menu();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }
}