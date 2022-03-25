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
public class Maior  {
    
   
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int v=3;
        double vetor [] = new double [v];
        double soma=0;
        double s=0;
      
        System.out.println("Digite um Número ?");
        for (int i = 0;i <vetor.length; i++) {
            
            vetor[i]=sc.nextDouble();
            System.out.println("vetor "+i);
            
            soma=vetor[i];
            s=vetor[i];
            
           
        }
        
         double total=s+soma;
        System.out.println("Resultado da soma é :"+total);
        
    }
    
    
}