import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    for(int i = 1; i <=num; i++){
	    if(i % 2 != 0){
	        System.out.println(i);
	        }
	    }
    }
 
}