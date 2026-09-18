import java.util.Scanner;

public class m_exer2{
        public static void main(String[] args){
            float a,b;
            int whichCase;
            Scanner read = new Scanner(System.in);
            System.out.println("Você deseja calcular com qual operação?");
            System.out.println("1. Soma; 2. Subtração; 3. Multiplicação; 4. Divisão");
            whichCase = read.nextInt();
            System.out.println("Digite os números separando-os inserindo a tecla enter:");
            a = read.nextInt();
            b = read.nextInt();
            
            
                    switch (whichCase) {
            case 1:
        System.out.print("O resultado é: " + calcAdd(a, b));
        break;
            case 2:
        System.out.print("O resultado é: " + calcSub(a, b));
        break;
            case 3:
        System.out.print("O resultado é: " + calcMul(a, b));
        break;
            case 4:
        System.out.print("O resultado é: " + calcDiv(a, b));
        break;
                default:
                    System.out.println("Entrada inválida.");
            }
                


        }

        public static float calcAdd(float a, float b){
            return a+b;
        }

        public static float calcSub(float a, float b){
            return a-b;
        }

        public static float calcMul(float a, float b){
            return a*b;
        }

        public static float calcDiv(float a, float b){
            return a/b;
        }
}