package dispositivos;

public class SensorPresion extends DispositivoAlarma{
    public SensorPresion(){
        super();
    }

    public SensorPresion(boolean conectado, double valorUmbral, double medida) {
        super(conectado, valorUmbral, medida);
    }

    @Override
    public void alarma(){
        System.out.println("-----Sensor de presion activado-----");
    }

    @Override
    public String toString() {
        return "SensorPresion =\nValor Umbral:" + getValorUmbral();
    }
}
