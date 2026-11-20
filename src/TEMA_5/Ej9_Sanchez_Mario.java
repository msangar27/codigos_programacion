package TEMA_5;

public class Ej9_Sanchez_Mario {
    public static void main(String[] args) {
        int suma = 0, producto = 1, i;

        System.out.println("Le mostraremos la suma y el producto de los 10 números naturales");

        for (i = 1; i <= 10; i++) {
            suma += i;
            producto *= i;
        }

        System.out.printf("Su suma; %d %n Su multiplicación: %d", suma, producto);
    }
}
