import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        int anos = valor / 365;
        int mes = (valor % 365)/30;
        int dias = valor - (anos*365) - (mes*30);
        
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dias);
        
    }
 
}
