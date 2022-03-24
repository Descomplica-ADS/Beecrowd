import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        
        Scanner in = new Scanner(System.in);
        
        float hora, vm, dist, litros;
        
        hora = in.nextFloat();
        vm = in.nextFloat();
        dist = hora*vm;
        litros = dist/12;
        System.out.printf("%.3f\n",litros);
 
    }
 
}
