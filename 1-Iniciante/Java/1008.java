package beecrowdjava1008;

import java.io.IOException;
import java.util.Scanner;

public class BeeCrowdJava1008 {

    public static void main(String[] args) throws IOException{
        
        Scanner in = new Scanner(System.in);
        float VALOR, SALARY;
        int NUMBER, HOURS;
        NUMBER= in.nextInt();
        HOURS = in.nextInt();
        VALOR = in.nextFloat();
        SALARY = (VALOR*HOURS);
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);        
        
    }
    
}

