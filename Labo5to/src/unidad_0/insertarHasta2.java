package unidad_0;

import java.util.Scanner;

public class insertarHasta2 {
    public static void main(String[] args) {
        int numero, i = 0, mayor, menor, suma, sumaPositivos = 0, sumaNegativos = 0;
        System.out.println("Ingrese un numero");
        Scanner num = new Scanner(System.in);
        numero = num.nextInt();
        mayor = numero; menor = numero; suma = numero;
        while(numero!=-1){
            System.out.println("Ingrese un numero");
            numero = num.nextInt();
            if(numero != -1) {
                suma = suma + numero;
                if (numero > 0) {
                    sumaPositivos = sumaPositivos + numero;
                } else {
                    sumaNegativos = sumaNegativos + numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
                if (numero > mayor) {
                    mayor = numero;
                }
            }
            i++;
        }
        System.out.println("Cantidad de numeros ingresados: "+ i);
        System.out.println("mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Suma Total: " + suma);
        System.out.println("Suma positivos: " + sumaPositivos);
        System.out.println("Suma negativos: " + sumaNegativos);
    }
}
//mayor, menor, suma, suma positivos y suma negativos.