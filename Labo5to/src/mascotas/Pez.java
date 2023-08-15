package mascotas;

import personas.Dueno;

public class Pez extends Mascota{
    private static int vidas = 10;
    public Pez() {
        super();
    }

    public Pez(String nombre, Dueno duenio) {
        super(nombre, duenio);
    }

    public static int getVidas() {
        return vidas;
    }

    public static void setVidas(int vidas) {
        Pez.vidas = vidas;
    }

    @Override
    public void saludar(String nombreDuenio) {
        if(nombreDuenio.equals(getDuenio().getNombre())){
            vidas --;
        }else{
            vidas = 0;
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
