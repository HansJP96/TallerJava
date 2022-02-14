package ej_diecisiete;

import java.util.Arrays;

public class Main17 {
    public static void main(String[] args) {
        final double[] precioElectrodomesticos = new double[1];
        final double[] precioLavadoras = new double[1];
        final double[] precioTelevisores = new double[1];

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(220, 77);
        electrodomesticos[2] = new Electrodomestico(484, "rojo", 'C', 49);
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Lavadora(350, 88);
        electrodomesticos[5] = new Lavadora(490, "verde", 'A', 88, 50);
        electrodomesticos[6] = new Television();
        electrodomesticos[7] = new Television(610, 30);
        electrodomesticos[8] = new Television(240, "NEGRO", 'P', 18, 26, true);
        electrodomesticos[9] = new Television(880, "Azul", 'B', 25, 48, true);

        Arrays.stream(electrodomesticos).forEach(electrodomestico -> {
            electrodomestico.precioFinal();
            if (electrodomestico instanceof Lavadora) {
                precioLavadoras[0] = precioLavadoras[0] + electrodomestico.getPrecioBase();
            } else if (electrodomestico instanceof Television) {
                precioTelevisores[0] = precioTelevisores[0] + electrodomestico.getPrecioBase();
            }
            precioElectrodomesticos[0] = precioElectrodomesticos[0] + electrodomestico.getPrecioBase();
        });

        System.out.printf("El precio de todos los electrodomesticos es: %s%n", precioElectrodomesticos[0]);
        System.out.printf("El precio de todas las lavadoras es: %s%n", precioLavadoras[0]);
        System.out.printf("El precio de todos los televisores es: %s%n", precioTelevisores[0]);
    }
}
