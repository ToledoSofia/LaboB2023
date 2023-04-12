import personas.Profesor;

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

    public void mostrarListado(){
        double precio2;
        double precioFinal;
        for(Pedido pedido : pedidos){
            if(pedido.isEntregado() == false) {
                if (pedido.getPersona() instanceof Profesor) {
                    precio2 = pedido.getPlato().getPrecio();
                    System.out.println(pedido.getPlato().toString() + "Descuento: " + ((Profesor) pedido.getPersona()).getPorcentajeDescuento() + "%\nPrecio final: $" + (precio2 - (((Profesor) pedido.getPersona()).getPorcentajeDescuento() * precio2/100)));
                }else{
                    System.out.println(pedido.getPlato().toString());
                }
            }
        }
    }
}
