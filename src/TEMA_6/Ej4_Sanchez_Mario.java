package TEMA_6;

import java.util.Scanner;

public class Ej4_Sanchez_Mario {
    public static void main(String[] args) {

        int[] positivos, negativos;
        positivos=new int[20];
        negativos=new int[20];
        int numeros,i,sumaPos=0, sumaNeg=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 20 números enteros. El 0 no cuenta como número.");

        for (i = 0; i < 20; i++) {
            System.out.printf("%nEscribe el número %d: ", i);
            numeros= sc.nextInt();
            if (numeros>0){
                positivos[i] =numeros;
                sumaPos+=positivos[i];
            }
            if (numeros<0){
                negativos[i] =numeros;
                sumaNeg+=negativos[i];
            }
        }

        System.out.printf("La suma de los números positivos: %d", sumaPos);
        System.out.printf("%nLa suma de los números negativos: %d", sumaNeg);
    }
}
