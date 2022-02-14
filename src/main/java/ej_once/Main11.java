package ej_once;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fraseUsuario;
        int longFraseEspacio = 0;
        int longFraseSinEspacio = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        System.out.println("Por favor ingrese una frase:" +
                "\n(no se contaran espacios antes de la primera letra y despues de la ultima)");
        fraseUsuario = entrada.nextLine().strip().toLowerCase();

        for (char letra : fraseUsuario.toCharArray()) {
            if (letra == 'a') a++;
            else if (letra == 'e') e++;
            else if (letra == 'i') i++;
            else if (letra == 'o') o++;
            else if (letra == 'u') u++;
            else if (letra == ' ') longFraseSinEspacio++;
            longFraseEspacio++;
        }
        System.out.printf("La frase tiene una longitud de caracteres con espacios de: %s%n", longFraseEspacio);
        System.out.printf("La frase tiene una longitud de caracteres sin contar espacios de: %s%n", longFraseEspacio - longFraseSinEspacio);
        System.out.printf("Tiene %s vocal%s de a/A.%n", a, a == 1 ? "" : "es");
        System.out.printf("Tiene %s vocal%s de e/E.%n", e, e == 1 ? "" : "es");
        System.out.printf("Tiene %s vocal%s de i/I.%n", i, i == 1 ? "" : "es");
        System.out.printf("Tiene %s vocal%s de o/O.%n", o, o == 1 ? "" : "es");
        System.out.printf("Tiene %s vocal%s de u/U.%n", u, u == 1 ? "" : "es");

    }
}
