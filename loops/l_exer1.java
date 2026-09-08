import java.util.Scanner;

public class l_exer1{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int tryPassword, truePassword = 2002;
        
        while(true){
            System.out.print("Digite sua senha por favor: ");
            tryPassword = scanner.nextInt();
            
            if(tryPassword == truePassword){
                break;
            } else{
                System.out.println("Senha Inválida.");
            }
        }
       
        System.out.println("Acesso Permitido.");
    }
}