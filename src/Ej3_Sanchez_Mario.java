import java.util.Scanner;

public class Ej3_Sanchez_Mario {
    public static void main(String[] args) {
        double radio;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia (unidad=m): ");
        radio = sc.nextInt();
        System.out.println("La longitud de la circunferencia es: " + 2 * Math.PI * radio + "m");
        System.out.println("El área de la circunferencia es: " + Math.PI * radio * radio + "m²");
        System.out.println("El volumen de la circunferencia es: " + (4 * Math.PI * radio * radio * radio)/3 + "m³");
    }
}
