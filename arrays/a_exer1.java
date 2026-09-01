import java.util.Scanner;

import java.util.Scanner;

public class a_exer1 {

    // O array recebido e o retorno agora são float
    public static float calc(float scores[]) {
        float total = 0;
        int tamanho = scores.length; // Mantido como int pois representa o tamanho do array
        
        for (int i = 0; i < tamanho; i++) {
            total += scores[i];
        }
        
        return total /= tamanho;
    }

    public static void main(String[] args) {
        Scanner _obj = new Scanner(System.in);
        
        System.out.print("Quantas notas são?: ");
        int notas = _obj.nextInt(); // Mantida como int
        
        // Array modificado para guardar floats
        float[] scores = new float[notas]; 
        
        for (int i = 0; i < notas; i++) {
            System.out.print("digita ai: ");
            scores[i] = _obj.nextFloat(); // Lendo a entrada do usuário como float
        }
        
        System.out.println("A média final é: " + calc(scores));
    }
}