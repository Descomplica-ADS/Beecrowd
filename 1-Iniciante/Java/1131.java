import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menssagem = 1;
        int grenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;


        while(menssagem == 1) {
            int golsInter = scanner.nextInt();
            int golsGremio = scanner.nextInt();

            if(golsInter > golsGremio){
                vitoriasInter++;
            } else if(golsGremio > golsInter){
                vitoriasGremio++;
            } else{
                empates++;
            }


            System.out.println("Novo grenal (1-sim 2-nao)");
            menssagem = scanner.nextInt();
            grenais++;

         

        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);
        
         if(vitoriasInter > vitoriasGremio){
                System.out.println("Inter venceu mais");
            } else if (vitoriasGremio > vitoriasInter) {
                System.out.println("Gremio venceu mais");
            } else {
                System.out.println("Nao houve vencedor");
            }
    }
}
