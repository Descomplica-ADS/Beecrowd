import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
	    int num1 = in.nextInt();
	    int num2 = in.nextInt();
	    int minimo = Math.min(num1,num2);
	    int maximo = Math.max(num1,num2);
	    int x = 0;
	   
	    for(int i = minimo+1; i < maximo; i++){
	    if(i % 2 != 0){
	        x += i;
	        }
	    }
	    System.out.println(x);
    }
 
}