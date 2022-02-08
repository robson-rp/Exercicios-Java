package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

/**
 * 8. Fazer um programa para mostrar os 15 primeiros termos da série de
Fibonacci. */

class Oito{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int antecessor = 0;
        int sucessor = 1;
        
        System.out.print("Quantos termos deseja mostrar? ");
        int n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(antecessor);
            sucessor += antecessor;
            antecessor = sucessor - antecessor;
        }

        teclado.close();
    }
}