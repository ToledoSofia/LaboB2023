package dispositivos;

import java.util.ArrayList;

public class SensorComplejo {
    private ArrayList<DispositivoAlarma>dispositivos;
    private double valorUmbral;

    public SensorComplejo(){
        dispositivos = new ArrayList<DispositivoAlarma>();
        valorUmbral = 50;
    }
    public SensorComplejo(double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public SensorComplejo(ArrayList<DispositivoAlarma> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public ArrayList<DispositivoAlarma> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<DispositivoAlarma> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public double getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }
    public double calcularPromedio(){
        double media = 0;
        for(DispositivoAlarma dispo : dispositivos){
            media += dispo.getMedida();
        }
        return media/dispositivos.size();
    }
    public void activarSensor(){
        if(calcularPromedio()>valorUmbral){
            alarma();
        }
    }
    public void alarma(){
        System.out.println("-----ALARMA SENSOR COMPLEJO-----");
    }

    @Override
    public String toString() {
        return "SensorComplejo{" +
                "dispositivos=" + dispositivos +
                ", valorUmbral=" + valorUmbral +
                '}';
    }
}
