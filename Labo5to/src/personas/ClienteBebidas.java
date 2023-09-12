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
            if(b instanceof Neutra){
                hidratacion += bebidasConsumidas.get(b)*(((Neutra) b).getPositividad() - ((Neutra) b).getNegatividad());
            }else if (b instanceof Azucarada){
                hidratacion += bebidasConsumidas.get(b)*(1-(((Azucarada) b).getNegatividad()*((Azucarada) b).getCantidadAzucar()));
            } else if (b instanceof Alcoholica) {
                hidratacion += bebidasConsumidas.get(b)* (0-(((Alcoholica) b).getNegatividad()*((Alcoholica) b).getCantidadAlcohol()));

            }
        }
        return hidratacion;
    }
    public void consumirBebida(Bebida b, int cantidad){
        bebidasConsumidas.put(b,cantidad);
    }

    @Override
    public void mostrarDatos() {

    }
}
