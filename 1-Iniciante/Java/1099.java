import java.util.Scanner;
public class Main {
 
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            somarImpares(x, y);
        }

    }

    public static void somarImpares(int x, int y){

        int maior = 0;
        int menor = 0;
        int soma = 0;

        if(x > y){
            maior = x;
            menor = y;
        } else {
            maior = y ;
            menor = x;
        }
            for (int j = menor+1; j < maior; j++) {
                if(j % 2 != 0){
                    soma+=j;
                }
            }

        System.out.println(soma);
    }
 
}
