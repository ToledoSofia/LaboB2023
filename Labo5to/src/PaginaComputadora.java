import componentes.CPU;
import componentes.Componente;
import componentes.Periferico;

import java.util.ArrayList;

public class PaginaComputadora {
    private ArrayList<Componente> componentes;
    private ArrayList<Compra>ventas;

    public PaginaComputadora(){
        componentes =new ArrayList<Componente>();
        ventas = new ArrayList<Compra>();
    }


    public ArrayList<Componente> getPerifericos() {
        return componentes;
    }

    public void setPerifericos(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<Compra> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Compra> ventas) {
        this.ventas = ventas;
    }
    public boolean comprobarComponentes(Compra compra){
        boolean cpu = false, entrada = false, salida = false;
        for(Componente componente : compra.getComponentes()){
            if(componente instanceof CPU){
                cpu = true;
            }else if(componente instanceof Periferico){
                if(((Periferico) componente).isEntradaSalida()){
                    entrada = true;
                }else{
                    salida = true;
                }
            }
        }
        if(cpu == false || entrada == false || salida == false){
            return false;
        }else{
            return true;
        }
    }
    public void agregarVenta(Compra compra){
        if(comprobarComponentes(compra)){
            ventas.add(compra);
        }else{
            System.out.println("----compra no valida-----");
        }
    }
    public void agregarComponente(Componente componente){
        componentes.add(componente);
    }

}
//agregarPerferico();
//realizarCompra(); (modificar stock)

/*Es importante aclarar que el sistema debe estar preparado para que se puedan ir agregando más periféricos

El programa deberá:

a. Realizar una compra, es decir, agregar una computadora a la lista de computadoras vendidas y hacer
las modificaciones necesarias en cuanto a stock.

b. Calcular el precio total de la computadora con todos los periféricos.

c. Mostrar la cantidad de componentes de entrada y de salida que tiene una computadora en específico.*/
