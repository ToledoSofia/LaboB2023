package unidad_0;

import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        System.out.println("ingrese una letra");
        Scanner caracter = new Scanner(System.in);
        String letra = caracter.nextLine();
        frase = frase.replaceAll("e",letra);
        System.out.println("la frase modificada es: " + frase);
    }
}
