import materias.Materia;
import personas.Alumno;

import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {
        //ej1
    /*
        ArrayList<Integer>numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        System.out.println("Ingrese la cantidad de numeros que quiere ingresar");
        int cantidad = sc.nextInt();

        int suma = 0;
        for(int i = 0; i<cantidad; i++) {
            System.out.println("ingrese un numero");
            numeros.add(sc.nextInt());
            suma += numeros.get(i);
        }
        System.out.println("Suma: " + suma);

        //ej2
        Scanner sc = new Scanner(System.in);
        ArrayList<String>palabras = new ArrayList<String>();
        System.out.println("ingrese la cantidad de palabras que quiere ingresar");
        int cantidad2 = sc.nextInt();
        System.out.println("ingrese una letra");
        char letra = sc.next().charAt(0);
        sc.nextLine();

        for(int i = 0;i<cantidad2; i++){
            System.out.println("ingrese una palabra");
            palabras.add(sc.nextLine());
        }
        for(String palabra : palabras){
            if(palabra.charAt(0) == letra){
                System.out.println(palabra);
            }
        }
        //ej3
        ArrayList<personas.Persona>personas = new ArrayList<personas.Persona>();
        personas.add(new personas.Persona("Natalia",17,"Calle1 1234"));
        personas.add(new personas.Persona("Belen",34,"Calle2 1234"));
        personas.add(new personas.Persona("Bianca",47,"Calle3 1234"));
        for(personas.Persona p1 : personas){
            if(p1.getEdad()>30){
                System.out.println("----------------");
                System.out.println("Nombre: " + p1.getNombre() + "\nEdad: " + p1.getEdad() + "\nDireccion: " + p1.getDireccion());
            }
        }

        //4
        CD cd1 =  new CD();
        personas.Persona p1 = new personas.Persona("Sofia",17,"errerre");
        Cancion c1 = new Cancion("titulo", p1);
        cd1.getCanciones().add(c1);
        cd1.getCanciones().add(new Cancion());
        cd1.getCanciones().add(new Cancion());

        System.out.println(cd1.numeroCanciones());
        cd1.elimina(1);
        System.out.println(cd1.numeroCanciones());
        System.out.println(cd1.verCancion(0).getTitulo());
        cd1.agrega(c1);
        cd1.grabaCancion(1,c1);
        System.out.println(cd1.verCancion(1).getTitulo());
*/
        //5
        ArrayList<Double>notas = new ArrayList<Double>();
        ArrayList<Double>notas2 = new ArrayList<Double>();
        notas.add(2.0);
        notas.add(-3.0);
        notas.add(10.0);
        Materia m1 = new Materia("Laboratorio", notas);
        Materia m2 = new Materia("Matematica", notas2);

        Alumno alumno1 = new Alumno("nombre", "apellido");
        m1.agregarNota(5);
        m1.agregarNota(2);
        m1.agregarNota(10);

        m2.agregarNota(5);
        m2.agregarNota(2);
        m2.agregarNota(10);

        alumno1.agregarMateria(m1);
        alumno1.agregarMateria(m2);
        System.out.println("menor: " + m1.menorNota());
        System.out.println("mayor: " + m2.mayorNota());

        System.out.println("promedio total: " + alumno1.promedioAlumno());
        System.out.println("promedio materia1: " + alumno1.getMaterias().get(0).promedioMateria());
    }
}
