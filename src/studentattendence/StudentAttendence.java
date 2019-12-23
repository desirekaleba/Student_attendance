/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendence;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author desire
 */
public class StudentAttendence extends JFrame{

    /**
     * @param args the command line arguments
     */
    public StudentAttendence()
    {
        try {

UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
SwingUtilities.updateComponentTreeUI(this);

    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }
    public static void main(String[] args) {
                
    }
    
}
