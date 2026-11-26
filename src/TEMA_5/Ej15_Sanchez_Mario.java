package TEMA_5;

import java.util.Scanner;

public class Ej15_Sanchez_Mario {
    public static void main(String[] args) {
        int numero, multiplos = 1, contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escríbe un número y le contare cuantos múltiplos de 3 tiene ese número: ");
        numero = sc.nextInt();

        while (multiplos != numero) {
            if (multiplos % 3 == 0) {
                contador++;
            }
            multiplos++;
        }
        System.out.printf("El número introducido tiene %d múltiplos de 3", contador);
    }
}
