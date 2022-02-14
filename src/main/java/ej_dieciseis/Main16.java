package ej_dieciseis;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        float peso;
        float altura;

        System.out.println("Digite su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Digite su edad: ");
        edad = entrada.nextInt();
        System.out.println("Digite su sexo (H para Hombre, M para Mujer): ");
        sexo = entrada.next().charAt(0);
        System.out.println("Digite su peso en kilogramos (Kg): ");
        peso = entrada.nextFloat();
        System.out.println("Digite su altura en metros(m): ");
        altura = entrada.nextFloat();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Pedro");
        persona3.setEdad(44);
        persona3.setSexo('H');
        persona3.setPeso(58);
        persona3.setAltura(1.69);

        int imc1 = persona1.calcularIMC();
        int imc2 = persona2.calcularIMC();
        int imc3 = persona3.calcularIMC();

        boolean mayor1 = persona1.esMayorDeEdad();
        System.out.println(mayor1);
        boolean mayor2 = persona2.esMayorDeEdad();
        System.out.println(mayor2);
        boolean mayor3 = persona3.esMayorDeEdad();
        System.out.println(mayor3);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
