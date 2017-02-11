package C;

/**
 *
 * @author saul
 */
public class P4 {
    public static void main (String [] args){
 tabla(4); 
 tabla(7);
 }
 public static void tabla (int n) { 
 System.out.println("Tabla de multiplicar del numero " + n);
 for (int i=0; i<=10; i++)
 System.out.println(n + " x " + i + " = " + producto(n,i));
 return; 
 }
 public static int producto (int a, int b) {
 return a*b;
 }

}
