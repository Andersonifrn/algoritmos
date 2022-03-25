/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Java {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         //ArrayList de String para nome;
        ArrayList <String> nome = new ArrayList<>();
       //Digita os nomes;
        System.out.println("Digite Quantidade de  Nomes:");
       
        int x = sc.nextInt();
        //pecorrendo arraylist;
        for (int i = 0; i < x; i++) {
            
               
          System.out.println("Digite os Nomes: º"+i);
             //lieto para digita os nomes;  
          String a=sc.next();
               //adicionado n o arrayList;
                nome.add(a);
              //mostrar os nomes; 
            System.out.println("Nomes  "+nome.toString());
            
            
           
        }
          //Pergunta caso quera remove;
          System.out.println("Deseja remover :");
          //leito para remover;
          String n=sc.next();
             
          //condição para remove;
            if(n.equalsIgnoreCase("sim")){
                
                 System.out.println("Digite Número que quer remover :");
              //lieto para num digita o numero que que remover;
                 int num = sc.nextInt();
              
              //removendo o conteúdo do index ;
                nome.remove(num);
            }
            else {
                
                System.out.println("Não desejo remover!");
            }
          
            
            
            
            
            
            
            
            
            //Pergunta se deseja limpar
             System.out.println("Deseja Limpar :");
           //leito para limpar
             String limp=sc.next();
             //condição para limpar
            if(limp.equalsIgnoreCase("sim")){
    
                 // limpando o arrayList
                 //método para limpar aqui em baixo;
                nome.clear();
            }
            else {
                
                System.out.println("Não desejou limpar!");
            }
             
            
            
            
            
            
            //Questão para buscar index;
             System.out.println("Deseja Buscar pelo Index :");
            //leito para buscar index
             String index=sc.next();
            //condiçao para buscar index;
              if(index.equalsIgnoreCase("sim")){
                  
                 System.out.println("Digite index que quer Buscar :");
                 //leito para buscar index
                 int num = sc.nextInt();
              
              //buscando o conteúdo pelo index ;
                  System.out.println(" index da buscar "+num+" é "+nome.get(num));
            }else{
                  System.out.println("Não Quiser Buscar Index!");
              }
              
              
              
              
              //questão para buscar o nome pelo index
               System.out.println("Deseja Buscar o index do nome :");
             //leito para buscar nome ;
               String of=sc.next();
             //condiçao para buscar nome pelo index
            if(of.equalsIgnoreCase("sim")){
                 System.out.println("Digite nome que deseja buscar  :");
               
                 String num = sc.next();
              
              // Buscar conteúdo pelo nome ou número;
                System.out.println(nome.indexOf(num));
            }
            else {
                
                System.out.println("NÃO DESEJO BUSCAR O INDEX!");
            }
      
            
            
            
            
            
            
            
            //forecth ;
         for (String integer : nome) {
            
        }
     
        System.out.println("Tmanho do ArrayList é : "+nome);
        
        // mostrando o tamanho do arraylist
        System.out.println("Tamanho do ArrayList é "+nome.size());
        
        // identificar se está vazio
        System.out.println(nome.isEmpty());
    }
    
    
}
