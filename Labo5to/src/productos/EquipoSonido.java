package productos;

import personas.Empleado;

public class EquipoSonido extends Multimedia{
    private boolean bluetooth;
    public EquipoSonido(){
        super();
        bluetooth = false;
    }
    public EquipoSonido(boolean blue){
        super();
        bluetooth = blue;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
