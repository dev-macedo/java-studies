import java.util.Scanner;

public class a_exer2{
    public static void main(String[] args){
        int[] numeros = {12, 5, 23, 8, 19, 3};
        int maior, menor;
        float media = 0;
        maior = menor = numeros[0];
        
       for(int i = 0; i<numeros.length; i++){
        media += numeros[i];
        //encontre o maior número
        if(maior>numeros[i]){} 
        else{
            maior = numeros[i];
        }
        //encontre o menor número
        if(menor<numeros[i]){} 
        else{
            menor = numeros[i];
        }
       }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media / numeros.length);

    }
}