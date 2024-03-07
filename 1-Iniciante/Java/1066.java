public class Main {
 
 public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int contadorPar = 0;
        int contadorImpar = 0;
        int contadorNegativo = 0;
        int contadorPositivo = 0;

        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();


            if(x % 2 == 0){
                contadorPar++;
            } else if (x % 2 != 0 ) {
                contadorImpar++;
            }

            if(x > 0){
                contadorPositivo++;
            } else if (x < 0) {
                contadorNegativo++;
            }

        }


        System.out.printf("%d valor(es) par(es)\n", contadorPar);

        System.out.printf("%d valor(es) impar(es)\n", contadorImpar);

        System.out.printf("%d valor(es) positivo(s)\n", contadorPositivo);

        System.out.printf("%d valor(es) negativo(s)\n", contadorNegativo);
    }
 
}
