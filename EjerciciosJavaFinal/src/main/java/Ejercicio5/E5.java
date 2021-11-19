package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/

public class E5 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese por favor el precio del producto: ");
        double precio = capturar.nextDouble();
        final double iva = 0.21;
        double valorIva = precio * iva;
        double valorTotal = precio + valorIva;
        System.out.println("El precio total + IVA es: " + valorTotal);

    }

}
