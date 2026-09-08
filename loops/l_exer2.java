import java.util.Scanner;

public class l_exer2{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        int x, y;
        
        while(true){

            System.out.println("Digite a coordenada x: ");
            x = scanner.nextInt();
            System.out.println("Digite a coordenada y: ");
            y = scanner.nextInt();

            if(x == 0 || y ==0){
                break;
            } else{
                if(x>0)
                {
                    if(y>0){
                    System.out.println("Q1");
                    break;
                    } else{
                    System.out.println("Q4");
                    break;
                    }
                }
            }
            
        }

    }
}