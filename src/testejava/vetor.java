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
public class vetor {
    
   public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       int contador [] = new int [5];
       double soma=0;
       double par=0;
       double impar=0;
       System.out.println("Digite os Valores :");
       for(int i=0;i<contador.length;i++){
           contador[i]=sc.nextInt();
           soma=soma+contador[i];
           System.out.println("Valores do "+(i+1)+" vetor :"+i);
          
           if(contador[i]%2==0){
               par++;
               System.out.println("Números Par :"+par);
           }else{
               
               if(contador[i]%1==0){
                   System.out.println("Número ímpar:"+impar);
                   impar++;
               }
           }
       }
       System.out.println("Resultado da Soma :"+soma);
       System.out.println("Valor dos Números ="+par);
       System.out.println("Total dos Números  impares ="+impar);
   }
    
    
}
