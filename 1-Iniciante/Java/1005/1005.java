package beecrowdjava1005;

import java.io.IOException;
import java.util.Scanner;

public class BeeCrowdJava1005 {

    public static void main(String[] args) throws IOException{
        
        Scanner in = new Scanner(System.in);
        float A, B, MEDIA;
        A = in.nextFloat();
        B = in.nextFloat();
        MEDIA = (float) (((A*3.5)+(B*7.5)) / 11);
        System.out.printf("MEDIA = %.5f\n",MEDIA);
        
     }
    
}
