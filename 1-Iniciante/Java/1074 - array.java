import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
 
    	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
        int vet[] = new int[n];
        for(int i: vet){
            int num = in.nextInt();
            if(num == 0){
                System.out.println("NULL");
            }else if(num % 2 == 0 &&  num < 0){
                System.out.println("EVEN NEGATIVE");
            }else if(num % 2 != 0 && num < 0){
                System.out.println("ODD NEGATIVE");
            }else if(num % 2 == 0 && num > 0){
                System.out.println("EVEN POSITIVE");
            }else if(num % 2 != 0 && num > 0){
                System.out.println("ODD POSITIVE");
            }
        }
 
    }
 
}
