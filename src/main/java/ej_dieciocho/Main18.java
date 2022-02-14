package ej_dieciocho;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Main18 {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie();
        series[1] = new Serie("Stranger Things", "Hermanos Duffer");
        series[2] = new Serie("La Casa de Papel", 5, "Accion", "Alex Pina");
        series[3] = new Serie("El Juego del Calamar", 1, "Supervivencia", "Hwang Dong hyuk");
        series[4] = new Serie("Game of Thrones", "David Benioff");
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("Pokemon Esmeralda", 3);
        videojuegos[2] = new Videojuego("Army of Two", 4, "Shooter", "EA Games");
        videojuegos[3] = new Videojuego("Prototype", 6, "Accion", "Activision");
        videojuegos[4] = new Videojuego("Genshin Impact", 14);

        series[2].entregar();
        series[4].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();
        videojuegos[4].entregar();

        AtomicInteger seriesEntregadas = new AtomicInteger();
        AtomicInteger videojuegosEntregados = new AtomicInteger();

        System.out.println("Contar series y videojuegos entregados:");

        Arrays.stream(series).filter(Serie::isEntregado).forEach(serie -> {
            seriesEntregadas.getAndIncrement();
            System.out.println(serie);
        });
        System.out.printf("Cantidad de series entregadas: %s%n", seriesEntregadas);

        Arrays.stream(videojuegos).filter(Videojuego::isEntregado).forEach(videojuego -> {
            videojuegosEntregados.getAndIncrement();
            System.out.println(videojuego);
        });
        System.out.printf("Cantidad de videojuegos entregados: %s%n", videojuegosEntregados);

        System.out.println("");

        System.out.println("Serie con mas temporadas y Videojuego mas mas horas:");

        System.out.println(Arrays.stream(series).max(Serie::compareTo).get());
        System.out.println(Arrays.stream(videojuegos).max(Videojuego::compareTo).get());
    }

}
