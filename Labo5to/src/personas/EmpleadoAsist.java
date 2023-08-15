package personas;
import diasTurnos.Dia;
import java.time.*;
import java.util.*;
public class EmpleadoAsist extends Persona{
    private int telefono;
    private LocalDateTime fechaNacimiento;
    private HashSet<Dia>dias;
    private HashSet<LocalDateTime> asistencias;

    public EmpleadoAsist(){
        super();
        telefono = 1;
        fechaNacimiento = LocalDateTime.now();
        dias = new HashSet<Dia>();
        asistencias = new HashSet<>();
    }

    public EmpleadoAsist(String nombre, HashSet<Dia> dias) {
        super(nombre);
        fechaNacimiento = LocalDateTime.now();
        this.dias = dias;
        asistencias = new HashSet<>();
    }
    public EmpleadoAsist(String nombre, HashSet<Dia> dias, HashSet<LocalDateTime>asistencias) {
        super(nombre);
        fechaNacimiento = LocalDateTime.now();
        this.dias = dias;
        this.asistencias = asistencias;
    }

    public HashSet<LocalDateTime> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(HashSet<LocalDateTime> asistencias) {
        this.asistencias = asistencias;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public HashSet<Dia> getDias() {
        return dias;
    }

    public void setDias(HashSet<Dia> dias) {
        this.dias = dias;
    }
    public void agregarAsistencia(){
        asistencias.add(LocalDateTime.now());
    }
    public double porcentajeMes(int mes){
        int cont = 0;
        for(LocalDateTime fecha : asistencias){
            if(fecha.getMonthValue() == (mes)){
                cont++;
            }
        }
        return cont*100/(dias.size()*4);
    }
    @Override
    public void mostrarDatos()  {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
    }
}
