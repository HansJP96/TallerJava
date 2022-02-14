package ej_seis;

import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {
        ArrayList<Integer> numPares = new ArrayList<>();
        ArrayList<Integer> numImpares = new ArrayList<>();

        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                numPares.add(num);
            } else {
                numImpares.add(num);
            }
        }

        System.out.printf("Numeros pares: %s%n", numPares);
        System.out.printf("Numeros impares: %s%n", numImpares);
    }
}
