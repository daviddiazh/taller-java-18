package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/

public class E3 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese por favor la base y exponente para calcular el area del circulo: ");
        //String R2String = capturar.nextLine();
        double base = capturar.nextDouble();
        double exponente = capturar.nextDouble();
        final double PI = 3.1416;
        double result;

        //double R2Double = Double.parseDouble(R2String);

        result = Math.pow(base, exponente) * PI;

        System.out.println("El área del circulo es: " + result);

    }

}
