package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 **/

public class E7 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int datoIngresado = capturar.nextInt();

        if(datoIngresado >= 0){
            do {

                System.out.println("El número " + datoIngresado +" ingresado efectivamente es mayor o igual a cero.");

            }while (datoIngresado >= 0);
        }else if(datoIngresado < 0){
            System.out.println("El número ingresado no es mayor o igual a 0, por favor intenta de nuevo.");
            System.out.println("Ingrese un número: ");
            datoIngresado = capturar.nextInt();
        }

    }

}
