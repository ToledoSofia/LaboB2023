package campañas;

public class Paloma extends Ave implements Mensajero{
    private boolean aprendioMapa;

    public Paloma() {
        super();
        aprendioMapa = false;
    }

    public Paloma(String nombre, boolean aprendioMapa) {
        super(nombre);
        this.aprendioMapa = aprendioMapa;
    }

    public boolean isAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }

    @Override
    public void enviarMensajeApoyo(String mensaje) {
        if(aprendioMapa){
            System.out.println("Lanzando un papelito que dice: " + mensaje);

        }else{
            System.out.println("la paloma no se sabe el mapa. una pena.");
        }
    }
}
