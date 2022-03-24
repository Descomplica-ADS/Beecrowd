package beecrowdjava1015;

import java.io.*;
import java.util.*;

public class BeeCrowdJava1015 {

    public static void main(String[] args) throws IOException{
        
        Scanner in = new Scanner(System.in);
      
        double x1, y1, x2, y2, dist;
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        
        dist = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
        System.out.printf("%.4f\n",dist);
    }
    
}

