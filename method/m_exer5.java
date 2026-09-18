import java.util.Scanner;

public class m_exer5{
    public static void main(String[] args){
        double x,y,menor,maior;
        menor = maior = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o primeiro número, dê enter e digite o segundo: ");
        x = read.nextDouble();
        y = read.nextDouble();
        
        if(x==y){
            System.out.println("Os números não podem ser iguais");
            return;
        } else if(x>y){
            menor = y;
            maior = x;
        } else if(y>x){
            menor = x;
            maior = y;
        }

        if(maior - menor > 1){
            System.out.print("A soma dos números no intervalo é: " + calcRange(menor, maior));
        } else {
            System.out.print("Os números devem ter um intervalo maior do que 1");
        }
        
    }

    public static double calcRange(double menor, double maior){ 
        double resultado = 0;
        
        for(double i = menor + 1; i<maior; i++){
            resultado += i;
        }
        return resultado;
    }
}