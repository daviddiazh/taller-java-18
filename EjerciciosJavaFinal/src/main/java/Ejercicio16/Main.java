package Ejercicio16;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingresa tu nombre: ");
                String nombre = input.nextLine();
                System.out.println("Ingresa tu edad: ");
                int edad = Integer.parseInt(input.nextLine());
                System.out.println("Sexo ('H' para hombre y 'M' para mujer: ");
                char sexo = input.nextLine().charAt(0);
                System.out.println("Ingresa tu peso en kg: ");
                double peso = input.nextDouble();
                System.out.println("Ingresa tu altura en metros: ");
                double altura = input.nextDouble();

                if(i == 1){
                    Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
                    System.out.println(p1.imprimirEdad(p1.esMayorDeEdad()));
                    System.out.println(p1.imprimirIMC(p1.calcularIMC()));
                    System.out.println(p1.toString());
                } else if (i == 2) {
                    Persona p2 = new Persona(nombre, edad, sexo);
                    p2.setAltura(altura);
                    p2.setPeso(peso);
                    System.out.println(p2.imprimirEdad(p2.esMayorDeEdad()));
                    System.out.println(p2.imprimirIMC(p2.calcularIMC()));
                    System.out.println(p2.toString());
                } else {
                    Persona p3 = new Persona();
                    p3.setNombre(nombre);
                    p3.setEdad(edad);
                    p3.setSexo(sexo);
                    p3.setPeso(peso);
                    p3.setAltura(altura);
                    System.out.println(p3.imprimirEdad(p3.esMayorDeEdad()));
                    System.out.println(p3.imprimirIMC(p3.calcularIMC()));
                    System.out.println(p3.toString());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}