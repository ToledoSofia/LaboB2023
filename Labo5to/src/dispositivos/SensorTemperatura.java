package dispositivos;

public class SensorTemperatura extends DispositivoAlarma{
    public SensorTemperatura(boolean conectado, double valorUmbral, double medida) {
        super(conectado, valorUmbral, medida);
    }

    public SensorTemperatura(){
        super();
    }
    @Override
    public void alarma(){
        System.out.println("-----¡Cuidado! La temperatura sube-----");
    }
}
