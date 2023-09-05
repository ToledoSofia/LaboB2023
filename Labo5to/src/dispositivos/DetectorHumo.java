package dispositivos;

public class DetectorHumo extends DispositivoAlarma{
    public DetectorHumo(){
        super();
    }

    public DetectorHumo(boolean conectado, double valorUmbral, double medida) {
        super(conectado, valorUmbral, medida);
    }

    @Override
    public void alarma(){
        System.out.println("-----Se ha llamado a los bomberos-----");
    }

    @Override
    public String toString() {
        return "DetectorHumo = \nValor Umbral:" + getValorUmbral() ;
    }
}
