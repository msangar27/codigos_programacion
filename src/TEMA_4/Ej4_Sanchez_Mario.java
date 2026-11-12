package TEMA_4;

import java.util.Scanner;

public class Ej4_Sanchez_Mario {
    public static void main(String[] args) {

        double precioI;
        double precioF;
        double descuento;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio inicial del artículo: ");
        precioI = sc.nextDouble();
        System.out.print("Introduce el precio al que has comprado el artículo: ");
        precioF=sc.nextDouble();
        descuento= (precioI - precioF)/precioI * 100;
        System.out.printf("Descuento aplicado: %.2f %%", descuento);
    }
}
