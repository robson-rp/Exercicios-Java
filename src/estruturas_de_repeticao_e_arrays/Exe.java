package estruturas_de_repeticao_e_arrays;

public class Exe {
    public static void main(String[] args) {
        int tamanho = 0;
        int arr[];

        //Percorre os numeros para descobrir quantos impares tem
        for (int i = 1; i <= 49; i++) {
            if(i % 2 != 0)
                tamanho++;
        } 

        //Cria a array com o tamanho encotrado
        arr = new int[tamanho];

        // ira armazenar a ultima posicao do array que foi preenchida
        int indicePreenchido = -1; 
        
        for (int i = 0; i <= 49; i++) {
            if(i % 2 != 0){
                arr[indicePreenchido + 1] = i;
                indicePreenchido++;
            }     
        } 

        for (int i : arr) {
            System.out.println(i);
        }
    }  
}
