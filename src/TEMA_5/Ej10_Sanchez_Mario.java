package TEMA_5;

import java.util.Scanner;

public class Ej10_Sanchez_Mario {
    public static void main(String[] args) {

        int num = 0, i = 1;
        boolean num10 = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Lee notas de exñamenes hasta introducir el valor -1");

        do {
            System.out.printf("%n Nota %i: ", i);
            if (num == 10) {
                num10 = true;
            }
        } while (num != -1);

        if (num10) {
            System.out.println("Hubo alguna nota con valor 10");
        } else {
            System.out.println("Ninguna nota introducida tuvo valor 10");
        }
    }
}
