package ej_siete;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean validacion = true;
        int numero = 0;

        do {
            try {
                System.out.print("Ingrese un numero entero: ");
                numero = entrada.nextInt();
                validacion = numero < 0;
            } catch (Exception e) {
                System.out.println("Por favor debe ingresar solo numeros enteros");
                entrada = new Scanner(System.in);
            }
        } while (validacion);

        System.out.printf("El numero es %s.", numero);
    }
}
