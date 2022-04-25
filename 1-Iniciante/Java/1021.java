package beecrowdjava1021;
import java.util.*;

public class BeeCrowdJava1021{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double valorin, qtdnotas, qtdmoedas;
        valorin = in.nextDouble();
        
        System.out.println("NOTAS:");
        qtdnotas = valorin / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", (int) qtdnotas);
	valorin %= 100;
        qtdnotas = valorin / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", (int) qtdnotas);
        valorin %= 50;
        qtdnotas = valorin / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", (int) qtdnotas);
        valorin %= 20;
        qtdnotas = valorin / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", (int) qtdnotas);
        valorin %= 10;
        qtdnotas = valorin / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", (int) qtdnotas);
        valorin %= 5;
        qtdnotas = valorin / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", (int) qtdnotas);
        System.out.println("MOEDAS:");
        valorin %= 2;
        qtdmoedas = valorin / 1.0;
        System.out.printf("%d nota(s) de R$ 1.00\n", (int) qtdmoedas);
        valorin %= 1.0;
        qtdmoedas = valorin / 0.50;
        System.out.printf("%d nota(s) de R$ 0.50\n", (int) qtdmoedas);
        valorin %= 0.50;
        qtdmoedas = valorin / 0.25;
        System.out.printf("%d nota(s) de R$ 0.25\n", (int) qtdmoedas);
        valorin %= 0.25;
        qtdmoedas = valorin / 0.10;
        System.out.printf("%d nota(s) de R$ 0.10\n", (int) qtdmoedas);
        valorin %= 0.10;
        qtdmoedas = valorin / 0.05;
        System.out.printf("%d nota(s) de R$ 0.05\n", (int) qtdmoedas);
        valorin %= 0.05;
        qtdmoedas = valorin / 0.01;
        System.out.printf("%d nota(s) de R$ 0.01\n", (int) qtdmoedas);
    }
}
