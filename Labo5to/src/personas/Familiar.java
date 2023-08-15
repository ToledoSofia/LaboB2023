package personas;

import java.time.LocalDate;
import java.util.ArrayList;

import platos.*;
public class Familiar extends Persona{
    private LocalDate fechaNacimiento;
    private ArrayList<PlatoCaloria> platos;
    public Familiar(){
        super();
        fechaNacimiento = LocalDate.now();
        platos = new ArrayList<PlatoCaloria>();
    }

    public Familiar(String nombre) {
        super(nombre);
        fechaNacimiento = LocalDate.now();
        platos = new ArrayList<PlatoCaloria>();
    }

    public Familiar(LocalDate fechaNacimiento) {
        super();
        this.fechaNacimiento = fechaNacimiento;
        platos = new ArrayList<PlatoCaloria>();
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<PlatoCaloria> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<PlatoCaloria> platos) {
        this.platos = platos;
    }

    public void comerPlato(PlatoCaloria plato){
        platos.add(plato);
    }
    public double calcularCaloriasTotales(){
        double cal = 0;
        for(PlatoCaloria plato : platos){
            cal+=plato.getCalorias();
        }
        return cal;
    }
    @Override
    public void mostrarDatos()  {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
    }

}
