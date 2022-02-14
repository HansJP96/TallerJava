package ej_quince;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        StringBuilder menu = new StringBuilder();
        menu.append(("****** GESTION CINEMATOGRAFICA ********\n"))
                .append("1-NUEVO ACTOR\n")
                .append("2-BUSCAR ACTOR\n")
                .append("3-ELIMINAR ACTOR\n")
                .append("4-MODIFICAR ACTOR\n")
                .append("5-VER TODOS LOS ACTORES\n")
                .append("6- VER PELICULAS DE LOS ACTORES\n")
                .append("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n")
                .append("8-SALIR");

        Scanner entrada = new Scanner(System.in);
        boolean validacion = true;
        int eleccion;

        while (validacion) {
            try {
                System.out.println(menu);
                System.out.println("Digte el numero de alguna de las opciones mostradas:");
                eleccion = entrada.nextInt();
                switch (eleccion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        validacion = false;
                        break;
                    default:
                        System.out.println("OPCION INCORRECTA");
                        break;

                }
            } catch (Exception e) {
                System.out.println("Por favor debe digitar numeros y que se encuentren en el menu.");
                entrada = new Scanner(System.in);
            }
        }


    }
}
