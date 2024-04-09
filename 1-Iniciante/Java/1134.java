import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(codigo != 4){
            codigo = scanner.nextInt();
            if(codigo == 1){
                alcool++;
            } else if (codigo == 2){
                gasolina++;
            } else if (codigo == 3){
                diesel++;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
