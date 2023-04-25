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

    public void agregarVenta(Compra compra){
        if(compra.comprobarComponentes()){
            compra.calcularPrecio();
            ventas.add(compra);
        }else{
            System.out.println("----compra no valida-----");
        }
    }
    public void agregarComponente(Componente componente){
        componentes.add(componente);
    }

}
//separar stock y componentes en comprobarCompra()
//realizarCompra(cliente, componentes, metodoPago)
//agregar, modificar y eliminar comp en pagina
//mostrar cant entrada y salida por separado;