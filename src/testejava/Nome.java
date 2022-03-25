/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class Nome {
    
    public static void main(String[] args) {
       
        try {
          
         
            int x=0;
        
        
        System.out.println("Nome é : "+x);
       
           if(x==0){
               throw new ArithmeticException("erro");
           }
            
            
        } catch ( ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
        
                
    }
}
