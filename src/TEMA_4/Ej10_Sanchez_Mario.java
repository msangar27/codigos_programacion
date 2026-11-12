package TEMA_4;

import java.util.Scanner;

public class Ej10_Sanchez_Mario {
    public static void main(String[] args) {
        String nombre;
        double horas, tarifa, salario, impuestos, salarioNeto;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce su nombre: ");
        nombre = sc.next();
        System.out.print("Introduce las horas trabajadas: ");
        horas = sc.nextDouble();
        System.out.print("Introduce la tarifa por hora trabajada: ");
        tarifa = sc.nextDouble();


        if (horas>35){
            salario= (horas-35)*tarifa*1.5 + tarifa*35;
        }else {
            salario= tarifa*horas;
        }
        if (salario <= 500) {
            impuestos = 0;
            salarioNeto = salario;
        } else if (salario <= 900) {
            impuestos = (salario - 500) * 0.25;
            salarioNeto = salario - impuestos;
        } else {
            impuestos = (salario - 900) * 0.45+ 400*0.25;
            salarioNeto = salario - impuestos;
        }
        System.out.printf("\n Trabajador: %s \n Salario: %.2f€ \n Impuestos: %.2f€ \n Salario Neto: %.2f€", nombre, salario, impuestos, salarioNeto);
    }
}
