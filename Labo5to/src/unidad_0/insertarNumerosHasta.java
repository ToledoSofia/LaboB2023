package unidad_0;

import java.util.Scanner;

public class insertarNumerosHasta {
    public static void main(String[] args) {
        int numero, i = 0;
        System.out.println("Ingrese un numero");
        Scanner num = new Scanner(System.in);
        numero = num.nextInt();
        while(numero!=-1){
            System.out.println("Ingrese un numero");
            numero = num.nextInt();
            i++;
        }
        System.out.println("Cantidad de numeros ingresados: "+ i);
    }
}
