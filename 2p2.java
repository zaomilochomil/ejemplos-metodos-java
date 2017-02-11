
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

import java.util.Scanner;

/**
 *
 * @author saul
 */
public class P2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aÃ±o;
        System.out.print("Introduce aÃ±o: ");
        aÃ±o = sc.nextInt();
        if(esBisiesto(aÃ±o))  //llamada al mÃ©todo
           System.out.println("Bisiesto");
        else
           System.out.println("No es bisiesto");
    }
     
    public static boolean esBisiesto(int a){   
        if(a%4==0 && a%100!=0 || a%400==0)
           return true;
        else
           return false;
    }
}
