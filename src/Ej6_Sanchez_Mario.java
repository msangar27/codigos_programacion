import java.util.Scanner;

public class Ej6_Sanchez_Mario {
    public static void main (String[] args) {
        double edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        edad = sc.nextDouble();
        System.out.printf((edad>=18)?("Eres mayor de edad"):("Eres menor de edad"));
    }
}

