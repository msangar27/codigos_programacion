package TEMA_4;

import java.util.Scanner;

public class Ej11_Sanchez_Mario {
    public static void main(String[] args) {

        double a, b, c, resultado1 = 0, resultado2 = 0, discriminante;
        int respuesta = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número de la ecuación de segundo grado: ");
        a = sc.nextDouble();
        System.out.print("Ahora el segundo número: ");
        b = sc.nextDouble();
        System.out.print("Ahora el tercer número: ");
        c = sc.nextDouble();
        discriminante = Math.pow(b, 2) - (4 * a * c);
        if (a != 0 && discriminante > 0) {
            respuesta = 1;
            resultado1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            resultado2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        }
        if (a != 0 && discriminante == 0) {
            respuesta = 2;
            resultado1 = resultado2 = -b / (2 * a);
        }
        if (a != 0 && discriminante < 0) {
            respuesta = 3;
        }
        if (a == 0 && b != 0) {
            respuesta = 4;
            resultado1 = -c / b;
        }
        if (a == 0 && b == 0 && c != 0) {
            respuesta = 5;
        }
        if (a == 0 && b == 0 && c == 0) {
            respuesta = 6;
        }
        switch (respuesta) {
            case 1 -> System.out.printf("Dos soluciones: x1= %.2f y x2= %.2f", resultado1, resultado2);
            case 2 -> System.out.printf("Tiene una solución doble: x= %.2f", resultado1);
            case 3 -> System.out.printf("No tiene soluciones reales");
            case 4 -> System.out.printf("Tiene una solución: x= %.2f", resultado1);
            case 5 -> System.out.printf("No tiene solución");
            case 6 -> System.out.printf("Cualquier número es solución");
        }
    }
}
