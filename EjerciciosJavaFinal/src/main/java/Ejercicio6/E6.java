package Ejercicio6;

/**
 *
 * @author David Diaz
 *
 * **/

public class E6 {

    public static void main(String[] args){

        //NUMEROS PARES
        System.out.println("Números PARES");
        int numeros = 1;
        for(numeros = 1; numeros <= 100; numeros++){
            if(numeros % 2 == 0){
                System.out.println(numeros + " Número par");
            }
        }

        System.out.println("\n------------------------------");
        System.out.println("\n------------------------------");

        //NUMEROS IMPARES
        System.out.println("\nNúmeros IMPARES");
        int numerosImpares = 1;
        for(numerosImpares = 1; numerosImpares <= 100; numerosImpares++){
            if(numerosImpares % 2 == 1){
                System.out.println(numerosImpares + " Número impar");
            }
        }
    }

}
