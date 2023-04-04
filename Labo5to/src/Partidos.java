public class Partidos {
    private Equipo e1;
    private Equipo e2;
    private int dia;
    private int horario;
    public Partidos(){
        e1 = new Equipo();
        e2 = new Equipo();
        dia = 1;
        horario = 1;
    }

    public Partidos(Equipo e1, Equipo e2, int dia, int horario) {
        this.e1 = e1;
        this.e2 = e2;
        this.dia = dia;
        this.horario = horario;
    }

    public Equipo getE1() {
        return e1;
    }

    public void setE1(Equipo e1) {
        this.e1 = e1;
    }

    public Equipo getE2() {
        return e2;
    }

    public void setE2(Equipo e2) {
        this.e2 = e2;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }


}
