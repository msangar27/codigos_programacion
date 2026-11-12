package TEMA_4;

import java.util.Scanner;

public class Ej2_Sanchez_Mario {
    public static void main(String[] args) {

        double lado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el lado del cuadrado (unidad=m): ");
        lado = sc.nextInt();
        System.out.println("El área del cuadrado es: " + lado * lado + "m²");
    }
}