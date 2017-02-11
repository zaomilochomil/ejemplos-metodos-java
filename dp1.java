package D;

/**
 *
 * @author saul
 */
public class P1 {
 public static void main (String [] args){
 System.out.println("El factorial de 10 es: " + factorial(10));
 }
 public static int factorial (int n) { 
 int aux = 1; 
 for (int i = 2; i<=n; i++)
 aux *= i; 
 return aux;
 }
 }


