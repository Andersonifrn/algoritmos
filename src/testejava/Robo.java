/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author ander
 */
public class Robo {
    
    public static void main(String[] args) {
        try {
            Robot rob = new Robot();
           // int x=Integer.parseInt(KeyCode.WINDOWS.toString());
            int x=1;
          //  String c= String.valueOf(rob.mousePress(KeyCode.A));
          
            rob.delay(1000);
            rob.mouseRelease(x);
            rob.delay(1000);
            
        } catch (AWTException ex) {
            Logger.getLogger(Robo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
