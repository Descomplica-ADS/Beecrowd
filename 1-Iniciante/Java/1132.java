import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int menor = 0;
        int maior = 0;

        int somatoria = 0;

        if(x > y){
             menor = y;
             maior = x;
        } else {
             menor = x;
             maior = y;
        }


        for(int i = menor ; i <= maior; i++){
            if(i % 13 != 0){
                somatoria += i;
            }
        }

        System.out.println(somatoria);
    }
}
