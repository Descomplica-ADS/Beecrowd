package beecrowdjava1014;

import java.io.*;
import java.util.*;

public class BeeCrowdJava1014 {

    public static void main(String[] args) throws IOException{
        
        Scanner in = new Scanner(System.in);
      
        float A, B;
        A = in.nextFloat();
        B = in.nextFloat();
        float resultado = (float) (A / B);
        System.out.printf("%.3f",resultado);
        System.out.println(" km/l");
        
    }
    
}

