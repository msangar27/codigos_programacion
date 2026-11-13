package TEMA_5;

import java.util.Scanner;

public class Ej5_Sanchez_Mario {
    public static void main(String[] args) {


        int num, resultado=1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Escribe un número entero y le daremos su factorial: ");
            num = sc.nextInt();
        } while (num < 0);

        do {
            resultado=resultado*num;
            num--;
        } while(num!=1);

        System.out.printf("%nEl factorial del número introducido es: %d", resultado);
    }
}
