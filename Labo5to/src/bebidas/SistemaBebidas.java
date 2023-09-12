package bebidas;

import personas.ClienteBebidas;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaBebidas {
    private HashSet<ClienteBebidas>personas;
    private HashMap<Bebida, Integer> bebidas;

    public SistemaBebidas() {
        personas = new HashSet<>();
        bebidas = new HashMap<>();
    }


    public SistemaBebidas(HashSet<ClienteBebidas> personas) {
        this.personas = personas;
    }

    public HashSet<ClienteBebidas> getPersonas() {
        return personas;
    }

    public void setPersonas(HashSet<ClienteBebidas> personas) {
        this.personas = personas;
    }

    public HashMap<Bebida, Integer> getBebidas() {
        return bebidas;
    }

    public void setBebidas(HashMap<Bebida, Integer> bebidas) {
        this.bebidas = bebidas;
    }

    public void agregarBebida(Bebida b){
        bebidas.put(b, 10);
    }
    public void eliminarBebida(Bebida b){
        if(bebidas.keySet().contains(b)){
            bebidas.remove(b);
        }
    }
    public void modificarBebida(Bebida modificar, Bebida nueva){
        if(bebidas.keySet().contains(modificar)){
            bebidas.remove(modificar);
            bebidas.put(nueva,10);
        }
    }
    public void compararDni(int dni) throws Exception {
        for(ClienteBebidas c : personas){
            if(c.getDni()  == dni){
                throw new Exception("DNI ya existente");
            }
        }
    }
    public void consumir(ClienteBebidas c, Bebida b, int cantidad) throws Exception {
        if(!personas.contains(c)){
            compararDni(c.getDni());
            personas.add(c);
        }
        if(!bebidas.keySet().contains(b)){
            throw new Exception("La bebida no existe");
        }else if(bebidas.get(b)<cantidad){
            throw new Exception("No hay stock para la cantidad que quiere consumir");
        }else{
            bebidas.put(b,bebidas.get(b)-cantidad);
        }
        c.consumirBebida(b,cantidad);
    }
    public void mayorMenor() throws Exception{
        if(personas.isEmpty()){
            throw new Exception("No hay personas");
        }
        personaMayorHidratacion();
        personaMenorHidratacion();
    }
    public void personaMayorHidratacion(){
        ClienteBebidas clienteMayorHidratacion = new ClienteBebidas();
        int mayorHidratacion = 0;
        boolean primero = true;
        for(ClienteBebidas c : personas){
            if(primero || c.calcularCoeficienteHidratacion()>mayorHidratacion){
                clienteMayorHidratacion = c;
                mayorHidratacion = c.calcularCoeficienteHidratacion();
                primero = false;
            }
        }
        System.out.println("Personal con mayor coef. de hidratacion: " + clienteMayorHidratacion.getNombre());
        System.out.println("Coef. " + mayorHidratacion);
    }
    public void personaMenorHidratacion() {
        ClienteBebidas clienteMenorHidratacion = new ClienteBebidas();
        int menorHidratacion = 0;
        boolean primero = true;
        for (ClienteBebidas c : personas) {
            if (primero || c.calcularCoeficienteHidratacion() < menorHidratacion) {
                clienteMenorHidratacion = c;
                menorHidratacion  = c.calcularCoeficienteHidratacion();
                primero = false;
            }
        }
        System.out.println("Personal con menor coef. de hidratacion: " + clienteMenorHidratacion.getNombre());
        System.out.println("Coef. " + menorHidratacion);
    }
}
