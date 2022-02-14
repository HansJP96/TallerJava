package ej_uno;


public class Main1 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 10;

        int comparador = Integer.compare(var1, var2);

        if (comparador == 0) {
            System.out.printf("Los numeros son iguales (%s)", var1);
        } else {
            System.out.printf("El numero mayor es %s", comparador > 0 ? var1 : var2);
        }


    }
}
