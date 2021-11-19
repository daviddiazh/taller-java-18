package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/

public class E8 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingresa por favor el número que corresponde al día de la semana:");
        int diaSemana = capturar.nextInt();

        switch (diaSemana){

            case 1:
                System.out.println("El lunes (1) SI es un día laboral.");
                break;

            case 2:
                System.out.println("El martes (2) SI es un día laboral.");
                break;
            case 3:
                System.out.println("El mmiercoles (3) SI es un día laboral.");
                break;
            case 4:
                System.out.println("El jueves (4) SI es un día laboral.");
                break;
            case 5:
                System.out.println("El viernes (5) SI es un día laboral.");
                break;
            case 6:
                System.out.println("El sabado (6) NO es un día laboral.");
                break;
            case 7:
                System.out.println("El DOMINGO (6) NO es un día laboral.");
                break;
            default:
                System.out.println("Verifica por favor el día de la semana ingresado.");
                break;

        }

    }

}
