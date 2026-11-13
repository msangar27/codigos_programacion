package TEMA_5;

import java.util.Scanner;

public class Ej6_Sanchez_Mario {
    public static void main(String[] args) {

        int num=0, i=1;
        boolean negativo = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 10 números diferentes y le diremos si hay algun negativo");

        do {
            System.out.printf("%nNúmero %d: ", i);
            num = sc.nextInt();
            i++;
            if (num<0){
                negativo=true;
            }
        }while(i!=11);

        if (negativo){
            System.out.println("Se ha introducido algún número negativo");
        } else {
            System.out.println("No se ha introducido ningún número negativo");
        }
    }
}
