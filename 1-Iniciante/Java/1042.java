import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int x, y, z, num1, num2=0, num3=0;
	x = in.nextInt();
	y = in.nextInt();
	z = in.nextInt();
	num1 = Math.min(x, Math.min(y,z));
	
	if (num1 == x){
	    num2 = Math.min(y,z);
	    num3 = Math.max(y,z);
	}else if (num1 == y){
	    num2 = Math.min(x,z);
	    num3 = Math.max(x,z);
	}else if (num1 == z){
	    num2 = Math.min(x,y);
	    num3 = Math.max(x,y);
	}
	System.out.print(num1 + "\n" + num2 + "\n" + num3 + "\n\n");
	System.out.print(x + "\n" + y + "\n" + z + "\n");
	}
}