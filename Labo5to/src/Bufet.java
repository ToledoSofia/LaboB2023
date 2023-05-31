import platos.Plato;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bufet {
    private ArrayList<Plato>platos;

    private ArrayList<Pedido>pedidos;

    public Bufet() {
        platos = new ArrayList<Plato>();
        pedidos = new ArrayList<Pedido>();
    }

    public Bufet(ArrayList<Plato> platos, ArrayList<Pedido> pedidos) {
        this.platos = platos;
        this.pedidos = pedidos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public void agregarPlato(Plato plato){
        platos.add(plato);
    }
    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void eliminarPedido(Pedido p1){
        for(Pedido pedido: pedidos){
            if(pedido.equals(p1)){
                pedidos.remove(pedido);
            }
        }
    }
    public void eliminarPlato(Plato p1){
        for(Plato plato : platos){
            if(plato.equals(p1)){
                platos.remove(plato);
            }
        }
    }
    public void mostrarListado(){
        double precio2;
        double precioFinal;
        for(Pedido pedido : pedidos){
            if(pedido.getFechaCreacion() == LocalDate.now()){
                System.out.println(pedido.getPlato().toString() + "Precio Final: $" + pedido.calcularPrecio());
            }
        }
    }
    public void modificarPlato(Plato modificar, Plato nuevo){
        for(Plato plato : platos){
            if(plato.equals(modificar)){
                platos.remove(plato);
                platos.add(nuevo);
            }
        }
    }
    public void modificarPedido(Pedido modificar, Pedido nuevo){
        for(Pedido pedido : pedidos){
            if(pedido.equals(modificar)){
                pedidos.remove(pedido);
                pedidos.add(nuevo);
            }
        }
    }
}

