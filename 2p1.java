package B;

import java.util.Scanner;

/**
 *
 * @author saul
 */
public class P1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer nÃºmero: ");
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo nÃºmero: ");
        numero2 = sc.nextInt();
        resultado = sumar(numero1, numero2);
        System.out.println("Suma: " + resultado);
    }
    public static int sumar(int a, int b){
           int c;
           c = a + b;
            return c;
    }
}
