public class Main {
 
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        
        if(x % 2 == 0){
            x++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x +=2;
        }

    }
 
}
