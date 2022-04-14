import java.util.Scanner;
 
public class Main {
 
       public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        
        System.out.println(valor);
        
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        
        for(int cedula : cedulas) {
            int quantidadeDeCedulas = valor / cedula;
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeDeCedulas, cedula);
            valor -= quantidadeDeCedulas * cedula;
        }
    }
}
