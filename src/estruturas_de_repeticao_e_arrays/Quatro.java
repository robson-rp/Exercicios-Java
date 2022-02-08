//Escreva um programa que insira um número e a seguir leia a quantidade
//de números de acordo ao número inserido e no final deve mostrar qual
//foi o primeiro e o último número lido e se são pares ou ímpares e se são
//divisíveis por 8.
package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;


class Quatro{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primeiroNumero = 0;
        int ultimoNumero = 0;
        int temporario = 0;
        System.out.println("Quantos numeros deseja digitar?");
        int quantidade = teclado.nextInt();

        int contador = 1;
        do {

            System.out.println("Digite o numero "+contador);
            temporario = teclado.nextInt();

            if(contador == 1) primeiroNumero = temporario;
            else if(contador == quantidade) ultimoNumero = temporario;
            contador++;
        } while (contador <= quantidade);

        System.out.println("O primeiro numero digitado foi " + primeiroNumero);
        System.out.println("O ultimo numero foi " + ultimoNumero);

        if (primeiroNumero % 2 == 0) {
            System.out.println("O primeiro numero e par ");
        }else{
            System.out.println("O primeiro numero nao e par");
        }

        if (ultimoNumero % 2 == 0) {
            System.out.println("O ultimo numero e par ");
        }else{
            System.out.println("O ultimo numero nao e par");
        }

        if (primeiroNumero % 8 == 0) {
            System.out.println("O primeiro numero e divisivel por 8 ");
        }else{
            System.out.println("O primeiro numero nao e divisivel por oito");
        }

        if (ultimoNumero % 8 == 0) {
            System.out.println("O ultimo numero e divisivel por 8 ");
        }else{
            System.out.println("O ultimo numero nao e divisivel por oito");
        }


        teclado.close();
    }
}