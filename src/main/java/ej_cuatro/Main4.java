package ej_cuatro;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio = 0;
        double iva = 0.21;
        boolean validacion = true;

        while (validacion) {

            try {
                System.out.print("Ingrese el precio del producto: ");
                precio = entrada.nextDouble();
                validacion = precio < 0;
                if (validacion) System.out.println("El precio no puede ser negativo.");
            } catch (Exception e) {
                System.out.println("Por favor debe ingresar solo numeros reales positivos\n(numeros decimales con coma).");
                entrada = new Scanner(System.in);
            }
        }

        System.out.printf("El precio final del producto con IVA es: %s", precio * (1 + iva));

    }
}
