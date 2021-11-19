package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/

public class E1 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int num1 = capturar.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = capturar.nextInt();

        if(num1 > num2){
            System.out.println("El número mayor es el: " + num1);
        }
        if(num2 > num1){
            System.out.println("El número mayor es el: " + num2);
        }if(num1 < num2){
            System.out.println("El número menor es el: " + num1);
        }if(num2 < num1){
            System.out.println("El número menor es el: " + num2);
        }if(num1 == num2){
            System.out.println("Son iguales.");
        }

    }

}
