package ej_dos;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean validacion = true;
        int var1 = 0;
        int var2 = 0;

        while (validacion) {
            try {
                System.out.print("Ingrese su primer numero entero: ");
                var1 = entrada.nextInt();
                System.out.print("Ingrese su segundo numero entero: ");
                var2 = entrada.nextInt();
                validacion = false;
            } catch (Exception e) {
                System.out.println("Por favor debe ingresar solo numeros enteros");
                entrada = new Scanner(System.in);
            }
        }


        int comparador = Integer.compare(var1, var2);

        if (comparador == 0) {
            System.out.printf("Los numeros son iguales (%s)", var1);
        } else {
            System.out.printf("El numero mayor es %s", comparador > 0 ? var1 : var2);
        }
    }
}
