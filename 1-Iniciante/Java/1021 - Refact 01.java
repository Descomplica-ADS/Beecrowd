package beecrowdjava1021;
import java.util.*;

public class BeeCrowdJava1021{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double valor = in.nextDouble();

	double[] cedulas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
	for(double cedula : cedulas) {
            double qtdcedulas = valor / cedula;
            System.out.printf("%d nota(s) de R$ %.2f\n", (int) qtdcedulas, cedula);
            valor %= cedula;
        }
	System.out.println("MOEDAS:");
    	for(double moeda : moedas) {
            double qtdmoedas = valor / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", (int) qtdmoedas, moeda);
            valor %= moeda;
	}
        
    }
}
