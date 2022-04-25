package beecrowdjava1031;

import java.util.*;

// x²+bx+c=0  // formula de bhaskara: x = -b +- raiz delta / 2a  // delta = b² - 4ac

public class BeeCrowdJava1031{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
	double a, b, c, delta, R1, R2;
	a = in.nextDouble();
	b = in.nextDouble();
	c = in.nextDouble();
	delta = Math.pow(b,2)-(4*a*c);
	
	if ((a == 0) || (delta < 0)){
	    System.out.println("Impossivel calcular");
	}else{
            
	R1 = (-b + (Math.sqrt(delta))) / (2*a);
        R2 = (-b - (Math.sqrt(delta))) / (2*a);
        
        System.out.printf("R1 = %.5f \nR2 = %.5f \n", R1, R2);
       }
    }
}
