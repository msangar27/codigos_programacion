package TEMA_5;

import java.util.Scanner;

public class Ej4_Sanchez_Mario {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número y le mostraremos los números desde 1 hasta el número introducido: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.printf("%d%n", i);
        }
    }
}
