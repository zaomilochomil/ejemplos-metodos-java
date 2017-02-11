package B;

import java.util.Scanner;

/**
 *
 * @author saul
 */
public class P5 {
    public void suma(int a, int b){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        a=in.nextInt();
        System.out.println("Ingrese el valor de b");
        b=in.nextInt();
        int suma = a+b;
        System.out.println("El resultado es: "+suma);
    }
    public void resta(int a, int b){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        a=in.nextInt();
        System.out.println("Ingrese el valor de b");
        b=in.nextInt();
        int resta = a-b;
        System.out.println("El resultado de la resta es: "+resta
        );
    }
    public static void main(String[] args) {
        P5 su=new P5();
        Scanner in = new Scanner(System.in);
        System.out.println("Â¿QuÃ© desea hacer?\n"
                + "[1]Suma\n"
                + "[2]Resta");
        int op=in.nextInt();
        if(op==1){
            su.suma(op, op);
        }else{
            su.resta(op, op);
        }
    }
}
