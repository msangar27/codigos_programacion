import java.util.Scanner;

public class EjemploSwitch {
    public static void main (String[] args){
        int diaSemana;
        Scanner sc= new Scanner(System.in);

        System.out.print("Día de la semana (1=lunes, 7=domingo)");
        diaSemana=sc.nextInt();
        switch (diaSemana){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
        }
        switch (diaSemana){
            case 1,2,3,4,5-> System.out.println("Es entre semana");
            case 6,7-> System.out.println("Es finde semana");
        }
    }
}
