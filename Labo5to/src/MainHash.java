import diasTurnos.Dia;
import lugares.*;
import personas.EmpleadoAsist;
import personas.Familiar;
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

        Familiar per1 = new Familiar("per1");//300
        per1.comerPlato(p4);
        per1.comerPlato(p2);


        Familiar per2 = new Familiar("per2");//70
        per2.comerPlato(p3);
        per2.comerPlato(p1);


        Familiar per3 = new Familiar("per3");//12
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

        //5
        System.out.println("------------------------------------");
        Barrio b1 = new Barrio("barrio1", 1000,1500);
        Barrio b2 = new Barrio("barrio2", 1001,1000);
        Barrio b3 = new Barrio("barrio3", 1002,500);
        Barrio b4 = new Barrio("barrio4", 1003,1800);

        Ciudad c1 = new Ciudad("ciudad1", 2000);//4300
            c1.agregarBarrio(b1);
            c1.agregarBarrio(b2);
            c1.agregarBarrio(b4);
        Ciudad c2 = new Ciudad("ciudad2", 2001);//3300
            c2.agregarBarrio(b2);
            c2.agregarBarrio(b4);
            c2.agregarBarrio(b3);
        Ciudad c3 = new Ciudad("ciudad3", 2002);//1500
            c3.agregarBarrio(b3);
            c3.agregarBarrio(b2);


        Provincia prov1 = new Provincia("provincia1", 3000);//5800
            prov1.agregarCiudad(c1);
            prov1.agregarCiudad(c3);
        Provincia prov2 = new Provincia("provincia2", 3001);//7600
            prov2.agregarCiudad(c1);
            prov2.agregarCiudad(c2);

        Provincia prov3 = new Provincia("provincia3", 3002);//4800
            prov3.agregarCiudad(c2);
            prov3.agregarCiudad(c3);


        Pais pais1 = new Pais("pais1",4000);//5800
            pais1.agregarProvincia(prov1);
        Pais pais2 = new Pais("pais2",4001);//13400
            pais2.agregarProvincia(prov1);
            pais2.agregarProvincia(prov2);
        Pais pais3 = new Pais("pais3",4002);//12400
            pais3.agregarProvincia(prov2);
            pais3.agregarProvincia(prov3);


        Continente cont1 = new Continente("cont1",5000);//31600
            cont1.agregarPais(pais1);
            cont1.agregarPais(pais2);
            cont1.agregarPais(pais3);
        Continente cont2 = new Continente("cont2",5001);//19200
            cont2.agregarPais(pais1);
            cont2.agregarPais(pais2);
        Continente cont3 = new Continente("cont3",5002);//25800
            cont3.agregarPais(pais3);
            cont3.agregarPais(pais2);


        SistemaLugares sist1 = new SistemaLugares();
        sist1.agregarLugar(cont2);
        sist1.agregarLugar(cont1);
        sist1.agregarLugar(cont3);
        sist1.agregarLugar(pais3);
        sist1.agregarLugar(pais2);
        sist1.agregarLugar(pais1);
        sist1.agregarLugar(prov1);
        sist1.agregarLugar(prov2);
        sist1.agregarLugar(prov3);
        sist1.agregarLugar(c1);
        sist1.agregarLugar(c3);
        sist1.agregarLugar(c2);
        sist1.agregarLugar(b1);
        sist1.agregarLugar(b2);
        sist1.agregarLugar(b3);

        System.out.println(sist1.paisMayorPoblacion().toString());
        System.out.println(sist1.paisMenorPoblacion().toString());
        System.out.println(sist1.continenteMasPoblado().toString());
        System.out.println(sist1.continenteMenosPoblado().toString());

        sist1.calcularPoblacion(1000);
        sist1.calcularPoblacion(2000);
        sist1.calcularPoblacion(3000);
        sist1.calcularPoblacion(4000);
        sist1.calcularPoblacion(5000);
        sist1.calcularPoblacion(8182);

    }
}
