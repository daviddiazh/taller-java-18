package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/

public class E14 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numeroIngresado;
        numeroIngresado = capturar.nextInt();

        while(numeroIngresado <= 1000){
            if(numeroIngresado % 2 == 0){
                System.out.println(numeroIngresado);
                numeroIngresado+=2;
            }
        }

    }

}
