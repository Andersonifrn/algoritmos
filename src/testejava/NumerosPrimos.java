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
public class NumerosPrimos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cont=0;
        
        System.out.println("Digite os números :");
        int x=sc.nextInt();
        
        for (int i = 1; i <= x; i++) {
           
            if(x%i==0){
                cont++;
            }
        }
        
           if(cont == 2){
               
               System.out.println("Número é Primo "+cont);
           }
    }
    
}
