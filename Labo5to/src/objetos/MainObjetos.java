package objetos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class MainObjetos {
    public static void main(String[] args) {
        ArrayList<Integer>paginas = new ArrayList<>();
        paginas.add(0);
        paginas.add(2);
        paginas.add(3);
        paginas.add(2);
        paginas.add(1);

        Libro2 l1 = new Libro2("l1" , paginas);

        ArrayList<Integer>paginas2 = new ArrayList<>();
        paginas2.add(0);
        paginas2.add(2);
        paginas2.add(3);
        paginas2.add(2);
        Libro2 l2 = new Libro2("l2" , paginas2);

        Revista r1 = new Revista(1234, "r1", 2022, LocalDateTime.parse("2023-09-02T00:00:00"));
        Revista r2 = new Revista(2345, "r2", 2005, LocalDateTime.parse("2005-03-03T00:00:00"));

        Pantalon p1 = new Pantalon("marcakcy",true);
        Pantalon p2 = new Pantalon("marca2",false);

        Remera remera1 = new Remera("marca3", true);
        Remera remera2 = new Remera("marca4", false);

        SistemaPrestamos sistema = new SistemaPrestamos();

        sistema.agregarElemento(l1);//no
        sistema.agregarElemento(l2);//si
        sistema.agregarElemento(r1);//no
        sistema.agregarElemento(r2);//si
        sistema.agregarElemento(p1);//si
        sistema.agregarElemento(p2);//no
        sistema.agregarElemento(remera1);//si
        sistema.agregarElemento(remera2);//no

        System.out.println();
        sistema.prestar(l1);
        sistema.prestar(l2);
        sistema.prestar(r1);
        sistema.prestar(r2);
        sistema.prestar(p1);
        sistema.prestar(p2);
        sistema.prestar(remera1);
        sistema.prestar(remera2);
    }
}
