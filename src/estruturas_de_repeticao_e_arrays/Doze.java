package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

// Escreva um programa que recebe um nome no teclado e armazene em
// um array de no máximo 30 posições e mostre no final quantas letras “a”
// existem no nome e as suas respectivas posições.

public class Doze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome");
        String nome = scanner.nextLine();

        char[] aStr = new char[30];
        aStr = nome.toCharArray();

        int contador = 0;
        for (char x : aStr) {
            if(x == 'a')
                contador++;
        }

        System.out.println("A letra \"a\" aparece "+contador+" vezes");
        System.out.print("A letra \"a\" aparece nas posicoes: ");
        
        for (int i = 0; i < aStr.length; i++) {
            if (aStr[i] == 'a') {
                System.out.print(i+" ");
            }
        }
        
        System.out.println();
        scanner.close();
    }
}
