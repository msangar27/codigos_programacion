package TEMA_6;

import java.util.Scanner;

public class Ej5_Sanchez_Mario {
    public static void main(String[] args) {

        int[] numeros;
        numeros = new int[20];
        int i, suma = 0;
        double media = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 20 números enteros. El 0 no cuenta como número.");

        for (i = 0; i < 20; i++) {
            System.out.printf("%nEscribe el número %d: ", i);
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }
        media = suma / i;

        System.out.printf("La suma es: %d", suma);
        System.out.printf("%nLa media es: %.02f", media);
    }
}
