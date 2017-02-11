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
public class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String cadena;
        System.out.println("Este programa leerÃ¡ una cadena y solamente serÃ¡ vÃ¡lida\n"
                + "si la longitud de la cadena es menor o igual a 6, de lo contrario mandarÃ¡ un mensaje de error.");
        cadena=in.next();
       if(cadena.length()>6){
           System.out.println("Â¡CRITICAL ERROR!");
       }else{
           System.out.println("La cadena ingresada es vÃ¡lida");
       }        
    }
}
