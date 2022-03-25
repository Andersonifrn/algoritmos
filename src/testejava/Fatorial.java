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
public class Fatorial {

    /**
     
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int fatorial=1;
        System.out.println("Digite um Número: ");
        int num=sc.nextInt();
        
        for (int i = num ;i>0 ; i--) {
            
            fatorial=fatorial*i;
            
            System.out.println(fatorial);
            
        }
            System.out.println("Fatorial do número "+num+" é "+fatorial);
    }
    
}
