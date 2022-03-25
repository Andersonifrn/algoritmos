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
public class Genero {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Genero:");
        String nome=sc.next();
        
        if(nome.equalsIgnoreCase("M")){
            System.out.println("Sexo Masculino");
        }
        else{
            if(nome.equalsIgnoreCase("f")){
                System.out.println("Sexo Feminino");
            }
            else{
                System.out.println("Sexo Invalido!");
            }
        }
        
    }
}
