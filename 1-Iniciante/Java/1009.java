package beecrowd 1009;

import java.io.IOException;
import java.util.Scanner;

	public class BeeCrowdJava 1009{
		public static void main (String[] args){
			Scanner in = new Scanner(System.in);
			String nome = in.nextLine();
			Double salario = in.nextDouble();
			Double vendas = in.nextDouble();
			Double TOTAL = ((vendas * 0.15)+salario);
			System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
				
		}	
	
	}
	
