package Ejercicio12;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/

public class E12 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingresa por favor dos palabras");
        String palabra1 = capturar.nextLine();
        String palabra2 = capturar.nextLine();


        //EL ALGORITMO COMPARA SIN IMPORTAR EL USO DE MAYUSCULAS.
        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("Las dos palabras son iguales.");
        }else{
            System.out.println("Las palabras son diferentes");
        }

    }
    

}
