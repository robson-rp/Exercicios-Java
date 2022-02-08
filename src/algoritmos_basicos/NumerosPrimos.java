package algoritmos_basicos;

public class NumerosPrimos {
    //Primos de 1 - 299

    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 299; i++) {
            if(isPrimo(i)) System.out.println(i);
        }
    }

    public static boolean isPrimo(int n){
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter == 2;
    }
}
