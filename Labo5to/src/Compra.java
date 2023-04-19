import componentes.CPU;
import componentes.Componente;
import componentes.Periferico;
import personas.Cliente;

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


    public void modificarPeriferico(Componente modificar, Componente nuevo){//periferico
        for(Componente componente : componentes){
            if(componente.equals(modificar)){
                componentes.remove(componente);
                componentes.add(nuevo);
            }
        }
    }
    public void agregarComponente(Componente nuevo){//periferico
        componentes.add(nuevo);
    }
    public void eliminarComponente(Componente eliminar){//periferico
        for(Componente componente : componentes){
            if(componente.equals(eliminar)){
                componentes.remove(componente);
            }
        }
    }
    public double calcularPrecio(){
        double precioTotal = 0, aumento;
        for(Componente componente:componentes){
            precioTotal += componente.getPrecioVenta();
        }
        if(metodoPago){//recargo del 5%
            aumento = 5*precioTotal/100;
            return precioTotal+aumento;
        }else{
            return precioTotal;
        }
    }
}

//comprobarComponentes();
//comprobarPago();
//calcularPrecioTotal();
// comprobar si tiene stock antes de guardar



//La mínima compra tiene que darse con una CPU, un dispositivo de entrada y otro de salida.
// Para crear la compra habrá que asegurarse que tenga esos componentes mínimos y se puede modificar la
// configuración en cualquier momento añadiendo, quitando o cambiando exclusivamente periféricos.

/*compra se quiere guardar el nombre, apellido y un celular del cliente así como
también el método de pago. Si es en efectivo no hace falta pedir nada más y si es con tarjeta
 habrá que hacerle un recargo al precio final del 5% y guardar también el número de tarjeta,
 de qué banco es y si es crédito o débito.*/