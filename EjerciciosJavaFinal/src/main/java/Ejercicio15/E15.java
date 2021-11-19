package Ejercicio15;

import java.util.Scanner;

public class E15 {

    public static void main(String[] args){

        Scanner capturar = new Scanner(System.in);
        System.out.println("Selecciona una opción: ");
        System.out.println("--------------------------------------");
        System.out.println("1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR\n" +
                "\n");

        boolean repetirMenu = true;

        while(repetirMenu){
            int opcion = capturar.nextInt();
            switch (opcion){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println("****** GESTION CINEMATOGRÁFICA ********\n");
                    System.out.println("1-NUEVO ACTOR\n" +
                            "2-BUSCAR ACTOR\n" +
                            "3-ELIMINAR ACTOR\n" +
                            "4-MODIFICAR ACTOR\n" +
                            "5-VER TODOS LOS ACTORES\n" +
                            "6- VER PELICULAS DE LOS ACTORES\n" +
                            "\n" +
                            "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                            "8-SALIR\n" +
                            "\n");
                    break;
                case 8:
                    System.out.println("Has abandonado del sistema");
                    repetirMenu = false;
                    break;
                default:
                    System.out.println("La opción introducida no es correcta.");
                    break;
            }

        }

    }

}
