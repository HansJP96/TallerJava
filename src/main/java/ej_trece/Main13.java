package ej_trece;

import java.time.LocalDateTime;

public class Main13 {
    public static void main(String[] args) {
        LocalDateTime actual = LocalDateTime.now();
        int anio = actual.getYear();
        int mes = actual.getMonthValue();
        int dia = actual.getDayOfMonth();
        int hora = actual.getHour();
        int min = actual.getMinute();
        int seg = actual.getSecond();

        System.out.printf("(%s/%s/%s)(%s:%s:%s)", anio, mes, dia, hora, min, seg);
    }
}
