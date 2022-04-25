import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double codigo, quantidade, valor;
		
		codigo = in.nextInt();
		quantidade = in.nextInt();
		
		if(codigo == 1){
		    valor = (quantidade * 4);
		    System.out.printf("Total: R$ %.2f\n",valor);
		}else if(codigo == 2){
		    valor = (quantidade * 4.50);
		    System.out.printf("Total: R$ %.2f\n",valor);
		}else if(codigo == 3){
		    valor = (quantidade * 5);
		    System.out.printf("Total: R$ %.2f\n",valor);
		}else if(codigo == 4){
		    valor = (quantidade * 2);
		    System.out.printf("Total: R$ %.2f\n",valor);
		}else if(codigo == 5){
		    valor = (quantidade * 1.50);
		    System.out.printf("Total: R$ %.2f\n",valor);
		}
	}
}
