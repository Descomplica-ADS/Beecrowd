import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x == y){
                break;
            }

            if(x < y){
                System.out.println("Crescente");
            } else if(x > y){
                System.out.println("Decrescente");
            }
        }

    }

}
