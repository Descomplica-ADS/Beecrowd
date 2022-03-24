package beecrowdjava1002;

import java.util.Scanner;
import java.io.IOException;

public class BeeCrowdJava1002 {

    public static void main(String[] args) throws IOException{
       
        Scanner in = new Scanner(System.in);
                  
        double n = 3.14159;
        double raio = in.nextDouble();
        double A = (n * (Math.pow(raio,2)));
        System.out.printf("A=%.4f\n",A);
        
        
    }
    
}
