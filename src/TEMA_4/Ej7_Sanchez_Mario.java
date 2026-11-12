package TEMA_4;

import java.util.Scanner;

public class Ej7_Sanchez_Mario {
    public static void main (String[] args){
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 3 números y los ordenaremos de menor a mayor");

        System.out.print("Escribe el primer número");
        num1= sc.nextInt();

        System.out.print("Escribe el segundo número");
        num2= sc.nextInt();

        System.out.print("Escribe el tercero número");
        num3= sc.nextInt();

        if (num1>num2 && num1>num3 && num2>num3){
            System.out.printf("%d %d %d",num3, num2, num1);
        }
        if (num1>num2 && num1>num3 && num3>num2){
            System.out.printf("%d %d %d",num2, num3, num1);
        }
        if (num2>num1 && num1>num3 && num2>num3){
            System.out.printf("%d %d %d",num3, num1, num2);
        }
        if (num2>num1 && num3>num1 && num2>num3){
            System.out.printf("%d %d %d",num1, num3, num2);
        }
        if (num3>num2 && num3>num1 && num1>num2){
            System.out.printf("%d %d %d",num2, num1, num3);
        }
        if (num2>num1 && num3>num1 && num3>num2){
            System.out.printf("%d %d %d",num1, num2, num3);
        }
        if (num2==num1 && num3==num1){
            System.out.printf("%d %d %d",num1, num2, num3);
        }
        if (num2==num1 && num3>num1){
            System.out.printf("%d %d %d",num1, num2, num3);
        }
        if (num2==num1 && num3<num1){
            System.out.printf("%d %d %d",num3, num2, num1);
        }
        if (num2==num3 && num3<num1){
            System.out.printf("%d %d %d",num3, num2, num1);
        }
        if (num2==num3 && num3>num1){
            System.out.printf("%d %d %d",num1, num2, num3);
        }
        if (num3==num1 && num3<num2){
            System.out.printf("%d %d %d",num3, num1, num2);
        }
        if (num3==num1 && num3>num2){
            System.out.printf("%d %d %d",num2, num3, num1);
        }
    }
}
