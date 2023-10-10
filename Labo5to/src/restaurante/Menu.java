package restaurante;

import java.util.HashSet;

public class Menu implements Restaurante{
    private String nombre;
    private HashSet<Plato1>platos;
    private HashSet<Chef>chefs;

    public Menu() {
        platos = new HashSet<>();
        chefs = new HashSet<>();
    }

    public Menu(String nombre) {
        this.nombre = nombre;
        platos = new HashSet<>();
        chefs = new HashSet<>();
    }

    public Menu(HashSet<Plato1> platos, HashSet<Chef> chefs) {
        this.platos = platos;
        this.chefs = chefs;
    }

    public HashSet<Plato1> getPlatos() {
        return platos;
    }

    public void setPlatos(HashSet<Plato1> platos) {
        this.platos = platos;
    }

    public HashSet<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(HashSet<Chef> chefs) {
        this.chefs = chefs;
    }
    public void eliminarChef(Chef chef){
        if(!chefs.contains(chef)){
            chefs.remove(chef);
        }
    }
    public void modificarChef(Chef modificar, Chef nuevo) throws Exception {
        eliminarChef(modificar);
        Contratar(nuevo);
    }
    public void eliminarPlato(Plato1 plato){
        if(platos.contains(plato)){
            platos.remove(plato);
        }
    }
    public void modificarPlato(Plato1 modificar, Plato1 nuevo) throws Exception {
        eliminarPlato(modificar);
        Incorporar(nuevo);
    }

    @Override
    public void Incorporar(Plato1 plato) throws Exception {
        if(platos.contains(plato)){
            throw new PlatoNoPuedeSerIncorporadoException("El plato ya esta en el menu");
        }
        if(!chefs.contains(plato.getChefACargo())){
            throw new PlatoNoPuedeSerIncorporadoException("El chef a cargo del plato no es parte del restaurante");
        }
        platos.add(plato);
        System.out.println("El plato " + plato + " se agrego al menu del restaurante " + nombre);
    }

    @Override
    public void Contratar(Chef chef) throws Exception {
        if(chef.getEdad() < 18){
            throw new ChefNoPuedeSerContratadoException("El chef no es mayor de edad");
        }
        if(!chef.isExp()){
            throw new ChefNoPuedeSerContratadoException("El chef no tiene experiencia culinaria previa");
        }
        chefs.add(chef);
        System.out.println("El chef " + chef.getNombre() + " se unio al equipo de " + nombre);
    }

    public static void main(String[] args) {
        Chef c1 = new Chef("chef1", "ap1",25, true);//si
        Chef c4 = new Chef("chef4", "ap4",30, true);//si
        Chef c2 = new Chef("chef2", "ap2",16, true);//menor
        Chef c3 = new Chef("chef3", "ap3",25, false);//no xp

        Plato1 p1 = new Plato1("plato1", c1);//si
        Plato1 p2 = new Plato1("plato2", c4);//chef no existe


        Menu restaurante = new Menu("Hamburgalia");
        try {
            restaurante.Contratar(c1);//si
            //restaurante.Contratar(c2);//no
            restaurante.Contratar(c3);//no
        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            restaurante.Incorporar(p1);
            //restaurante.Incorporar(p2);
            restaurante.Incorporar(p1);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
