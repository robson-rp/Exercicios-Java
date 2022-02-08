package algoritmos_basicos;

public class NumerosPerfeitos {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(isPerfect(i)) System.out.println(i);
        }        
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
}
