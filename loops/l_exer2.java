import java.util.Scanner;

public class l_exer2{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        int x, y;
        
        while(true){

            System.out.print("Digite a coordenada x: ");
            x = scanner.nextInt();
            System.out.print("Digite a coordenada y: ");
            y = scanner.nextInt();

            if(x == 0 || y == 0){ //verifica se é 0
                break;
            } else if (x>0 && y>0){
            System.out.println("primeiro");
            } else if(x>0 && y<0){
            System.out.println("quarto");
            } else if(x<0 && y>0){
            System.out.println("segundo");
            } else{
            System.out.println("terceiro");
            } 
            

            }
            
        }

    }
