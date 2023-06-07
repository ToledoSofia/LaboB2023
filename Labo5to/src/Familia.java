import personas.Familiar;

import java.util.HashSet;

public class Familia {
    HashSet<Familiar>personas;

    public Familia() {
        personas = new HashSet<Familiar>();
    }

    public Familia(HashSet<Familiar> personas) {
        this.personas = personas;
    }

    public HashSet<Familiar> getPersonas() {
        return personas;
    }

    public void setPersonas(HashSet<Familiar> personas) {
        this.personas = personas;
    }
    public void agregarPersona(Familiar p1){
        personas.add(p1);
    }
    public double promedioCalorias(){
        double total = 0;
        for(Familiar p : personas){
            total += p.calcularCaloriasTotales();
        }
        return total/personas.size();
    }
    public Familiar mayorCantidadCalorias(){
        double mayor = 0;
        Familiar p1 = new Familiar();
        for(Familiar persona : personas){
            if(persona.calcularCaloriasTotales()>mayor){
                mayor = persona.calcularCaloriasTotales();
                p1 = persona;
            }
        }
        return p1;
    }

    public Familiar menorCantidadCalorias(){
        double menor = 0; int inicio = 0;
        Familiar p1 = new Familiar();
        for(Familiar persona : personas){
            if(inicio == 0 || persona.calcularCaloriasTotales()<menor){
                menor = persona.calcularCaloriasTotales();
                p1 = persona;
                inicio=1;
            }
        }
        return p1;
    }

}
