import java.util.Date;
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        this.dia = 1;
        this. mes  = 1;
        this.anio = 1900;
    }
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void valida(){
        Date fecha = new Date();
        int day = fecha.getDay();
        int month = fecha.getMonth();
        int year = fecha.getYear();
        if(dia != day) dia = 1;
        if(mes != month) mes = 1;
        if(anio != year) anio = 1900;
    }
    public int diaMes(int m){
        switch(m){
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
                break;
            case 2:
                return 29;
                break;
            default:
                return 31;
                break;
        }
    }
    public void corta(){
        System.out.println(dia + " - " + mes +" - " + anio);
    }
    public void larga(){
        Date fecha = new Date(anio, mes, dia);

        String mesLetras;
    }
}
