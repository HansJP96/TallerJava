package ej_doce;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean diferentes = false;
        String palUno;
        String palDos;

        System.out.print("Ingrese su primera palabra: ");
        palUno = entrada.nextLine().strip();
        System.out.print("Ingrese su segunda palabra: ");
        palDos = entrada.nextLine().strip();

        if (palUno.contains(" ")) {
            System.out.println("La primera palabra tiene espacios entre caracteres y debe ser solo 1 palabra.");
        } else if (palDos.contains(" ")) {
            System.out.println("La segunda palabra tiene espacios entre caracteres y debe ser solo 1 palabra.");
        } else if (palUno.length() != palDos.length()) {
            System.out.printf("Las palabras tienen diferente longintud de caracteres:%n" +
                    "%s = %s letras%n" +
                    "%s = %s letras", palUno, palUno.length(), palDos, palDos.length());
        } else {
            for (int letra = 0; letra < palUno.length(); letra++) {
                char letraPalUno = palUno.charAt(letra);
                char letraPalDos = palDos.charAt(letra);

                if (letraPalUno != letraPalDos) {
                    System.out.printf("En la posicion %s de ambas palabras hay caracteres distintos '%s es diferente de %s'.%n",
                            letra + 1, letraPalUno, letraPalDos);
                    diferentes = true;
                }
            }
            if (!diferentes) {
                System.out.println("Las palabras que escribiste son iguales.");
            }
        }
    }
}
