import java.util.Scanner; 

public class exer2{
    
    public static void main(String[] args){
        float x,y;
        Scanner _obj = new Scanner(System.in);
        System.out.print("Digite a coordenada x:");
        x = _obj.nextFloat();
        System.out.print("Digite a coordenada y:");
        y = _obj.nextFloat();
        
        if(x==0 || y==0){
            //condições dentro do if
            if(x==y){
                System.out.println("O n34úmero está na origem");
            } else if (y==0){
                System.out.println("O número está no eixo x");
            } else{
                System.out.println("O número está no eixo y");
            }
            //fim
        }
        else if (x >= 0){
            //condições dentro do else if
           if(y < 0){
                System.out.println("O número está no quadrante 4");
            } 
            else{
                System.out.println("O número está no quadrante 1");
            }
            //fim
        } else if(x <= 0){
            //condições dentro do else if
             if(y < 0){
                System.out.println("O número está no quadrante 3");
            } 
            else{
                System.out.println("O número está no quadrante 2");
            }
            //fim
        } 
    }
}