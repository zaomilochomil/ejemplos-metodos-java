package D;

/**
 *
 * @author saul
 */
public class P3 {
    public static void main (String [] args) {
 System.out.println("Tabla de multiplicar del 5");
 for (int i=0; i<=10; i++)
 System.out.println("5 x " + i + " = " + producto(5,i));
 }
 public static int producto (int a, int b) {
 return a*b;
 }

}
