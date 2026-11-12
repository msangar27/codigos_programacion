package TEMA_4;

import java.util.Scanner;

public class Ej12_Sanchez_Mario {
    public static void main(String[] args) {

        final double EPSILON=1e-9;

        double lado1, lado2, lado3, mayor, mediano, menor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1: ");
        lado1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        lado2 = sc.nextDouble();
        System.out.print("Lado 3: ");
        lado3 = sc.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado1 <= 0 || lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            System.out.println("No forman un triángulo");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Es isósceles");
            } else {
                System.out.println("Es escaleno");
            }
        }

        mayor = Math.max(lado1, Math.max(lado2, lado3));
        menor = Math.min(lado1, Math.min(lado2, lado3));
        mediano = lado1 + lado2 + lado3 - mayor - menor;
        if (Math.abs(Math.pow(menor,2)+Math.pow(mediano,2)-Math.pow(mayor,2))<EPSILON) {
            System.out.printf("Es rectángulo");
        } else {
            System.out.printf("No es rectángulo");
        }
    }
}