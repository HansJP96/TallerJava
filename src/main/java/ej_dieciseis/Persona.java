package ej_dieciseis;

import java.util.Random;
import java.util.stream.IntStream;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String dni = "";
    private char sexo = 'H';
    private float peso = 0;
    private float altura = 0;

    public Persona() {
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = generaDNI();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = (float) altura;
    }

    public int calcularIMC() {
        float imc = (this.peso) / (float) Math.pow(this.altura, 2);
        int estado = 0;

        if (imc < 20) {
            estado = -1;
        } else if (imc > 25) {
            estado = 1;
        }
        if (this.peso == 0 && this.altura == 0) estado = 2;
        imprimirEstadoIMC(estado);

        return estado;
    }

    public void imprimirEstadoIMC(int estado) {
        switch (estado) {
            case -1:
                System.out.printf("%s se encuentra baj%s de peso.%n", this.nombre, this.sexo == 'M' ? "a" : "o");
                break;
            case 0:
                System.out.printf("%s se encuentra en un peso normal.%n", this.nombre);
                break;
            case 1:
                System.out.printf("%s se encuentra en sobrepeso.%n", this.nombre);
                break;
            default:
                System.out.printf("El IMC de %s no se puede determinar.%n", this.nombre);
                break;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public void comprobarSexo(char sexo) {
        if (sexo == 'M') {
            this.sexo = 'M';
        }
    }

    public String generaDNI() {
        Random aleatorio = new Random();
        StringBuilder dniAleatorio = new StringBuilder();

        IntStream.range(0, 8).forEach(x ->
                dniAleatorio.append(aleatorio.nextInt(10))
        );

        return dniAleatorio.toString();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
