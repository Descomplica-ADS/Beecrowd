public class SequenciaIJ3 {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        for (int i = 1; i <= 9; i+=2) {
            for (int j = x; j >= y ; j--) {
                System.out.print("I=" + i + " ");
                System.out.println("J=" +j);
            }
            x += 2;
            y += 2;
        }
    }
}
