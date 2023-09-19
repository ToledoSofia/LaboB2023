package centroEducativo;

import objetos.SistemaPrestamos;

import java.util.HashSet;

public class MainCentro {
    public static void main(String[] args) {
        ExamenEscrito examen1 = new ExamenEscrito(20,6);
        ExamenEscrito examen2 = new ExamenEscrito(100,10);
        ExamenEscrito examen3 = new ExamenEscrito(20,5);
        ExamenEscrito examen4 = new ExamenEscrito(20,6);

        ExamenOral examen5 = new ExamenOral(Satisfaccion.EXCELENTE);
        ExamenOral examen6 = new ExamenOral(Satisfaccion.SUFICIENTE);
        ExamenOral examen7 = new ExamenOral(Satisfaccion.INSUFICIENTE);

        HashSet<Examen>examenes1 = new HashSet<>();
        examenes1.add(examen1);
        examenes1.add(examen4);
        examenes1.add(examen6);

        HashSet<Examen>examenes2 = new HashSet<>();
        examenes2.add(examen3);
        examenes2.add(examen4);
        examenes2.add(examen7);

        AlumnoCentro alumno1 = new AlumnoCentro("al1", examenes1);
        AlumnoCentro alumno2 = new AlumnoCentro("al2", examenes1);
        AlumnoCentro alumno3 = new AlumnoCentro("al3", examenes1);
        AlumnoCentro alumno4 = new AlumnoCentro("al4", examenes2);
        AlumnoCentro alumno5 = new AlumnoCentro("al5", examenes2);

        HashSet<AlumnoCentro>alumnos = new HashSet<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);

        CentroEducativo centro = new CentroEducativo(alumnos);
        System.out.println("Cantidad aprobados: " + centro.cantAprobados());
    }
}
