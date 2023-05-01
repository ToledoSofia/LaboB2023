package personas;

public class ClienteBanco extends Persona{
    private int cuil;
    public ClienteBanco(){
        super();
        cuil = 0;
    }

    public ClienteBanco(String nombre, String apellido, int edad,  int cuil) {
        super(nombre, apellido, edad);
        this.cuil = cuil;
    }


    public ClienteBanco(int cuil){
        super();
        this.cuil = cuil;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "ClienteBanco{" +
                "cuil=" + cuil +
                '}';
    }
}
