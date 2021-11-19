package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author David Diaz
 *
 * **/

public class E11 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String frase;
        int contadorVocales = 0;
        int contadorTotal = 0;

        System.out.println("Ingrese una frase: ");
        frase = entrada.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if ((frase.toUpperCase().charAt(i) == 'A') || (frase.toUpperCase().charAt(i) == 'E') ||
                    (frase.toUpperCase().charAt(i) == 'I') || (frase.toUpperCase().charAt(i) == 'O') || (frase.toUpperCase().charAt(i) == 'U')){
                contadorVocales++;
            }for(int y = 0; y < frase.length(); y++){
                if(frase.charAt(y) == ' '){
                    contadorTotal++;
                }
            }
        }
        System.out.println("\nNúmero total de vocales: " + contadorVocales);
        System.out.println("Longitud de la frase: " + frase.length());

    }

}
