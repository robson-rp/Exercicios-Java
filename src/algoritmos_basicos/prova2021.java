package algoritmos_basicos;

import java.util.Scanner;

public class prova2021 {
    // Primo
    private static boolean isPrimo(int n){
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0)
                counter++;
        }
        return counter == 2;
    }


    private static boolean isPar(int n){
        return n % 2 == 0;
    }

    public static boolean isPerfect(int n){
        int somaDivisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                somaDivisores += i;
            }
        }
        return (somaDivisores - n) == n;
    }
   
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (!isPrimo(i) && !isPar(i) && isPerfect(i) && (i % 3 == 0)) {
                for (int j = 1; j <= 12; j++) {
                    System.out.println(i+" x "+ j + " = " + i * j);
                }
            } 
        }
    }
}
