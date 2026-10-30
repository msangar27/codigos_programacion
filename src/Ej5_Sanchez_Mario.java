import java.util.Scanner;

public class Ej5_Sanchez_Mario {
    public static void main(String[] args) {

        double millas;
        double metros;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número en millas y se lo pasamos a: ");
        millas = sc.nextDouble();
        metros= millas*1852;
        System.out.printf("%.2f millas marinas son %.2f metros", millas, metros);
    }
}

