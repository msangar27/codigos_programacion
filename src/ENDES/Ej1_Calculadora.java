package ENDES;

public class Ej1_Calculadora {
    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("El resultado es: " + resultado);
    }

    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
}