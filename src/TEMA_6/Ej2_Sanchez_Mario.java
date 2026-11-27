package TEMA_6;

import java.util.Scanner;

public class Ej2_Sanchez_Mario {
    public static void main(String[] args) {

        int i = 0;
        int[] numeros;
        numeros = new int[10];
        int suma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 10 números enteros.");

        for (i = 0; i < 10; i++) {
            System.out.printf("%nEscribe el número %d: ", i);
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }
        System.out.printf("La suma de los números introducidos es: %d ", suma);

    }
}
