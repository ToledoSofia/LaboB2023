package dispositivos;

public class DispositivoAlarma {
    private boolean conectado;
    private double valorUmbral;
    private double medida;
    private int anio;
    public DispositivoAlarma(){
        conectado = true;
        valorUmbral = 20;
        medida = 5;
        anio = 2000;
    }
    public DispositivoAlarma(boolean conectado, double valorUmbral, double medida){
        this.conectado = conectado;
        this.valorUmbral = valorUmbral;
        this.medida = medida;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public double getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void alarma(){}
    public void activarSensor(){
        if(medida>valorUmbral && isConectado()){
            alarma();
        }
    }

}
