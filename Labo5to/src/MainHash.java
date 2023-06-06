import diasTurnos.Dia;
import personas.EmpleadoAsist;
import personas.PersonaCaloria;
import platos.PlatoCaloria;

import java.util.*;
public class MainHash {
    public static void main(String[] args) {
        //1)
        HashSet<Dia>dias = new HashSet<Dia>();
        dias.add(Dia.MIERCOLES);

        HashSet<Dia>dias2 = new HashSet<Dia>();
        dias2.add(Dia.LUNES);
        dias2.add(Dia.JUEVES);
        dias2.add(Dia.SABADO);
        dias2.add(Dia.DOMINGO);

        EmpleadoAsist e1 = new EmpleadoAsist("natalia", dias);
        EmpleadoAsist e2 = new EmpleadoAsist("belen", dias2);

        e1.agregarAsistencia();
        e1.agregarAsistencia();
        e1.agregarAsistencia();
        e1.agregarAsistencia();
        e2.agregarAsistencia();
        e2.agregarAsistencia();

        Asistencia asist = new Asistencia();
        asist.agregarEmpleado(e1);
        asist.agregarEmpleado(e2);
        System.out.println("cant mes e1: " + e1.porcentajeMes(5));
        System.out.println("cant mayor: " + asist.mayor80(5));

        //2)
        RegistroPeso reg1 = new RegistroPeso();
        Date fecha1 = new Date(2016,5,3);
        Date fecha4 = new Date(2016,10,3);
        Date fecha5 = new Date(2016,15,3);
        Date fecha6 = new Date(2016,20,3);

        Date fecha2 = new Date(2018,10,2);
        Date fecha3 = new Date(2020,6,4);
        reg1.agregarPesoAltura(fecha1,35,150);
        reg1.agregarPesoAltura(fecha4,37,150);
        reg1.agregarPesoAltura(fecha5,39,155);
        reg1.agregarPesoAltura(fecha6,39,155);

        reg1.agregarPesoAltura(fecha2,45,160);
        reg1.agregarPesoAltura(fecha3,65,175);

        System.out.println("peso: " + reg1.promedioAnio(2016).get(0));
        System.out.println("altura: " + reg1.promedioAnio(2016).get(1));
        reg1.diferenciarAnios(2018,2020);

        //3)
        PlatoCaloria p1 = new PlatoCaloria("plato1", 50);
        PlatoCaloria p2 = new PlatoCaloria("plato2", 100);
        PlatoCaloria p3 = new PlatoCaloria("plato3", 20);
        PlatoCaloria p4 = new PlatoCaloria("plato4", 200);

        PersonaCaloria per1 = new PersonaCaloria("per1");//300
        per1.comerPlato(p4);
        per1.comerPlato(p2);


        PersonaCaloria per2 = new PersonaCaloria("per2");//70
        per2.comerPlato(p3);
        per2.comerPlato(p1);


        PersonaCaloria per3 = new PersonaCaloria("per3");//12
        per3.comerPlato(p3);
        per3.comerPlato(p2);

        System.out.println("per1: " + per1.calcularCaloriasTotales());
        System.out.println("per2: " + per2.calcularCaloriasTotales());

        Familia familia = new Familia();
        familia.agregarPersona(per1);
        familia.agregarPersona(per2);
        familia.agregarPersona(per3);
        System.out.println("prom familia: " + familia.promedioCalorias());
        System.out.println("mayor cant: " + familia.mayorCantidadCalorias());
        System.out.println("menor cant: " + familia.menorCantidadCalorias());
    }
}
