package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

public class Tres {
    // Escreva um programa que leia 10 números. Todos os números lidos com
    // valor inferior a 40 devem ser somados. Escreva o valor final da soma
    // efetuada.

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        int soma = 0;
        do {
            System.out.println("Digite o numero "+contador);
            int n = leitor.nextInt();

            if(n < 40) soma += n;
            contador++;
        } while (contador <= 10);

        System.out.println("A soma efetuada equivale a "+soma);
        
        leitor.close();
    }
}
