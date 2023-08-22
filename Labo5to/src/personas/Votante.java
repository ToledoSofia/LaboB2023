package personas;

import java.util.Date;

public class Votante extends Persona{
    private int dni;
    private Date fechaNacimiento;
    private boolean yaVoto;
    private String nacionalidad;
    private String provincia;

    public Votante() {
        super();
        yaVoto = false;
        fechaNacimiento = new Date();
    }

    public Votante(String nombre, String nacionalidad, String provincia) {
        super(nombre);
        this.nacionalidad = nacionalidad;
        this.provincia = provincia;
    }

    public Votante(String nombre, int dni, Date fechaNacimiento, boolean yaVoto, String nacionalidad, String provincia) {
        super(nombre);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.yaVoto = yaVoto;
        this.nacionalidad = nacionalidad;
        this.provincia = provincia;
    }

    public Votante(String nombre,int dni, boolean yaVoto, String nacionalidad, String provincia) {
        super(nombre);
        this.yaVoto = yaVoto;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.provincia = provincia;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isYaVoto() {
        return yaVoto;
    }

    public void setYaVoto(boolean yaVoto) {
        this.yaVoto = yaVoto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public void mostrarDatos() {

    }
}
