/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notpad;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hadi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gui gui = new Gui();
        gui.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        gui.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
                int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to Discard changes?", "Confirmation", 0);
                if (a == 0)
                {
                    System.exit(0);
                }
            }      
        });
        
        if(gui.getSaveFilename() != null)
            gui.setTitle("Notepad" + gui.getSaveFilename());
        else
            gui.setTitle("Notepad"); 
        gui.setVisible(true);

    }
    
}
