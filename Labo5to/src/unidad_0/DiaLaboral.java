package unidad_0;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        System.out.println("Ingrese un dia de la semana en minuscula");
        Scanner semana = new Scanner(System.in);
        String dia = semana.nextLine();
        if(dia.equals("sabado") || dia.equals("sábado") || dia.equals("domingo")){
            System.out.println("Día NO laboral");
        }else{
            System.out.println("Día laboral");
        }
    }
}
