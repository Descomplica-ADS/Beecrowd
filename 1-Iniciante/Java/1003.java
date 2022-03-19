package beecrowdjava1003;

import java.io.IOException;
import java.util.Scanner;

public class BeeCrowdJava1003 {

    public static void main(String[] args) throws IOException{
        
        Scanner in = new Scanner(System.in);
        int A, B, X;
        A = in.nextInt();
        B = in.nextInt();
        X = (A + B);
        System.out.println("SOMA = " + X);
     }
    
}
