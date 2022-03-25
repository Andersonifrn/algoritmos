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
public class SomaDosNumeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
     
       int cont=0;
       int cont2=0;
        for (int i = 0; i < 6; i++) {
             System.out.println("Digite sua idade :"); 
             int idade=sc.nextInt();
             
           if(idade>=18){
               System.out.println("Maior de Idade "+idade);
               cont=cont+idade;
           }  
           else {
               if(idade<18){
                   System.out.println("Menor de Idade "+idade);
                   cont2=cont2+idade;
               }
           }
             
        }
        
        System.out.println("Maior de idade são "+cont);
        System.out.println("Menor de idade são "+cont2);
        
        double media=(cont+cont2)/6;
        System.out.println("Media das idades é =  "+media);
        
    }
    
}
