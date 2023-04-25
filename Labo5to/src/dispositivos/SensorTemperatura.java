package dispositivos;

public class SensorTemperatura extends DispositivoAlarma{
    public SensorTemperatura(){
        super();
    }
    @Override
    public void alarma(){
        System.out.println("-----¡Cuidado! La temperatura sube-----");
    }
}
