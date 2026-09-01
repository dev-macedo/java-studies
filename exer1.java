import java.util.Scanner; 
import java.util.Arrays;

public class Main{

   public static double[] calc (double a, double b, double c){
        double areaTriRet, areaCir, areaTra, areaQua, areaRet;

        areaTriRet = (a * b)/2;
        areaCir = c * c * 3.14159;
        areaTra = ((a+b)*c)/2;
        areaQua = b*b;
        areaRet = a*b;
        
        return new double[]{areaTriRet, areaCir, areaTra, areaQua, areaRet};

    }

    public static void main(String[] args){
        double a,b,c;

        Scanner _input = new Scanner(System.in);
        System.out.print("Insira o valor de a: ");
        a = _input.nextDouble();
        System.out.print("Insira o valor de b: ");
        b = _input.nextDouble();
        System.out.print("Insira o valor de c: ");
        c = _input.nextDouble();
        System.out.println("Área triângulo-retângulo --- Circulo --- Trápezio --- Quadrado --- Retângulo");
        System.out.println(Arrays.toString(calc(a,b,c)));
    
    }


}