import java.util.Scanner;

public class m_exer1{
        public static void main(String[] args){
            float a,b,c,d,e;
            int whichCase;
            Scanner read = new Scanner(System.in);
            System.out.println("Você deseja calcular a média de quantos números?");
            System.out.println("2; 3; 4; 5");
            whichCase = read.nextInt();
            System.out.println("Digite os números separando-os inserindo a tecla enter:");
            a = read.nextInt();
            b = read.nextInt();

            switch (whichCase) {
    case 2:
        calcAb(a, b);
        System.out.print("A média é: " + calcAb(a, b));
        break;
    case 3:
        c = read.nextInt();
        calcAbc(a, b, c);
        System.out.print("A média é: " + calcAbc(a, b, c));
        break;
    case 4:
        c = read.nextInt();
        d = read.nextInt();
        calcAbcd(a, b, c, d);
        System.out.print("A média é: " + calcAbcd(a, b, c, d));
        break;
    case 5:
        c = read.nextInt();
        d = read.nextInt();
        e = read.nextInt();
        calcAbcde(a, b, c, d, e);
        System.out.print("A média é: " + calcAbcde(a, b, c, d, e));
        break;
                default:
                    System.out.println("Entrada inválida. Rode o programa novamente e tente de novo.");
            }

        }

        public static float calcAb(float a, float b){
            return (a+b) / 2;
        }

        public static float calcAbc(float a, float b, float c){
            return (a+b+c) / 3;
        }

        public static float calcAbcd(float a, float b, float c, float d){
            return (a+b+c+d) / 4;
        }

        public static float calcAbcde(float a, float b, float c, float d, float e){
            return (a+b+c+d+e) / 5;
        }
}