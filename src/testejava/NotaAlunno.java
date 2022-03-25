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
public class NotaAlunno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantidade na altura : ");
        int x=sc.nextInt();
          System.out.print("Digite quantidade na base : ");
         int h=sc.nextInt();
        
        for (int i = 0; i < x; i++) {
            
           
            for (int j = 0; j< h; j++) {
             System.out.print("*");
            }
            System.out.println("*");
        }
    }

}
