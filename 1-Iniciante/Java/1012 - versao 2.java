import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        double A, B, C, resultado;
        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        C = Double.parseDouble(in.readLine());
      
        //Area do triangulo
        resultado = ((A*C)/2);
        System.out.printf("TRIANGULO: %.3f\n",resultado);
        
        //Area do circulo
        resultado = ((3.14159)*(Math.pow(C, 2)));
        System.out.printf("CIRCULO: %.3f\n",resultado);
        
       //Area do trapezio
       resultado = (((A+B)/2)*C);
        System.out.printf("TRAPEZIO: %.3f\n",resultado);
        
        //Area do qadrado
        resultado = Math.pow(B, 2);
        System.out.printf("QUADRADO: %.3f\n", resultado);
        
        //Area do retangulo
        resultado = A*B;
        System.out.printf("RETANGULO: %.3f\n", resultado);
        
    }
    
}

