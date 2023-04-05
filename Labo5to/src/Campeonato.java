import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Equipo>equipos;
    private ArrayList<Partidos>partidos;
    public Campeonato (){
        equipos = new ArrayList<Equipo>();

        partidos = new ArrayList<Partidos>();
    }
    public Campeonato(ArrayList<Equipo>equipos){
        this.equipos = equipos;
        partidos = new ArrayList<Partidos>();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    public ArrayList<Partidos> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partidos> partidos) {
        this.partidos = partidos;
    }
    /*
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void agregarEquipo(Equipo equipo){
        equipos.add(equipo);
    }
    public void armarFixture(){//algo debe funcionar pero no me gusta pq le faltan cosas
        ArrayList<Equipo>restantes = equipos;
        Equipo e1;
        Partidos p1 = new Partidos(), p2 = new Partidos();
        ArrayList<Integer>turnos1, turnos2;
        boolean coinciden;
        int j = 1;
        while( restantes.size()<=1 || j<equipos.size()){
            coinciden = false;
            turnos1 = equipos.get(0).getTurno();
            turnos2 = equipos.get(j).getTurno();
            for(int i = 1; !coinciden && i<turnos1.size(); i++){
                if(turnos1.get(i) == turnos2.get(i)){
                    coinciden = true;
                    p1.setE1(equipos.get(0));
                    p2.setE2(equipos.get(i));
                    p1.setDia(i);
                    p2.setDia(i);
                    p1.setHorario(equipos.get(0).getTurno().get(i));
                    p2.setHorario(equipos.get(i).getTurno().get(i));

                    partidos.add(p1);
                    restantes.remove(j);
                    restantes.remove(0);
                }
            }
            e1 = equipos.get(0);
            j++;
        }
    }*/
    public void agregarEquipo(Equipo equipo){
        equipos.add(equipo);
    }
    public void armarPartidos(){
        Equipo e1, e2;
        ArrayList<Equipo>equipos2 = equipos;
        int j = 0;
        Partidos p1;
        while(equipos2.size()>1) {
            for (int i = 1; i < equipos2.size(); i++) {//usar con en vez de duplicar arraylist
                e1 = equipos2.get(0);
                e2 = equipos2.get(i);
                j = 0;
                while (e1.getTurno().get(j) != e2.getTurno().get(j) && j < 6) {
                    j++;
                }
                if (e1.getTurno().get(j) == e2.getTurno().get(j)) {
                    p1 = new Partidos(e1, e2);
                    partidos.add(p1);
                }
            }
             equipos2.remove(0);
        }
    }

    /*public void agregarPartido(Equipo equipo1, Equipo equipo2){
        Partidos p1 = new Partidos();
        ArrayList<Integer>turno1 = equipo1.getTurno();
        ArrayList<Integer>turno2 = equipo2.getTurno();
        boolean coinciden = false;
        int i;
        for(i = 0; i<turno1.size() && !coinciden; i++){
            if(turno1.get(i) == turno2.get(i)){
                coinciden = true;
            }
        }
        if(coinciden){
            p1.setDia(i);
            p1.setHorario(turno1.get(i));
            p1.setE1(equipo1);
            p1.setE2(equipo2);
            partidos.add(p1);
        }else{
            System.out.println("No se pudo agregar partido porque los horarios nunca coinciden");
        }
    }*/
    public void mostrarFixture(){
        int i = 1;
        for(Partidos partido:partidos){
            System.out.println("--------------------");
            System.out.println("PARTIDO " + i);
            System.out.println(partido.getE1().getNombre() + " vs " + partido.getE2().getNombre());
            System.out.println("Dia: " + partido.getDia() + "\nTurno: " + partido.getHorario());
            i++;
        }
    }
}
