package mascotas;

import personas.Dueno;

public class Perro extends Mascota{
    private static int alegria = 1;
    private static String saludo =  "guau";
    public Perro (){
        super();
    }
    public Perro(String nombre, Dueno duenio){
        super(nombre, duenio);
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public static String getSaludo() {
        return saludo;
    }

    public static void setSaludo(String saludo) {
        Perro.saludo = saludo;
    }

    @Override
    public void alimentar(){
        alegria ++;
        //System.out.println("alegria +1");
    }
    @Override
    public void saludar(String nombreDuenio) {

            for(int i = 0; i<alegria; i++){
                if(nombreDuenio.equals(getDuenio().getNombre())){
                    System.out.print(saludo + " ");
                }else {
                    System.out.print(saludo.toUpperCase() + "! ");
                }
            }
            if(alegria>1){
                alegria --;
            }
    }
    @Override
    public void mostrarTipo(){
        System.out.println("Tipo: " + this.getClass().getCanonicalName());
    }

}
