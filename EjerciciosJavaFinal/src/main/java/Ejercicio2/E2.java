package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/


public class E2 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de números que quiere evaluar: ");

        int numero = capturar.nextInt();
        int array[] = new int[numero];

        for(int i = 0; i < array.length; i++){
            System.out.println("Ingrese el número en la posición " + ( i + 1 ) + ":");
            array [i] = capturar.nextInt();
        }

        int mayor, menor;
        mayor = menor = array [0];

        for(int i = 0; i < array.length; i++){
            if(array [i] > mayor) {
                mayor = array[i];
            }else if(array[i] < menor){
                menor = array[i];
            }
        }
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);

    }

}
