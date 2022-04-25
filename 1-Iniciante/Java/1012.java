import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        
       Scanner in = new Scanner(System.in);
        
        float A = in.nextFloat();
        float B = in.nextFloat();
        float C = in.nextFloat();
        float resultado = ((A*C)/2);
        System.out.printf("TRIANGULO: %.3f\n",resultado);
        float resultado2 = (float) ((3.14159)*(Math.pow(C, 2)));
        System.out.printf("CIRCULO: %.3f\n",resultado2);
        float resultado3 = (((A+B)/2)*C);
        System.out.printf("TRAPEZIO: %.3f\n",resultado3);
        float resultado4 = (float) Math.pow(B, 2);
        System.out.printf("QUADRADO: %.3f\n", resultado4);
        float resultado5 = A*B;
        System.out.printf("RETANGULO: %.3f\n", resultado5);
        
 
    }
 
}
