package ej_diez;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fraseUsuario;
        String sinEspacios;

        System.out.println("Por favor ingrese una frase:");
        fraseUsuario = entrada.nextLine();
        sinEspacios = fraseUsuario.replaceAll("\\s","");

        System.out.println(sinEspacios);
    }
}
