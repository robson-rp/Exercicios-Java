package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

public class Dois {
// Escrever um programa que solicita a idade de várias pessoas e imprima:
//      a) O Total de pessoas com menos de 21 anos;
//      b) O Total de pessoas com mais de 50 anos. O programa só termina
// quando idade for igual a -1.
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int idade = 0;
        int iMenoresQ21 = 0;
        int iMaioresQ50 = 0;
        do {
            System.out.print("Digite uma idade: ");
           idade = reader.nextInt();

            if(idade < 21) iMenoresQ21++;
            if(idade > 50) iMaioresQ50++;

        } while (idade != -1);

        System.out.println("O numeros de pessoas menores de 21 = " + iMenoresQ21);
        System.out.println("O numeros de pessoas maiores de 50 = " + iMaioresQ50);

        reader.close();
    }
}
