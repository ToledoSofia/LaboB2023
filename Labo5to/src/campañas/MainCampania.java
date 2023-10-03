package campañas;

public class MainCampania {
    public static void main(String[] args) {
        Paloma paloma1 = new Paloma("paloma", true);
        Paloma paloma2 = new Paloma("amolap", false);

        TelefonoMovil telefono1 = new TelefonoMovil(true, true);
        TelefonoMovil telefono2 = new TelefonoMovil(true, false);

        Trabajador trabajador1 = new Trabajador("juan", 7, 17);
        Trabajador trabajador2 = new Trabajador("pepe", 18, 23);

        PartidoPolitico partido = new PartidoPolitico("partido1");

        partido.agregarMensajero(paloma1);
        partido.agregarMensajero(paloma2);
        partido.agregarMensajero(telefono1);
        partido.agregarMensajero(telefono2);
        partido.agregarMensajero(trabajador1);
        partido.agregarMensajero(trabajador2);

        partido.hacerCampania();
    }
}
