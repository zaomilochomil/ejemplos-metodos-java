package C;

import java.util.Scanner;

/**
 *
 * @author saul
 */
public class P3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Â¿Factorial de quÃ© nÃºmero desea calcular?");
        int k = in.nextInt();
        
        for (int j = 0; j <= k; j++) {
            System.out.println(k + "! = " + factorial(k));
            k--;
        }
    }

    public static long factorial(int n) {
        long aux = 1;
        for (int i = 2; i <= n; i++) {
            aux *= i; 
        }
        return aux;
    }
}
