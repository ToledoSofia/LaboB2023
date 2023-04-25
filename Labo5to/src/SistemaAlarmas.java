import dispositivos.*;

import java.util.ArrayList;

public class SistemaAlarmas {
    public static void main(String[] args) {
        SensorTemperatura s1 = new SensorTemperatura();
        ArrayList<DispositivoAlarma>dispos = new ArrayList<DispositivoAlarma>();
        dispos.add(s1);
        DispositivoAlarma sistema = new DispositivoAlarma();
    }
}
