package Ejercicio17;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisiones = 0;
        double contadorElemento = 0;

        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];

        listaElectrodomesticos[0] = new Electrodomestico();
        listaElectrodomesticos[1] = new Electrodomestico(150, 25);
        listaElectrodomesticos[2] = new Electrodomestico(300,"blanco", 'A', 30);
        listaElectrodomesticos[3] = new Lavadora();
        listaElectrodomesticos[4] = new Lavadora(200, 50);
        listaElectrodomesticos[5] = new Lavadora(120, "negro",'B',10,45);
        listaElectrodomesticos[6] = new Lavadora(80,50);
        listaElectrodomesticos[7] = new Television();
        listaElectrodomesticos[8] = new Television(150, 50);
        listaElectrodomesticos[9] = new Television(150,"azul",'D',60,50,true);

        for(Electrodomestico elemento : listaElectrodomesticos){
            System.out.println("Precio del elemento " + contadorElemento);
            System.out.println(elemento.precioFinal());
            elemento.precioFinal();
            sumaElectrodomesticos += elemento.precioFinal();
            if(elemento instanceof Lavadora){
                sumaLavadoras += elemento.precioFinal();
            }
            else if(elemento instanceof Television){
                sumaTelevisiones += elemento.precioFinal();
            }
            contadorElemento++;
        }
        System.out.println("La suma total de las Lavadoras es: " + sumaLavadoras);
        System.out.println("La suma total de los Televisores es: " + sumaTelevisiones);
        System.out.println("La suma total de los Electrodomesticos es: " + sumaElectrodomesticos);
    }

}
