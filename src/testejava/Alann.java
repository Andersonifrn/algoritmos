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
public class Alann {


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Informe o Valor do Produto:");
		double valor=sc.nextDouble();
		
		double desconto=valor*0.10;
		
		double total =valor-desconto;
		
		
		
		System.out.println("Desconto = "+desconto+"\n Total ="+total);
		
                
                
                
                
                
                
                
	}


}
