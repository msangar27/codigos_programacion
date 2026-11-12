package TEMA_5;

public class Ej3_Sanchez_Mario {
    public static void main(String[] args) {

        System.out.println("Los números pares del 1 al 200 son: ");

        for (int i = 1; i <= 200; i++) {
            if (i%2==0) {
                System.out.printf("%d%n", i);
            }
        }

    }
}