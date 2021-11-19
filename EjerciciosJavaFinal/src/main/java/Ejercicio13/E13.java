package Ejercicio13;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/

public class E13 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Quieres validar la fecha y la hora? Responde S/N");
        String respuesta = capturar.nextLine();

        LocalDateTime now = LocalDateTime.now();
        int año = now.getYear();
        int mes = now.getMonthValue();
        int dia = now.getDayOfMonth();
        int hora = now.getHour();
        int minutos = now.getMinute();
        int segundo = now.getSecond();


        if (respuesta.equalsIgnoreCase("S")){
            System.out.printf("%d-%02d-%02d %02d:%02d:%02d", año, mes, dia, hora, minutos, segundo);
        }else if(respuesta.equalsIgnoreCase("N")){
            System.out.println("Has abandonado el programa.");
        }else{
            System.out.println("Opción no valida.");
        }

    }

}
