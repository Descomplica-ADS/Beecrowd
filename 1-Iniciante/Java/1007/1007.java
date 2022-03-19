package beecrowdjava1007;

import java.io.IOException;
import java.util.Scanner;

public class BeeCrowdJava1007 {

    public static void main(String[] args) throws IOException{
        
        Scanner in = new Scanner(System.in);
        float A, B, C, D;
        int DIFERENCA;
        A = in.nextFloat();
        B = in.nextFloat();
        C = in.nextFloat();
        D = in.nextFloat();
        DIFERENCA = (int) ((A*B)-(C*D));
        System.out.println("DIFERENCA = " + DIFERENCA);        
        
    }
    
}
