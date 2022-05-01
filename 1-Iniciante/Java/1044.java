import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
	    int num1 = in.nextInt();
	    int num2 = in.nextInt();
	    
	    if (num1%num2 == 0) System.out.println("Sao Multiplos");
	    else if (num2%num1 == 0) System.out.println("Sao Multiplos");
	    else System.out.println("Nao sao Multiplos");
 
    }
 
}
