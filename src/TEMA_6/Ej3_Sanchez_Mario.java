package TEMA_6;

import java.util.Scanner;

public class Ej3_Sanchez_Mario {
    public static void main(String[] args) {

        int i = 0, maximo, minimo;
        int[] numeros;
        numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 10 números enteros.");

        for (i = 0; i < 10; i++) {
            System.out.printf("%nEscribe el número %d: ", i);
            numeros[i] = sc.nextInt();
        }

        maximo = numeros[9];
        minimo = numeros[9];
        for (i = 0; i < 10; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.printf("El número máximo es: %d%n El número mínimo es: %d", maximo, minimo);
    }
}
