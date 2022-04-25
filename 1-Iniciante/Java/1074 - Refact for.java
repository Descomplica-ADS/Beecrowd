package beecrowdjava1074;

import java.util.*;


public class BeeCrowdJava1074{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
	int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
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
