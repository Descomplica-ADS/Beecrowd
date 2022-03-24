package beecrowdjava1013;

import java.io.*;
import java.util.*;

public class BeeCrowdJava1013 {
  
    public static void main(String[] args) throws IOException{
        
      Scanner in = new Scanner(System.in);
      
       int A, B, C, resposta, absoluto;
       A = in.nextInt();
       B = in.nextInt();
       C = in.nextInt();
       absoluto = (int) (((A+B + Math.abs(A-B))/ 2));
       resposta = (absoluto > C)?absoluto:C; 
       System.out.println(resposta + " eh o maior");
       System.out.println(((Object)absoluto).getClass().getSimpleName());
    
    }
    
}

