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
public class soma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        for (int i = 0; i <=5; i++) {
          //  System.out.println("Digite o :º" + (i + 1));
            //  double n=sc.nextDouble();

            soma = soma+i;
            System.out.println(soma);
        }
        System.out.println(soma);
    }

}
