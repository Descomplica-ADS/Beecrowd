import java.util.Arrays;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
		int x, y, z;
		int[] vet = new int[3];
		vet[0] = in.nextInt();
		vet[1] = in.nextInt();
		vet[2] = in.nextInt();
		x = vet[0];
		y = vet[1];
		z = vet[2];
		
	    Arrays.sort(vet);
		for(int vet2: vet){
		    System.out.println(vet2);
		}
		System.out.println("");
		System.out.print(x + "\n" + y + "\n" + z + "\n");
    }
 
}