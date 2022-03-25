/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.util.Scanner;
import sun.applet.Main;

/**
 *
 * @author ander
 */
public class Tabuada {
    
    
  public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      
       
      
        for (int i = 0; i<=10; i++) {
          
          if(i==9){
              for (int j = 0; j <=10; j++) {
                  System.out.println(9+"x"+j+"="+9*j);
              }
              System.out.println("\n");
          }else{
               if(i==7){
                   for (int x = 0; x <=10; x++) {
                       System.out.println(7+"x"+x+"="+7*x);
                   }
               }
          }
           
             
             
             
      }
      
      
  }
    
}
