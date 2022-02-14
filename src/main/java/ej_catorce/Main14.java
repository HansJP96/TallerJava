package ej_catorce;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean validacion = true;

        while (validacion || numero >= 1000) {
            try {
                System.out.print("Digite un numero entero: ");
                numero = entrada.nextInt();
                if (numero >= 1000) System.out.println("Por favor digite un numero entero que sea menor a 1000.");
                validacion = false;
            } catch (Exception e) {
                System.out.println("Por favor debe ingresar solo numeros enteros.");
                entrada = new Scanner(System.in);
            }
        }

        for (int num = numero; num <= 1000; num = num + 2) {
            System.out.printf("Numero actual: %s%n", num);
        }

    }
}
