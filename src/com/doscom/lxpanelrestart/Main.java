/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doscom.lxpanelrestart;

import com.doscom.lxpanelrestart.view.Test;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author zword
 */
public class Main {
   public static void main(String[] args) {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    Test frame = new Test();
                    frame.setVisible(true);
                }

                
            });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
