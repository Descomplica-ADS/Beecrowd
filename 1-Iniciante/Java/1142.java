import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int contador = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                contador++;
                if (contador % 4 == 0){
                    System.out.println("PUM");
                } else {
                    System.out.print(contador + " ");
                }
            }
        }


    }
}
