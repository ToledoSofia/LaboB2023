import componentes.Componente;

import java.util.ArrayList;

public class PaginaComputadora {
    private ArrayList<Componente> componentes;
    private ArrayList<Computadora>compusVendidas;
    private ArrayList<Compra>ventas;

    public PaginaComputadora(){
        componentes =new ArrayList<Componente>();
        ventas = new ArrayList<Compra>();
        compusVendidas = new ArrayList<Computadora>();
    }

    public ArrayList<Computadora> getCompusVendidas() {
        return compusVendidas;
    }

    public void setCompusVendidas(ArrayList<Computadora> compusVendidas) {
        this.compusVendidas = compusVendidas;
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
        ventas.add(compra);
        compusVendidas.add(compra.getComputadora());
    }
    public void agregarComponente(Componente componente){
        componentes.add(componente);
    }
    public void realizarCompra(Compra compra){//no me gusta
        int stock;
        for(int i = 0; i<compra.getComputadora().getPerifericos().size(); i++){
            stock = compra.getComputadora().getPerifericos().get(i).getStock();
            compra.getComputadora().getPerifericos().get(i).setStock(stock-1);
        }
        stock = compra.getComputadora().getCpu().getStock();
        compra.getComputadora().getCpu().setStock(stock-1);
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
