public class Partido {
    private Equipo e1;
    private Equipo e2;
    private String dia;
    private String horario;
    public Partido(){
        e1 = new Equipo();
        e2 = new Equipo();
        dia = "";
        horario = "";
    }

    public Partido (Equipo e1, Equipo e2){//falta 0
        this.e1 = e1;
        this.e2 = e2;
        int j = 0;
        while(e1.getTurno().get(j) != e2.getTurno().get(j) && j<6){
            j++;
        }
        if(e1.getTurno().get(j) == e2.getTurno().get(j)){
            dia = palabrasDia(j+1);
            if(e1.getTurno().get(j)==1){
                horario = "mañana";
            }else if (e1.getTurno().get(j) == 2){
                horario = "tarde";
            }else{
                horario = "noche";
            }
        }
    }

    public Partido(Equipo e1, Equipo e2, String dia, String horario) {
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
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
