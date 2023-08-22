package mascotas;

import personas.Dueno;

public class Gato extends Mascota{
    private int alegria;
    private String saludo = "miau";
    public Gato(){
        super();
    }
    public Gato(String nombre, Dueno duenio) {
        super(nombre, duenio);
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
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
