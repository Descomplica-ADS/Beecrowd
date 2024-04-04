import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double media = 0;
        int contador = 0;
        while(contador != 2) {
            double nota = scanner .nextDouble();
            if (nota < 0 || nota > 10){
                System.out.println("nota invalida");
            } else {
                media += nota;
                contador++;
            }
        }
        System.out.println("media = " + media / 2 );
    }
}
