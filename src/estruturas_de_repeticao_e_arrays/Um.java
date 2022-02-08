package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;


public class Um {
// Escrever um programa para ler um número inteiro do usuário e exibir o 
// maior número primo que seja menor do que o número digitado;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = teclado.nextInt();

        for (int i = numero; i > 0; i--) {
            if(isPrimo(i)){
                System.out.println(i);
                break;
            }
        }

        teclado.close();
    }

    public static boolean isPrimo(int n){
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                flag++;
            }
        }
        return flag == 2;
    }
}
