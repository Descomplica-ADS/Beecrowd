public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();

            if(x % 2 == 0){
                contador++;
            }
        }

        System.out.printf("%d valores pares\n", contador);
    }
 
}
