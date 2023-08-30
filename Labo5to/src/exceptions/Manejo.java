package exceptions;

public class Manejo {
    public static void manejarExcp() throws NullPointerException {
        String nombre = null;
        System.out.println("El largo del nombre es: " + nombre.length());
    }

    /*public static void manejarExcp2(){
        String nombre = null;
        System.out.println("El largo del nombre es: " + nombre.length());
    }throw new NullPointerException("aaaaaaaa");*/
}
