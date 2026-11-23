package TEMA_5;

import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Scanner;

public class Ej12_Sanchez_Mario {
    public static void main(String[] args) {
        double num1 = 1, resultado = 1;
        int num2 = 1;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un número real: ");
        num1 = sc.nextDouble();
        System.out.printf("Introduce un número entero para elevarselo al primer número: ");
        num2 = sc.nextInt();

        for (int i = 1; i <= num2; i++) {
            resultado *= num1;
        }

        System.out.printf("El resultado es: %.02f", resultado);
    }
}
