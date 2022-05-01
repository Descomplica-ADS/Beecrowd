import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int x = 0;
	   
	    for(int i = 1; i <= num; i++){
	    if(i % 2 == 0){
	        x = (int) Math.pow(i,2);
	        System.out.println( i + "^2 = " + x);
	        }
	    }
    }
 
}
