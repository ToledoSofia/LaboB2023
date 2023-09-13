package personas;

import bebidas.Alcoholica;
import bebidas.Azucarada;
import bebidas.Bebida;
import bebidas.Neutra;

import java.util.HashMap;
import java.util.HashSet;

public class ClienteBebidas extends Persona {
    private HashMap<Bebida, Integer> bebidasConsumidas;

    public ClienteBebidas() {
        bebidasConsumidas = new HashMap<>();
    }

    public ClienteBebidas(String nombre) {
        super(nombre);
    }

    public ClienteBebidas(String nombre, int dni) {
        super(nombre, dni);
        bebidasConsumidas = new HashMap<>();
    }

    public ClienteBebidas(String nombre, HashMap<Bebida, Integer> bebidasConsumidas) {
        super(nombre);
        this.bebidasConsumidas = bebidasConsumidas;
    }

    public HashMap<Bebida, Integer> getBebidasConsumidas() {
        return bebidasConsumidas;
    }

    public void setBebidasConsumidas(HashMap<Bebida, Integer> bebidasConsumidas) {
        this.bebidasConsumidas = bebidasConsumidas;
    }
    public int calcularCoeficienteHidratacion(){
        int hidratacion =  0;
        for(Bebida b : bebidasConsumidas.keySet()){
                hidratacion += bebidasConsumidas.get(b)* (b.getPositividad()- b.getNegatividad());
        }
        return hidratacion;
    }
    public void consumirBebida(Bebida b, int cantidad){
        if(bebidasConsumidas.containsKey(b)){
            bebidasConsumidas.put(b, bebidasConsumidas.get(b) + cantidad);
        }else{
            bebidasConsumidas.put(b,cantidad);
        }
    }

    @Override
    public void mostrarDatos() {

    }
}
