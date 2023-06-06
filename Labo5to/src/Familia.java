import personas.Persona;
import personas.PersonaCaloria;

import java.util.HashSet;

public class Familia {
    HashSet<PersonaCaloria>personas;

    public Familia() {
        personas = new HashSet<PersonaCaloria>();
    }

    public Familia(HashSet<PersonaCaloria> personas) {
        this.personas = personas;
    }

    public HashSet<PersonaCaloria> getPersonas() {
        return personas;
    }

    public void setPersonas(HashSet<PersonaCaloria> personas) {
        this.personas = personas;
    }
    public void agregarPersona(PersonaCaloria p1){
        personas.add(p1);
    }
    public double promedioCalorias(){
        double total = 0;
        for(PersonaCaloria p : personas){
            total += p.calcularCaloriasTotales();
        }
        return total/personas.size();
    }
    public PersonaCaloria mayorCantidadCalorias(){
        double mayor = 0;
        PersonaCaloria p1 = new PersonaCaloria();
        for(PersonaCaloria persona : personas){
            if(persona.calcularCaloriasTotales()>mayor){
                mayor = persona.calcularCaloriasTotales();
                p1 = persona;
            }
        }
        return p1;
    }

    public PersonaCaloria menorCantidadCalorias(){
        double menor = 0; int inicio = 0;
        PersonaCaloria p1 = new PersonaCaloria();
        for(PersonaCaloria persona : personas){
            if(inicio == 0 || persona.calcularCaloriasTotales()<menor){
                menor = persona.calcularCaloriasTotales();
                p1 = persona;
                inicio=1;
            }
        }
        return p1;
    }

}
