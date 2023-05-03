import diasTurnos.*;
public class Partido {
    private Equipo e1;
    private Equipo e2;
    private Dia dia;
    private Turno horario;
    public Partido(){
        e1 = new Equipo();
        e2 = new Equipo();
        dia = Dia.SABADO;
        horario = Turno.TARDE;
    }
    public Partido(Equipo e1, Equipo e2, Turno turno, Dia dia) {
        this.e1 = e1;
        this.e2 = e2;
        this.horario = turno;
        this.dia = dia;
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

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Turno getHorario() {
        return horario;
    }

    public void setHorario(Turno horario) {
        this.horario = horario;
    }

    public String palabrasDia(int num){
        switch(num){
            case 1:
                return "lunes";
            case 2 :
                return "martes";
            case 3:
                return "miércoles";
            case 4:
                return "jueves";
            case 5:
                return "viernes";
            default:
                return "sabado";
        }
    }
}
