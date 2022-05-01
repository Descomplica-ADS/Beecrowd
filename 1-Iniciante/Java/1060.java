import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
	    int cont = 0;
	    double[] vet = new double[6];
	    vet[0] = in.nextDouble();
	    vet[1] = in.nextDouble();
	    vet[2] = in.nextDouble();
	    vet[3] = in.nextDouble();
	    vet[4] = in.nextDouble();
	    vet[5] = in.nextDouble();
	    for(double i: vet){
	     if (i > 0){
	        cont += 1;
	       }
	    }
	   System.out.println(cont + " valores positivos");
 
    }
 
}
