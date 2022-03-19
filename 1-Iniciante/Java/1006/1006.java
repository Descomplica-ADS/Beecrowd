package beecrowdjava1006;

import java.io.IOException;
import java.util.Scanner;

public class BeeCrowdJava1006 {

    public static void main(String[] args) throws IOException{
        
        Scanner in = new Scanner(System.in);
        float A, B, C, MEDIA;
        A = in.nextFloat();
        B = in.nextFloat();
        C = in.nextFloat();
        MEDIA = (float) (((A*2)+(B*3)+(C*5)) / 10);
        System.out.printf("MEDIA = %.1f\n",MEDIA);
                
    } 
}

