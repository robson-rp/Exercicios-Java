package estruturas_de_repeticao_e_arrays;

import java.util.Random;

// Escreva um programa que preencha dois arrays de 20 posições de
// números inteiros e crie um terceiro array com a soma do primeiro array
// com o segundo.


public class E17 {
    static Random random = new Random();
    public static void main(String[] args) {
        int[] arr1 = new int[20];
        int[] arr2 = new int[20];
        int[] arr3 = new int[20];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(20);
        }
        System.out.print("Array 1: ");
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();

        ;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(20);
        }
        System.out.print("Array 2: ");
        for (int i : arr2) {
            System.out.print(i+" ");
        }
        System.out.println();

        arr3 = somaArrays(arr1, arr2);
        
        System.out.print("Array 3: ");
        for (int i : arr3) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static int[] somaArrays(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i] + arr2[i];
        }
        return arr;
    }
    
}
