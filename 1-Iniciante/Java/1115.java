import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x > 0 && y > 0){
                System.out.println("primeiro");
            }else if (x < 0 && y > 0){
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else {
                break;
            }
        }
    }
}


/*
Os quatros quadrantes:

Primeiro Quadrante
Valores: ( x ) positivo, ( y ) positivo.
Segundo Quadrante
Valores: ( x ) negativo, ( y ) positivo.
Terceiro Quadrante
Valores: ( x ) negativo, ( y ) negativo.
Quarto Quadrante
Valores: ( x ) positivo, ( y ) negativo.

 */
