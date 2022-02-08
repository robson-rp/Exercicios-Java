package estruturas_de_repeticao_e_arrays;

import java.util.Random;

import algoritmos_basicos.NumeroPar;
import algoritmos_basicos.NumerosPerfeitos;
import matrizes.MatrizesUtils;

// Escreva um programa que preencha um array de 20 posições de números
// inteiros e mostra quais os elementos são;
// a) Divisíveis de 5, de 3 e de 10;
// b) Quais são os números pares;
// c) Quais são os números ímpares;
// d) Quais são os números perfeitos (lembrando que um número é perfeito
// quando a soma dos seus divisores excluindo o próprio número, o
// resultado é igual ao número que queremos saber se é perfeito.)
public class E18 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[20];

        //Preenche a array com numeros aleatorios de 0 a 100
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
        }

        //mostra os elementos da array
        System.out.print("Array 1: ");
        MatrizesUtils.printArray(arr1);
        System.out.println();

        int[] divisiveisDeCincoTresEDez = divisiveisDeCincoTresEDez(arr1);
        int[] pares = numerosPares(arr1);
        int[] impares = numerosImpares(arr1);
        int[] perfeitos = numerosPerfeitos(arr1);

        //Mostra os numeros divisiveis por 5,3 e 10
        System.out.print("Numeros divisiveis por 5,3 e 10: ");
        MatrizesUtils.printArray(divisiveisDeCincoTresEDez);
        System.out.println();

        //Imprime os numeros pares
        System.out.print("Numeros pares : ");
        MatrizesUtils.printArray(pares);
        System.out.println();

        //Imprime os numeros impares
        System.out.print("Numeros impares : ");
        MatrizesUtils.printArray(impares);
        System.out.println();

        //imprime os numeros perfeitos
        System.out.print("Numeros perfeitos : ");
        MatrizesUtils.printArray(perfeitos);
        System.out.println();
    }

    private static int[] numerosPerfeitos(int[] arr1) {
        int[] perfeitos;
        int counter = 0; 
        for (int i = 0; i < arr1.length; i++) {
            if(NumerosPerfeitos.isPerfect(arr1[i])) counter++;
        }
        perfeitos = new int[counter];
        
        counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(NumerosPerfeitos.isPerfect(arr1[i])){
                perfeitos[counter] = arr1[i];
                counter++;
            }
        }
        return perfeitos;
    }

    private static int[] numerosImpares(int[] arr1) {
        int[] impares;
        int counter = 0; 
        for (int i = 0; i < arr1.length; i++) {
            if(!NumeroPar.isEvenNumber(arr1[i])) counter++;
        }
        impares = new int[counter];
        counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(!NumeroPar.isEvenNumber(arr1[i])){
                impares[counter] = arr1[i];
                counter++;
            }
        }
        return impares;
    }

    private static int[] numerosPares(int[] arr1) {
        int[] pares;
        int counter = 0; 
        for (int i = 0; i < arr1.length; i++) {
            if(NumeroPar.isEvenNumber(arr1[i])) counter++;
        }
        pares = new int[counter];
        counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(NumeroPar.isEvenNumber(arr1[i])){
                pares[counter] = arr1[i];
                counter++;
            }
        }
        return pares;
    }
    

    private static int[] divisiveisDeCincoTresEDez(int[] arr1) {
        int[] divisiveisPorCincoTresEDez;
        int counter = 0; 
        for (int i = 0; i < arr1.length; i++) {
            if((arr1[i] % 10 == 0) 
            && (arr1[i] % 10 == 0 )
             && (arr1[i] % 10 == 0)) counter++;
        }
        divisiveisPorCincoTresEDez = new int[counter];
        counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if((arr1[i] % 10 == 0) 
            && (arr1[i] % 10 == 0 )
             && (arr1[i] % 10 == 0)){
                divisiveisPorCincoTresEDez[counter] = arr1[i];
                counter++;
            }
        }
        return divisiveisPorCincoTresEDez;
    } 
}
