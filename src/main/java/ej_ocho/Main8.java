package ej_ocho;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int eleccion = 0;
        boolean validacion = true;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija el numero correspondiente al dia para conocer si es o no un dia laboral:");

        Arrays.stream(dias).forEach(x ->
                System.out.printf("%s = %s%n", Arrays.asList(dias).indexOf(x), x)
        );

        while (validacion) {

            try {
                eleccion = entrada.nextInt();
                validacion = eleccion < 0 || eleccion > dias.length;
                if(validacion) System.out.println("Por favor elija alguno de los numeros en pantalla.");
            } catch (Exception e) {
                System.out.println("Por favor digite un numero correspondiente al dia.");
                entrada = new Scanner(System.in);
            }
        }

        switch (dias[eleccion]) {
            case "Lunes":
                System.out.println("El Lunes es un dia laboral.");
                break;
            case "Martes":
                System.out.println("El Martes es un dia laboral.");
                break;
            case "Miercoles":
                System.out.println("El Miercoles es un dia laboral.");
                break;
            case "Jueves":
                System.out.println("El Jueves es un dia laboral.");
                break;
            case "Viernes":
                System.out.println("El Viernes es un dia laboral.");
                break;
            case "Sabado":
                System.out.println("El Sabado es un dia laboral.");
                break;
            case "Domingo":
                System.out.println("El Domingo no es un dia laboral.");
                break;
            default:
                break;
        }

    }
}
