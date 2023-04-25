package dispositivos;

public class DetectorHumo extends DispositivoAlarma{
    public DetectorHumo(){
        super();
    }
    @Override
    public void alarma(){
        System.out.println("-----Se ha llamado a los bomberos-----");
    }
}
