package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

// Escreva um programa que receba uma string do usuário (máx. 20
// caracteres) e um caracter qualquer. O programa deve substituir o
// caracter por 0 caso seja encontrado no array.

public class Onze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite alguma coisa com no maximo 20 caracteres: ");
        String str = scanner.nextLine();

        System.out.print("Digite um caracter qualquer: ");
        String caracter = scanner.nextLine();

        char[] aCharacters = new char[str.length()];
        aCharacters = str.toCharArray();

        for (int i = 0; i < aCharacters.length; i++) {
            if(aCharacters[i] == caracter.charAt(0))
                aCharacters[i] = '0';
        }

        String novaString = "";
        
        for (char character : aCharacters) {
            novaString += character;
        }


        System.out.println();
        System.out.println("A string digitada: "+str);
        System.out.println("O caracter digitado: "+caracter);

        System.out.println("A string digitada depois do replace: "+novaString);
        scanner.close();
    }   
}
