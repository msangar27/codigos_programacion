package TEMA_4;

import java.util.Scanner;

public class Ej9_Sanchez_Mario {
    public static void main(String[] args) {
        int horas, minutos, segundos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora actual");

        System.out.print("Horas: ");
        horas = sc.nextInt();

        System.out.print("Minutos: ");
        minutos = sc.nextInt();

        System.out.print("Segundos: ");
        segundos = sc.nextInt();

        segundos += 1;
        if (segundos > 59) {
            segundos = 0;
            minutos += 1;
        }
        if (minutos > 59) {
            minutos = 0;
            horas += 1;
        }
        if (horas > 23) {
            horas = 0;
        }
        System.out.printf("Son las %02d:%02d:%02d", horas, minutos, segundos);
    }
}
