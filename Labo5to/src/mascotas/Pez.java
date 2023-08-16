package mascotas;

import personas.Dueno;

public class Pez extends Mascota{
    private int vidas;
    public Pez() {
        super();
        vidas = 10;
    }

    public Pez(String nombre, Dueno duenio) {
        super(nombre, duenio);
        vidas = 10;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public void saludar(String nombreDuenio) {
        if(nombreDuenio.equals(getDuenio().getNombre())){
            vidas --;
        }else{
            vidas = 0;
            System.out.println("Mataste a " + this.getNombre() + " :(");
        }
    }
    public void alimentar(){
        vidas ++;
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: " + this.getClass().getCanonicalName());
    }
}
