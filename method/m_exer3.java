import java.util.Scanner;

public class m_exer3{
    public static void main(String[] args){
        int x;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número: ");
        x = read.nextInt();
        if(x == 0){
        System.out.println("Neutro");
        }else{
        System.out.println(isPositive(x));
        }
    }

    public static int isPositive(int x){
        if (x<0){
            x = 0;
        } else if(x>0){
            x = 1;
        }

        return x;
        
    }
}