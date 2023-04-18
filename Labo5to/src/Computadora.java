import componentes.Componente;

import java.util.ArrayList;
import componentes.*;

public class Computadora {
    private CPU cpu;
    private ArrayList<Periferico>perifericos;
    public Computadora(){
        cpu  = new CPU();
        perifericos = new ArrayList<Periferico>();
    }

    public Computadora(CPU cpu) {
        this.cpu = cpu;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Periferico> getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(ArrayList<Periferico> perifericos) {
        this.perifericos = perifericos;
    }

    public void agregarPeriferico(Periferico p1){
        perifericos.add(p1);
    }
    public void eliminarPeriferico(Periferico p1){
        for(Periferico periferico : perifericos){
            if(periferico == p1){
                perifericos.remove(periferico);
            }
        }
    }
    public void contarComponentes(){
        int contEntrada = 0, contSalida = 0;
        for(Periferico periferico : perifericos){
            if(periferico.isEntradaSalida()){
                contEntrada++;
            }else{
                contSalida++;
            }
        }
        System.out.println("Cantidad de dispositivos de entrada: " + contEntrada);
        System.out.println("Cantidad de dispositivos de salida: " + contSalida);
    }
}
//CAST CAST CAST CAST CAST
//agregar periferico();
//eliminarPeriferico();
//contarComponentes();(entrada y salida)
