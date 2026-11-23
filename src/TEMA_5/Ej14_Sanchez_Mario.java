package TEMA_5;

import java.util.Scanner;

public class Ej14_Sanchez_Mario {
    public static void main(String[] args) {
        int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, dinero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una cantidad de dinero múltiplo de 5 y que sea un número entero: ");
        dinero = sc.nextInt();

        while (dinero >= 500) {
            dinero -= 500;
            b500++;
        }
        while (dinero >= 200 && dinero < 500) {
            dinero -= 200;
            b200++;
        }
        while (dinero >= 100 && dinero < 200) {
            dinero -= 100;
            b100++;
        }
        while (dinero >= 50 && dinero < 100) {
            dinero -= 50;
            b50++;
        }
        while (dinero >= 20 && dinero < 50) {
            dinero -= 20;
            b20++;
        }
        while (dinero >= 10 && dinero < 20) {
            dinero -= 10;
            b10++;
        }
        while (dinero >= 5 && dinero < 10) {
            dinero -= 5;
            b5++;
        }
        if (dinero == 0) {
            System.out.printf("Se necesitan % d billetes de 500%n", b500);
            System.out.printf("Se necesitan % d billetes de 200%n", b200);
            System.out.printf("Se necesitan % d billetes de 100%n", b100);
            System.out.printf("Se necesitan % d billetes de 50%n", b50);
            System.out.printf("Se necesitan % d billetes de 20%n", b20);
            System.out.printf("Se necesitan % d billetes de 10%n", b10);
            System.out.printf("Se necesitan % d billetes de 5%n", b5);
        }
    }
}
