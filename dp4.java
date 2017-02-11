package D;

/**
 *
 * @author saul
 */
public class P4 {
    public static void main (String [] args) {
 for (int i=5; i>=-5; i--)
 System.out.println(i + " es positivo: " + esPositivo(i));
 }

 public static boolean esPositivo(int x) {
 if (x<0) return false;
 if (x>0) return true;
        return false;

 }
}

