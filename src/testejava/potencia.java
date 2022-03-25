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
public class potencia {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a potência");
        int p=sc.nextInt();
        System.out.println("Digite a base");
        int b=sc.nextInt();
        int cont=1;
        for (int i = 0; i < p; i++) {
            
            cont=cont*b;
        }
        System.out.println("resultdo é "+cont);
    }
}
