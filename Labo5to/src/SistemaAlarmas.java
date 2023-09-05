import dispositivos.*;
import exceptions.ExceptionCreada;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaAlarmas {
    public static void main(String[] args){
        SensorTemperatura s4 = new SensorTemperatura(false, 20, 50);
        SensorComplejo s2 = new SensorComplejo();
        DetectorHumo s1 = new DetectorHumo(true, 20, 50);
        SensorPresion s3= new SensorPresion(true, 20, 50);

        ArrayList<DispositivoAlarma>dispos = new ArrayList<DispositivoAlarma>();
        dispos.add(s1);
        dispos.add(s3);
        dispos.add(s4);
        //s1.activarSensor();

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione un numero del 0 al " + (dispos.size()-1) + " para obtener la conexion del dispositivo");
        int sensor = 1;
       try{
           sensor = sc.nextInt();
           System.out.println(dispos.get(sensor).isConectado());
       }catch(IndexOutOfBoundsException e){
           System.err.println(e);
           sensor = 1;
       }catch(InputMismatchException e){
           System.err.println(e);
       }
        System.out.println(dispos.get(sensor).isConectado());
    }
}
