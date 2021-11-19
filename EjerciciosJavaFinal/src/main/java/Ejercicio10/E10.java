package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/


public class E10 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese una frase por favor: ");
        String frase = capturar.nextLine();

        System.out.println(frase.replace(" ", ""));

    }

}
