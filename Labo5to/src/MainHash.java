import diasTurnos.Dia;
import personas.EmpleadoAsist;

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
        //probar 3
    }
}
