/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Timer;

/**
 *
 * @author ander
 */
public class Horas implements ActionListener{
    

    @Override
    public void actionPerformed(ActionEvent e) {
         Calendar cl = Calendar.getInstance();
       
       String h=String.format("%1$tH:%1$tM:%1$tS", cl);
      
    }
}