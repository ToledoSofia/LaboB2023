package mascotas;

import personas.Dueno;

public class MainMascotas {
    public static void main(String[] args) throws ClassNotFoundException {
        SistemaMascotas sistema = new SistemaMascotas();
        Dueno d1 = new Dueno("dueño1");
        Dueno d2 = new Dueno("dueño2");
        Dueno d3 = new Dueno("dueño3");
        Dueno d4 = new Dueno("dueño4");

        sistema.agregarMascotas2("Juan", d1, Tipo.PEZ);
        sistema.agregarMascotas2("Pedro", d2, Tipo.PERRO);
        sistema.agregarMascotas2("Raul", d4, Tipo.PAJARITO);
        sistema.agregarMascotas2("Nati", d3, Tipo.PERRO);
        sistema.agregarMascotas2("Bel", d4, Tipo.GATO);
        sistema.agregarMascotas2("Bian", d1, Tipo.PEZ);

        Perro perro = new Perro("perrrrrrro", d2);
        perro.mostrarTipo();

        sistema.saludar("dueño4", "Raul");
        sistema.saludar("dueño1", "Pedro");
        sistema.saludar("dueño2", "Pedro");
        sistema.saludar("dueño1", "Bian");
        sistema.saludar("dueño2", "Bian");//otro dueño

        sistema.alimentar("Pedro");
        sistema.alimentar("Pedro");
        sistema.alimentar("Pedro");
        sistema.alimentar("Pedro");
        sistema.alimentar("Pedro");
        sistema.saludar("dueño1", "Pedro");
        sistema.saludar("dueño1", "Pedro");
        sistema.saludar("dueño1", "Pedro");
        sistema.saludar("dueño1", "Pedro");
        sistema.saludar("dueño1", "Pedro");
        sistema.saludar("dueño1", "Pedro");
        sistema.saludar("dueño1", "Pedro");

        sistema.alimentar("Bian");// no existe mas


    }
}
