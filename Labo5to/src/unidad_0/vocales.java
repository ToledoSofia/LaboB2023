package unidad_0;

public class vocales {
    public static void main(String[] args) {
        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        int cont = 0;
        for (int i = 0; i<frase.length(); i++){
            if(frase.charAt(i)=='a'|| frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u'
            || frase.charAt(i)=='A' || frase.charAt(i)=='E' || frase.charAt(i)=='I' || frase.charAt(i)=='O'||frase.charAt(i)=='U' || frase.charAt(i)=='á' || frase.charAt(i)=='é' || frase.charAt(i)=='í' || frase.charAt(i)=='ó'||frase.charAt(i)=='ú'){
                cont++;
            }
        }
        System.out.println("Cantidad de vocales: " + cont);
    }
}
