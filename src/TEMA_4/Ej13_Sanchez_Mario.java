package TEMA_4;

import java.util.Scanner;

public class Ej13_Sanchez_Mario     {
    public static void main(String[] args) {
        final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
        Scanner sc = new Scanner(System.in);
        int numero;
        char letra, correcta;

        System.out.print("Número del DNI: ");
        numero = sc.nextInt();
        System.out.print("Letra: ");
        letra = Character.toUpperCase(sc.next().charAt(0));

        correcta = LETRAS.charAt(numero % 23);
        if (letra == correcta) {
            System.out.println("La letra es correcta");
        } else {
            System.out.printf("La letra introducida no es correcta, la correcta es la %c", correcta);
        }

    }
}
