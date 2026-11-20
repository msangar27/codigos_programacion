package TEMA_5;

import java.util.Scanner;

public class Ej7_Sanchez_Mario {
    public static void main(String[] args) {
        int num = 0, i = 1, negativo = 0, positivo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 10 números diferentes y le diremos cuántos números eran positivos y cuántos negativos");

        do {
            System.out.printf("%nNúmero %d: ", i);
            num = sc.nextInt();
            i++;
            if (num < 0) {
                negativo++;
            } else {
                positivo++;
            }
        } while (i != 11);

        System.out.printf("Se han introducido: %d números positivos y %d números negativos", positivo, negativo);

    }
}
