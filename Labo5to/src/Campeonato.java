import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Equipo>equipos;
    private ArrayList<Partido>partidos;
    public Campeonato (){
        equipos = new ArrayList<Equipo>();

        partidos = new ArrayList<Partido>();
    }
    public Campeonato(ArrayList<Equipo>equipos){
        this.equipos = equipos;
        partidos = new ArrayList<Partido>();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
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
        Equipo e1 =  new Equipo(), e2 = new Equipo();
        Partido p1;
        for(int i = 0; i<equipos.size()-1; i++){
            for(int j = i+1; j<equipos.size(); j++){
                e1 = equipos.get(i);
                e2 = equipos.get(j);
                if (e1.getTurno().get(j) == e2.getTurno().get(j)) {
                    p1 = new Partido(e1, e2);
                    partidos.add(p1);
                }
            }
        }
    }

    public void mostrarFixture(){
        int i = 1;
        for(Partido partido:partidos){
            System.out.println("--------------------");
            System.out.println("PARTIDO " + i);
            System.out.println(partido.getE1().getNombre() + " vs " + partido.getE2().getNombre());
            System.out.println("Dia: " + partido.getDia() + "\nTurno: " + partido.getHorario());
            i++;
        }
    }
}
