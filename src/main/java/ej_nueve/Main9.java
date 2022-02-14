package ej_nueve;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseUsuario;
        StringBuilder fraseCompleta = new StringBuilder();


        String nuevoTexto = texto.replace("a","e");

        System.out.println("Por favor ingrese una frase:");
        fraseUsuario = entrada.nextLine();

        fraseCompleta.append(nuevoTexto).append(" y ").append(fraseUsuario);

        System.out.println(fraseCompleta);
    }
}
