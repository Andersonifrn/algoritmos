/*
   Classe para mostrar os números primos
 */
package testejava;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Primos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite  um número:");
        int numero = sc.nextInt();
        int contador = 0;
        for (int i = 1; i <=numero; i++) {

            if (numero % i == 0) {
                contador++;

            }

        }

        if (contador == 2) {

            System.out.println("número primo é " + numero);
        } else {
            System.out.println(" não é primo  " + numero);
        }
    }
}
