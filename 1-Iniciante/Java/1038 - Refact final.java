import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
        int codigo = in.nextInt();
        int quantidade = in.nextInt();
        double valor=0;
        switch(codigo){
            case(1): valor = quantidade * 4.00; break;
            case(2): valor = quantidade * 4.50; break;
            case(3): valor = quantidade * 5.00; break;
            case(4): valor = quantidade * 2.00; break;
            case(5): valor = quantidade * 1.50; break;
            default: valor = 0;
        }
        System.out.printf("Total: R$ %.2f\n", valor);
    }
 
}
