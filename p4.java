package A;

import java.util.Scanner;

/**
 *
 * @author saul
 */
public class P4 {
    public void sumadigitos(int numero[])
    {
        int num[]=new int[4];
        for(int j=0;j<numero.length;j++)
        {
            num[j]=numero[j];
        }
        int sumas[]=new int[4];
        int i;
        for ( i = 0; i < numero.length; i++) {
            while (numero[i] > 0) {
                sumas[i] += numero[i] % 10;
                numero[i] = numero[i] / 10;
            }
        }
        int posicion = 0;
        int aux=sumas[0];
        for( i=1;i<sumas.length;i++)
        {
            if(aux<sumas[i])
            {
                aux=sumas[i];
                posicion=i;
            }
        }
        System.out.println("En la posicion.- "+posicion);
        System.out.println("Esta el numero.- "+num[posicion]);
        System.out.println("Cuyos digitos suman.- "+aux+" el cual es mayor a los demas.");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int numero[]=new int[4];
        System.out.println("Ingrese 10 numeros: ");
        for(int i=0;i<numero.length;i++)
        {
            System.out.print("Numero "+i+".- ");
            numero[i]=in.nextInt();
        }
        P4 total=new P4();
        total.sumadigitos(numero);
        
    }
}
