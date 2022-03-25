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
public class NotaAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       
        double soma2 = 0;
        double soma = 0;
     
         System.out.println("Quantidade de notas :");
         int qtd = sc.nextInt();
        for (int i = 0; i <qtd; i++) {
            System.out.println("Digite a nota do Alunos:º"+(i+1));
            double nota = sc.nextDouble();
            double notaa = sc.nextDouble();
            
           soma=soma+nota;
           soma2=soma2+notaa;
              
        }

        double media=(soma+soma2)/2 /qtd;
      
        System.out.println("A média das notas é = "+media);
    }
}
