package TEMA_6;

import java.util.Scanner;

public class Ej1_Sanchez_Mario {
    public static void main(String[] args) {

        int i = 0;
        int[] numeros;
        numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 10 números enteros.");

        for (i = 0; i < 10; i++) {
            System.out.printf("%nEscribe el número %d: ", i);
            numeros[i] = sc.nextInt();
        }
        i = 0;
        System.out.printf("El primer número es = %d%n", i + 1, numeros[i]);
        System.out.printf("El segundo número es = %d%n", i + 2, numeros[i]);
        System.out.printf("El tercero número es = %d%n", i + 3, numeros[i]);
        System.out.printf("El cuarto número es = %d%n", i + 4, numeros[i]);
        System.out.printf("El quinto número es = %d%n", i + 5, numeros[i]);
        System.out.printf("El sexto número es = %d%n", i + 6, numeros[i]);
        System.out.printf("El séptimo número es = %d%n", i + 7, numeros[i]);
        System.out.printf("El octavo número es = %d%n", i + 8, numeros[i]);
        System.out.printf("El noveno número es = %d%n", i + 9, numeros[i]);
        System.out.printf("El décimo número es = %d%n", i + 10, numeros[i]);
    }
}
