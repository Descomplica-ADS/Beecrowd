import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		int codigo, quantidade;
		double valor;
		
		codigo = in.nextInt();
		quantidade = in.nextInt();
		
		switch(codigo){
		case(1):
		    valor = (quantidade * 4.0);
		    System.out.printf("Total: R$ %.2f\n",valor);
		    break;
		case(2):
		    valor = (quantidade * 4.50);
		    System.out.printf("Total: R$ %.2f\n",valor);
		    break;		
		case(3):
		    valor = (quantidade * 5.0);
		    System.out.printf("Total: R$ %.2f\n",valor);
		    break;
		case(4):
		    valor = (quantidade * 2.0);
		    System.out.printf("Total: R$ %.2f\n",valor);
		    break;
		case(5):
		    valor = (quantidade * 1.50);
		    System.out.printf("Total: R$ %.2f\n",valor);
		    break;
		}
	}
}
