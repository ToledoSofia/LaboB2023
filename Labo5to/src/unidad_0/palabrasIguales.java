package unidad_0;

import java.util.Scanner;

public class palabrasIguales {
    public static void main(String[] args) {
        System.out.println("Ingrese la primer palabra");
        Scanner palabra1 = new Scanner(System.in);
        String p1 = palabra1.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String p2 = palabra1.nextLine();
        if(p1.equals(p2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras NO son iguales");
        }
    }
}
