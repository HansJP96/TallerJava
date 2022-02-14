package ej_tres;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio = 0;
        boolean validacion = true;

        while (validacion || radio <= 0) {
            try {
                System.out.print("Digite el valor del radio: ");
                radio = entrada.nextDouble();
                if(radio<=0) System.out.println("Por favor digite un numero real positivo mayor que 0.");
                validacion = false;
            } catch (Exception e) {
                System.out.println("Por favor debe ingresar solo numeros reales positivos.\n(numeros decimales con coma)");
                entrada = new Scanner(System.in);
            }
        }

        System.out.printf("El area del circulo es %s.", Math.PI * Math.pow(radio, 2));
    }
}
