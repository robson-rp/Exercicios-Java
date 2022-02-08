package estruturas_de_repeticao_e_arrays;

import algoritmos_basicos.NumerosPrimos;

/**
 * 9. Escreva um programa que preenche um array de 20 posições e mostre no
    final:
    a) O maior valor do array;
    b) O menor valor do array
    c) A média dos valores;
    d) Os valores em ordem crescente;
    e) Os valores primos que estão contidos no array.
 */
public class Nove {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
           array[i] = (int)(Math.random() * 20); 
        }

        System.out.print("Valores preenchidos aleatoriamente: ");
        for (int i : array) {
            System.out.print(i +", ");
        }
        System.out.println();

        //a) o maior numero da array
        System.out.println("Numero maior : " + numeroMaior(array));

        //b) O menor valor do array
        System.out.println("Numero menor : " + numeroMenor(array));

        //c) A média dos valores;
        System.out.println("Media : " + mediaArray(array));

        //d) Os valores em ordem crescente;
        System.out.print("Valores em ordem crescente: ");
        ordenarArray(array);
        for (int i : array) {
            System.out.print(i + ", ");
        }

        System.out.println();

        //e) Os valores primos que estão contidos no array.
        System.out.print("Valores primos: ");
        for (int i : array) {
            if(NumerosPrimos.isPrimo(i))
                System.out.print(i + ", ");
        }

        System.out.println(); 
    }


    private static int numeroMaior(int[] arr){
        int maior = arr[0];
        for (int i : arr) {
            if(i > maior)
                maior = i;
        }
        return maior;
    }

    private static int numeroMenor(int[] arr){
        int menor = arr[0];
        for (int i : arr) {
            if(i < menor)
                menor = i;
        }
        return menor;
    }

    private static float mediaArray(int[] array){
        int soma = 0;
        for (int i : array) {
            soma += i;
        }
        return soma/array.length;
    }


    private static void ordenarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] < array[j])
                    troca(array, i, j);
            }
        }
    } 

    private static void troca(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
