package beecrowdjava1010;

import java.io.IOException;
import java.util.Scanner;

public class BeeCrowdJava1010 {

    public static void main(String[] args) throws IOException{
     
        Scanner in = new Scanner(System.in);
        int np1, qtp1, np2, qtp2;
        float valorp1, valorp2;
        
        np1 = in.nextInt();
        qtp1 = in.nextInt();
        valorp1 = in.nextFloat();
        
        np2 = in.nextInt();
        qtp2 = in.nextInt();
        valorp2 = in.nextFloat();
        
        float valor = (float) ((qtp1 * valorp1) + (qtp2 * valorp2));
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valor);
        
    }
    
}

