package EXAMEN_TEMA_4;/* Nombre: Mario Sánchez
* Ejercicio: Para un número de horas de alquiler, un tipo de bicicleta y
 saber si se contrata un seguro o no, realiza la factura del cliente que
 incluye: el nombre del cliente, tipo de bicicleta, si ha contratado seguro,
 tarifa base, recargo por horas, precio seguro y total. */

import java.util.Scanner;

public class AlquilerBici {
    public static void main(String[] args) {

        final int TARIFA_U = 6, TARIFA_M = 9, TARIFA_E = 15;

        String nombreApellidos;
        char tipoBicicleta, seguro;
        int horasAlquiler, caso=0, recargo = 0;
        double precioSeguro=0, total=0;
        Scanner sc = new Scanner(System.in);

        //ENTRADA: ENTRADA DE VARIABLES
        System.out.print("Nombre y apellidos del cliente: ");
        nombreApellidos = sc.nextLine();
        System.out.print("Tipo de bicicleta (U: urbana, M: montaña, E: eléctrica): ");
        tipoBicicleta = sc.next().charAt(0);
        System.out.print("Número de horas de alquiler: ");
        horasAlquiler = sc.nextInt();
        System.out.print("¿Quieres contratar seguro?(S=sí, cualquier otra letra=no): ");
        seguro = sc.next().charAt(0);
        Character.toUpperCase(seguro);

        //PROCESO: RESOLUCIÓN DEL EJERCICIO
        if (tipoBicicleta != 'U' && tipoBicicleta != 'M' && tipoBicicleta != 'E' && tipoBicicleta != 'u' && tipoBicicleta != 'm' && tipoBicicleta != 'e') {
            System.exit(0);
        }
        if (horasAlquiler < 1 || horasAlquiler > 24) {
            System.exit(0);
        }

        if (horasAlquiler >= 3 && horasAlquiler <= 8) {
            recargo = 4;
        } else if (horasAlquiler > 8) {
            recargo = 10;
        }
        if (seguro=='S'|| seguro=='s' && (tipoBicicleta == 'u' || tipoBicicleta == 'U') ){
            caso = 1;
            precioSeguro=(TARIFA_U+recargo)*0.2;
            total=recargo+precioSeguro+TARIFA_U;
        }
        if (seguro=='S'|| seguro=='s' && (tipoBicicleta == 'm' || tipoBicicleta == 'M') ){
            caso = 2;
            precioSeguro=(TARIFA_M+recargo)*0.2;
            total=recargo+precioSeguro+TARIFA_M;
        }
        if (seguro=='S'|| seguro=='s' && (tipoBicicleta == 'e' || tipoBicicleta == 'E') ){
            caso = 3;
            precioSeguro=(TARIFA_E+recargo)*0.2;
            total=recargo+precioSeguro+TARIFA_E;
        }


        //SALIDA: RESULTADO DE LO OBTENIDO
        System.out.printf("Cliente: %s", nombreApellidos);
        System.out.printf("Tipo(U/M/E: %c", tipoBicicleta);
        System.out.printf("Horas: %d ", horasAlquiler);
        System.out.printf("Seguro (S/N): %c ", seguro);
        System.out.printf("Alquiler para: %s (tipo %c)", nombreApellidos, tipoBicicleta);
        System.out.printf("%-16s%8d h%n", "Horas", horasAlquiler);
        switch (caso){
            case 1 -> System.out.printf("%-16s%8.2f €%n", "Tarifa base", TARIFA_U);
            case 2 -> System.out.printf("%-16s%8.2f €%n", "Tarifa base", TARIFA_M);
            case 3 -> System.out.printf("%-16s%8.2f €%n", "Tarifa base", TARIFA_E);
        }
        System.out.printf("%-16s%8.2f €%n", "Recargo horas", recargo);
        System.out.printf("%-16s%8.2f €%n", "Seguro", precioSeguro);
        System.out.printf("%-16s%8.2f €%n", "Total", total);

    }
}