package TEMA_5;

public class Ej11_Sanchez_Mario {
    public static void main(String[] args) {

        int pares = 0, impares = 0;

        System.out.println("Le mostraremos la suma de los números pares e impares comprendidos entre el 100 y el 200");

        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                pares += i;
            } else {
                impares += i;
            }
        }

        System.out.printf(" %n La suma de los números pares: %d %n La suma de los números impares: %d", pares, impares);

    }
}
