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
public class Imc {

  public static void main(String[]args){
      
      Scanner sc = new Scanner(System.in);
      double resultado=0;
      System.out.println("Digite sua Altura:");
      double x=sc.nextDouble();
      
       System.out.println("Digite seu Peso:");
      double peso=sc.nextDouble();
      
      resultado=peso/(x*x);
      
      if(resultado>24.9 && resultado<=30){
          System.out.println("Você está sobre o peso ");
          
      }
      else{
          
          if(resultado <18.5){
              System.out.println("Você está em estado de Magreza :");
          }
          else if(resultado >18.5 || resultado >=24.9){
              System.out.println("Parabéns você está de Boa Saúde");
          }
          else if(resultado>30){
              System.out.println("você está com obsidadde");
          }
      }
      
      System.out.println("Resultado do seu IMC é : "+resultado);
      
      }
    
}
