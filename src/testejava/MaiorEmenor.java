package testejava;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ander
 */
public class MaiorEmenor {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
       
        int m=0;
        int maior=1000000;
        String nomem="";
        int menor=0;
        String n="";
         for (int i = 0; i <3; i++) {
         System.out.println("Digite o "+(i+1)+"º Nome:");
          String nome=sc.next();
        System.out.println("Digite a idade :");
        int idade=sc.nextInt();
        
          if(idade>menor){
            
            nomem=nome;
            m=idade;
            
            
        
        }
            if(idade<maior){
                n=nome;
                nome=n;
                menor=idade;
                
  
            }
        }
         
           System.out.println("Maior é: "+nomem.toUpperCase()+" com a idade de "+m+" Anos");
           System.out.println("Menor é: "+n.toLowerCase()+" com a idade de "+menor+" Anos");
        }
       
       
    }

