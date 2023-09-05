import componentes.CPU;
import componentes.Componente;
import componentes.Periferico;
import personas.Cliente;
import exceptions.ComponenteSinStockException;
import vehiculos.Coche;

import java.util.ArrayList;

public class Compra {
    private Cliente cliente;
    private ArrayList<Componente>componentes;
    private boolean metodoPago;//clase

    public Compra(){
        cliente = new Cliente();
        metodoPago = false;
    }

    public Compra(ArrayList<Componente>componentes1, boolean metodoPago) {
        this.componentes = componentes1;
        this.metodoPago = metodoPago;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public boolean isMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(boolean metodoPago) {
        this.metodoPago = metodoPago;
    }


    public void modificarPeriferico(Periferico modificar, Periferico nuevo){
        boolean fin  =false;
        for(int i = 0; i<componentes.size() && !fin;i++){
            if(componentes.get(i) instanceof Periferico){
                if(componentes.get(i).equals(modificar)){
                    componentes.remove(i);
                    fin = true;
                }
            }
        }
        if(fin){
            componentes.add(nuevo);
        }
    }
    public void agregarPeriferico(Periferico nuevo){//periferico
        componentes.add(nuevo);
    }
    public void eliminarPeriferico(Periferico eliminar){
        for(Componente componente : componentes){
            if(componente.equals(eliminar)){
                componentes.remove(componente);
            }
        }
    }
    public void calcularPrecio(){
        double precioTotal = 0, aumento;
        for(Componente componente:componentes){
            precioTotal += componente.getPrecioVenta();
        }
        if(metodoPago){//recargo del 5%
            aumento = 5*precioTotal/100;
            precioTotal  = precioTotal+aumento;
        }else{
            precioTotal = precioTotal;
        }
    }
    public boolean comprobarComponentes() throws Exception {
        boolean cpu = false, entrada = false, salida = false;
        for(Componente componente : componentes){
            if(componente.getStock()==0){
                throw new ComponenteSinStockException("Componente sin stock");
            } else{
                if(componente instanceof CPU){
                    cpu = true;
                }else if(componente instanceof Periferico){
                    //throw new ComponenteSinStockException("Componente sin stock");
                    if(((Periferico) componente).isEntradaSalida()){
                        entrada = true;
                    }else{
                        salida = true;
                    }

                }
            }
        }
        if(cpu == false || entrada == false || salida == false){
            throw new Exception("Falta un componente escencial");
        }else{
            return true;
        }
    }
    public void mostrarCantidad(){
        int contEntrada = 0, contSalida = 0;
        for(Componente componente : componentes){
            if(componente instanceof Periferico){
                if(((Periferico) componente).isEntradaSalida()){
                    contEntrada ++;
                }else{
                    contSalida ++;
                }
            }
        }
        System.out.println("cantidad de perifericos de entrada: " + contEntrada);
        System.out.println("cantidad de perifericos de salida: " + contSalida);
    }
}
