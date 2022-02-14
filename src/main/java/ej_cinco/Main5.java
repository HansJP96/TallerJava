package ej_cinco;

import java.util.ArrayList;


public class Main5 {
    public static void main(String[] args) {
        ArrayList<Integer> numPares = new ArrayList<>();
        ArrayList<Integer> numImpares = new ArrayList<>();
        int num =1;

        while (num <= 100){
            if (num % 2 == 0) {
                numPares.add(num);
            } else {
                numImpares.add(num);
            }
            num++;
        }

        System.out.printf("Numeros pares: %s%n", numPares);
        System.out.printf("Numeros impares: %s%n", numImpares);
    }
}
