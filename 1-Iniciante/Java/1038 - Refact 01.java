import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
		int codigo, quantidade;
		
		codigo = in.nextInt();
		quantidade = in.nextInt();
		
		if(codigo == 1) System.out.printf("Total: R$ %.2f\n", (quantidade * 4.0));
		else if(codigo == 2) System.out.printf("Total: R$ %.2f\n", (quantidade * 4.50));
		else if(codigo == 3) System.out.printf("Total: R$ %.2f\n", (quantidade * 5.0));
		else if(codigo == 4) System.out.printf("Total: R$ %.2f\n", (quantidade * 2.0));
		else if(codigo == 5) System.out.printf("Total: R$ %.2f\n", (quantidade * 1.50));
	}
}
