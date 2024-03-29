package mascotas;

import personas.Dueno;

import java.util.HashSet;

public class SistemaMascotas {
    HashSet<Mascota>mascotas;

    public SistemaMascotas() {
        mascotas  = new HashSet<Mascota>();
    }

    public SistemaMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public HashSet<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public  void agregarMascotas2(String nombre, Dueno duenio, Tipo tipo){
        if(tipo.equals(Tipo.PERRO)){
            mascotas.add(new Perro(nombre, duenio));
        }else if (tipo.equals(Tipo.GATO)) {
            mascotas.add(new Gato(nombre, duenio));
        } else if (tipo.equals(Tipo.PEZ)) {
            mascotas.add(new Pez(nombre, duenio));
        }else if (tipo.equals(Tipo.PAJARITO)) {
            mascotas.add(new Pajarito(nombre, duenio));
        }
    }
    public void agregarMascotas2(Mascota m){
        mascotas.add(m);
    }
    public void agregarMascota(String nombre, Dueno duenio, Tipo tipo) throws ClassNotFoundException {
        Class c = Class.forName(tipo.name());
        try {
            mascotas.add((Mascota) c.newInstance());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
       /* if(tipo == Tipo.PERRO){
            Perro perro = new Perro(nombre, duenio);
        }*/
    }
    public void eliminarMascota(Mascota eliminar){
        mascotas.remove(eliminar);
    }
    public void modificarMascota(Mascota modificar, Mascota nueva){
        mascotas.remove(modificar);
        mascotas.add(nueva);
    }
    public void saludar(String nombrePersona, String nombreMascota){
        boolean existe = false;
        boolean borrar = false;
        Pez muerto = new Pez();
        for(Mascota m : mascotas){
            if(m.getNombre().equals(nombreMascota)){
                m.saludar(nombrePersona);
                if(m instanceof Pez && ((Pez) m).getVidas() == 0){
                    muerto = (Pez) m ;
                    borrar = true;
                }
                existe = true;
            }
        }
        if(!existe){
            System.out.println("La mascota a la que quiere saludar no existe!");
        }else{
           if(borrar){
               mascotas.remove(muerto);
           }
        }
        //System.out.println();
    }
    public void alimentar(String nombremascota){
        boolean existe = false;
        for(Mascota m : mascotas){
            if(m.getNombre().equals(nombremascota)){
                m.alimentar();
                existe = true;
            }
        }
        if(!existe){
            System.out.println("La mascota que quiere alimentar no existe!");
        }
    }
}
