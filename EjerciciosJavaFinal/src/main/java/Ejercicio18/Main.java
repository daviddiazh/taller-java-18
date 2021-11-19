package Ejercicio18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int contadorSeries = 0;
        int contadorVideojuegos = 0;
        List<Serie> listaSerie = new ArrayList<Serie>();

        listaSerie.add(new Serie()); //Por defecto.
        listaSerie.add(new Serie("Mr Robot",4,"Informatica","Sam Esmail."));
        listaSerie.add(new Serie("Dragon Ball Z",3,"Shounen","Akira T."));
        listaSerie.add(new Serie("Naruto",25,"Shounen","M.K."));
        listaSerie.add(new Serie("MasterChef", 2,"En Familia","Caracol."));

        List<Videojuego> listaVideojuego = new ArrayList<>();
        listaVideojuego.add(new Videojuego());
        listaVideojuego.add(new Videojuego("Fifa", 700,"Deportes","EA Sports"));
        listaVideojuego.add(new Videojuego("NBA 2K",500,"Deportes","EGames"));
        listaVideojuego.add(new Videojuego("Grand The Auto",1000,"Acción Aventura","Rockstar Games"));
        listaVideojuego.add(new Videojuego("Fornite",600,"Aventura","Epic Games"));

        listaSerie.get(1).entregar();
        listaSerie.get(2).entregar();

        listaVideojuego.get(1).entregar();
        listaVideojuego.get(3).entregar();

        for (Serie eSerie : listaSerie) {
            if(eSerie.isEntregado() == true){
                contadorSeries += 1;
                eSerie.devolver();
            }
        }

        for (Videojuego eVideojuego : listaVideojuego) {
            if(eVideojuego.isEntregado() == true){
                contadorVideojuegos += 1;
                eVideojuego.devolver();
            }
        }

        System.out.println("-------------------------------------------");
        System.out.println("***Series y Videojuegos ENTREGADOS***");
        System.out.println("El número de Series entregadas es: " + contadorSeries);
        System.out.println("El número de Videojuegos entregadas es: " + contadorVideojuegos);

        System.out.println("La serie con mas temporadas es: "+listaSerie.stream().sorted((x, y) -> y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));
        System.out.println("El videojuego con mas horas es: "+listaVideojuego.stream().sorted((x, y) -> y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));
        System.out.println("-------------------------------------------");

    }

}
