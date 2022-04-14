package beecrowdjava1019;
import java.util.Scanner;

public class BeeCrowdJava1019{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int h, m, s;
        h = (i/60)/60;
        m = ((i/60)-(h*60));
        s = i%60;
        System.out.println(h + ":" + m + ":" + s);
   }
}
