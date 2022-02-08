package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

// 13.Escreva um programa que leia um nome de alguém e armazene
// num array com no máximo 10 posições e no final mostre o nome de trás
// pra frente.

public class Treze {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um nome");
        String nome =  s.nextLine();

        System.out.println("Nome: "+nome);
        char[] aNome = nome.toCharArray();

        String nomeRev = "";
        for (int i = aNome.length - 1; i >= 0; i--) {
            nomeRev += aNome[i];
        }

        System.out.println("Nome de tras para frente: "+ nomeRev);
        s.close();
    
    }
}
