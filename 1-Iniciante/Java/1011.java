import java.io.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        double PI = 3.14159;
        double r = Double.parseDouble(in.readLine());
        double resultado = ((4.0/3)*PI*(Math.pow(r, 3)));
        System.out.printf("VOLUME = %.3f\n",resultado);
 
       
    }
 
}
