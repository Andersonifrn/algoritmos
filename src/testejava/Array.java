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
public class Array {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        //Uma Arraylist  de String ;
        
        ArrayList<String>  agenda = new ArrayList<> ();
       agenda.add("Anderson, 992218039, Estudante");
       agenda.add("Pedro, 992218039, Estudante");
       agenda.add("Zezinho, 992218039, Estudante");
       agenda.add("Marcos, 992218039, Estudante");
       agenda.add("Jonas, 992218039, Estudante");
       
       //Váriavel i do for;
       int i;
       
       //A variável h pegando o tomanho do ArrayList;
        int h=agenda.size();
        System.out.println("Tamanho do ArrayList é :"+h);
        
        //Um for para pecorrer o arraylist;
        for ( i = 0; i < h; i++) {
            
            System.out.println(" Percorrendo "+i+ "  "+agenda.get(i));
        }
        //Pegando a posição para remover ;
         System.out.printf("\nInforme a posição a ser excluída:\n");
         
         i = ler.nextInt();

    try {
        //metodo para remover;
      agenda.remove(i);
    } catch (IndexOutOfBoundsException e) {
        // exceção lançada para indicar que um índice (i)
        // está fora do intervalo válido (de 0 até agenda.size()-1)
        System.out.printf("\nErro: posição inválida (%s).",
          e.getMessage());
    }
     
        
    }

    void setNome(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
