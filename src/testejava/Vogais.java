/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Vogais {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Seu Nome:");
       
       int cont =0;
    
          String x=sc.next();
       
        for (int j = 0; j <x.length(); j++) {
           
           
            char n=x.charAt(j);
            
         
        if(n=='a'|| n=='e'||n=='i'||n=='o'||n=='u'){
            cont++;
        }
          
            System.out.println(n);
           
             
      
        }
        
        System.out.println("Total das vogais :"+cont);
        
    }
}
