package A;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saul
 */
public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Este programa recibirÃ¡ dos edades de personas\n"
                + "e identificarÃ¡ Â¿QuÃ© edad es mayoR?");
        System.out.println("Ingrese la primer edad");
        int ed1=in.nextInt();
        System.out.println("Ingrese la segunda edad");
        int ed2=in.nextInt();
        if(ed1>ed2){
            System.out.println("La primera edad es mayor que la segunda");
        }else{
            System.out.println("La segunda edad ingresada es mayor");
        }
    }
    
}
