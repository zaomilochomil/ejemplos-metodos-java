package C;

import java.util.Scanner;

/**
 *
 * @author saul
 */
public class P2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el valor de a para evaluar");
        int a = in.nextInt();
        System.out.println("Ingrese el valor de b para evaluar");
        int b = in.nextInt();
        System.out.println("Ingrese el valor de c para evaluar");
        int c = in.nextInt();
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("El mayor de a y b es: " + mayor(a, b));
        System.out.println("El mayor de a, b y c es: " + mayor(a, b, c));
    }

    public static int mayor(int x, int y) {
        return x > y ? x : y;
    }

    public static int mayor(int x, int y, int z) {
        return mayor(mayor(x, y), z);
    }

}
