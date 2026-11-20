package TEMA_5;

import java.util.Scanner;

public class Ej8_Sanchez_Mario {
    public static void main(String[] args) {
        int num = 0, i = 1, negativo = 0, positivo = 0;
        boolean neg = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe números y cuando quiera salir escribe el 0. Le diremos cuántos números eran positivos y cuántos negativos");

        do {
            System.out.printf("%nNúmero %d: ", i);
            num = sc.nextInt();
            i++;
            if (num < 0) {
                negativo++;
                neg = true;
            } else {
                positivo++;
            }
        } while (num != 0);
        if (neg) {
            System.out.println("Se ha introducido algún número negativo");
        } else {
            System.out.println("No se ha introducido ningún número negativo");
        }
        System.out.printf("Se han introducido: %d números positivos y %d números negativos", positivo, negativo);
    }
}
