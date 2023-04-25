package dispositivos;

public class SensorPresion extends DispositivoAlarma{
    public SensorPresion(){
        super();
    }
    @Override
    public void alarma(){
        System.out.println("-----Sensor de presion activado-----");
    }
}
