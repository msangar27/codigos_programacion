import java.io.PrintStream;
import java.util.Scanner;

public class Ej8_Sanchez_Mario {

    public static void main (String[] args){

        double nota;
        Scanner sc=  new Scanner(System.in);

        System.out.print("Introduce tu calificación: ");
        nota= sc.nextDouble();

        System.out.printf((nota >= 0 && nota < 3) ? ("Calificación muy deficiente"):(""));
        System.out.printf((nota >= 3 && nota < 5) ? ("Calificación insuficiente"):(""));
        System.out.printf((nota >= 5 && nota < 6) ? ("Calificación suficiente"):(""));
        System.out.printf((nota >= 6 && nota < 9) ? ("Calificación notable"):(""));
        System.out.printf((nota >= 9 && nota <= 10) ? ("Calificación sobresaliente"):(""));
    }
}
