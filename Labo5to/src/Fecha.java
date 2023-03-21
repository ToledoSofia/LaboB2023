import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
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

    public void valida() {
        if (anio < 1) {
            anio = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (dia < 1) {
            dia = 1;
        } else {
            switch (mes) {
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia > 30) {
                        dia = 1;
                    }
                    break;
                case 2:
                    if (anio % 4 == 0 && anio % 400 == 0 && anio % 100 != 0) {
                        if (dia > 29) {
                            dia = 1;
                        }
                    } else if (dia > 28) {
                        dia = 1;
                    }
                    break;
                default:
                    if (dia > 31) {
                        dia = 1;
                    }
            }
        }
    }

    public int diaMes(int m) {//febrero
        int cantidadDias = 0;
        switch (m) {
            case 4:
            case 6:
            case 9:
            case 11:
                cantidadDias = 30;
            break;
            case 2:
                if (anio % 4 == 0 && anio % 400 == 0 && anio % 100 != 0) {
                    cantidadDias = 29;
                }else{
                    cantidadDias =  28;
                }

                break;
            default:
                cantidadDias = 31;
            break;
        }
        return cantidadDias;
    }

    public void corta() {
        System.out.println(dia + "-" + mes + "-" + anio);
    }

    public void larga() {
        /*Date fecha = new Date(anio, mes, dia);
        System.out.println(fecha.toString());*/
        Date date = new Date(anio-1900,mes-1,dia);
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter = new SimpleDateFormat("dd MMMM yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);
    }
    public void siguiente(){
        dia ++;
        if(dia>28){
            switch (mes) {
                case 4:
                case 6:
                case 9:
                case 11:
                    if(dia>30){
                        mes++;
                        dia = 1;
                    }
                    if(mes>12){
                        mes = 1;
                        anio++;
                    }
                    break;
                case 2:
                    if (anio % 4 == 0 && anio % 400 == 0 && anio % 100 != 0) {
                        if (dia > 29) {
                            mes ++;
                            dia = 1;
                        } else if (dia > 28) {
                            mes++;
                            dia = 1;
                        }
                        if(mes>12){
                            mes = 1;
                            anio++;
                        }
                    }
                    break;
                default:
                    mes ++;
                    dia = 1;
                    if(mes>12){
                        mes = 1;
                        anio++;
                    }
                    break;
            }
        }
    }

    public void anterior(){
        dia --;
        if(dia<1){
            mes--;
            switch (mes) {
                case 4:
                case 6:
                case 9:
                case 11:
                   dia =30;
                    break;
                case 2:
                    if (anio % 4 == 0 && anio % 400 == 0 && anio % 100 != 0) {
                      dia = 29;
                    }else{
                        dia = 28;
                    }
                    break;
                default:
                    dia = 31;
                    if(mes<1){
                        mes = 12;
                        anio--;
                    }
                    break;
            }
        }
    }
    public void igualQue(Fecha fecha){
        if(this.anio == fecha.anio && this.mes == fecha.mes && this.dia == fecha.dia){
            System.out.println("Las fechas son iguales");
        }else{
            System.out.println("las fechas NO son iguales");
        }
    }
    public void menorQue(Fecha fecha){
        boolean anterior = false;
        if(this.anio<fecha.anio){
            anterior = true;
        }else if(this.mes<fecha.mes){
            anterior = true;
        }else if(this.dia<fecha.dia){
            anterior = true;
        }
        if(anterior){
            System.out.println("La fecha es anterior a la fecha ingresada");
        }else{
            System.out.println("la fecha NO es anterior a la ingresada");
        }
    }
    public void mayorQue(Fecha fecha){
        boolean posterior = false;
        if(this.anio>fecha.anio){
            posterior = true;
        }else if(this.mes>fecha.mes){
            posterior = true;
        }else if(this.dia>fecha.dia){
            posterior = true;
        }
        if(posterior){
            System.out.println("La fecha es posterior a la fecha ingresada");
        }else{
            System.out.println("la fecha NO es posterior a la ingresada");
        }
    }
}
