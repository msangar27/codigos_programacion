package TEMA_5;

import java.util.Locale;
import java.util.Scanner;

public class Ej13_Sanchez_Mario {
    public static void main(String[] args) {
        int numero, max = 100, min = 1;
        boolean adivinado = false;
        String respuesta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Piensa un número y voy a intentar adivinarlo");

        while (!adivinado) {
            numero = (int) ((min + max) / 2);
            System.out.printf("Tú numero es mayor, menor o  igual a %d %n", numero);
            respuesta = sc.nextLine().toLowerCase();
            switch (respuesta) {
                case "mayor" -> min = numero + 1;
                case "menor" -> max = numero;
                case "igual" -> adivinado = true;
                default -> System.out.println("Número introducido no válido");
            }
            if (adivinado) {
                System.out.printf("El número que has pensado es: %d", numero);
            }
        }
    }
}
