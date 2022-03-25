/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.util.ArrayList;

/**
 *
 * @author ander
 */
public class Testee {
    
    public static void main(String[] args) {
    
        ArrayList <String> nomes = new ArrayList<>(); 
     
         nomes.add("Matricula : 123556565");
        System.out.println(nomes.toString());
         
        
        
        Aluno al = new Aluno();
        al.setNome("Anderson");
        al.getNome();
        al.setMatricula(342434);
        al.getMatricula();
        
         Aluno a = new Aluno();
        al.setNome("Andreia");
        al.getNome();
        al.setMatricula(123453);
        al.getMatricula();
        
        Turma tm = new  Turma();
        tm.turma(2);
       
        tm.matricular(al);
        tm.matricular(al);
     
       
    }
}
