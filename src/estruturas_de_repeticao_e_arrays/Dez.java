package estruturas_de_repeticao_e_arrays;
//Escreva um programa que preenche um array de 30 posições, e peça para

//o utilizador introduzir um outro número a parte. E no final mostrar:
//a) A quantidade e os respectivos números inferiores ao número
//introduzido a parte;
//b) A quantidade e os respectivos números superiores ao número
//introduzido a parte;
//c) Quantas vezes o número a parte introduzido aparece no array,
//mostrar também as respectivas posições em que aparecem.

import java.util.Scanner;

public class Dez {
    public static void main(String[] args) {
        System.out.print("===========================================================");
        System.out.print("==================================================");
        System.out.println();
        Scanner tec = new Scanner(System.in);
        int contador = 0;
        int[] myArray = new int[30];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        System.out.print("Introduza um numero: ");
        int num = tec.nextInt();

        System.out.print("Valores do array: ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Voce digitou o número: " + num);
        System.out.print("Os numero menores do que " + num + " são:");
        for (int i : myArray) {
            if (i < num) {
                System.out.print(i + " ");
                contador++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("No total são " + contador + " numeros menores de " + num);

        System.out.println();
        System.out.println();

        contador = 0;
        System.out.print("Os numero maiores do que" + num + " são:");
        for (int i : myArray) {
            if (i > num) {
                System.out.print(i + " ");
                contador++;
            }
        }
        System.out.println();
        System.out.println("No total são " + contador + " numeros maiores de " + num);

        contador = 0;
        for (int i : myArray) {
            if (i == num) {
                contador++;
            }
        }
        System.out.println("O numero digitado aparece " + contador + " vezes na array");
        System.out.println();
        if (contador > 0) {
            System.out.print("O numero aparece nas posicoes: ");

            for (int i = 0; i < myArray.length; i++) {
                if (num == myArray[i])
                    System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.print("===========================================================");
        System.out.print("==================================================");

        tec.close();
    }

}
