package personas;

import java.time.LocalDate;
import java.util.HashSet;

import platos.*;
public class PersonaCaloria extends Persona{
    private LocalDate fechaNacimiento;
    private HashSet<PlatoCaloria> platos;
    public PersonaCaloria(){
        super();
        fechaNacimiento = LocalDate.now();
        platos = new HashSet<PlatoCaloria>();
    }

    public PersonaCaloria(LocalDate fechaNacimiento) {
        super();
        this.fechaNacimiento = fechaNacimiento;
        platos = new HashSet<PlatoCaloria>();
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

}
