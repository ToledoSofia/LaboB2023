package productos;

import java.util.ArrayList;

public class TiendaProductos {
    private ArrayList<Producto>productos;
    public TiendaProductos(){
        productos = new ArrayList<Producto>();
    }
    public TiendaProductos(ArrayList<Producto>productos){
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        if(productos.contains(producto)){
            productos.remove(producto);
        }
    }
    public void modificarProducto(Producto modificar, Producto nuevo){
        if(productos.contains(modificar)){
            productos.remove(modificar);
            productos.add(nuevo);
        }
    }
    public void MayorMenorStock(){
        int mayor = productos.get(0).getStock(), menor = productos.get(0).getStock();
        Producto pMayor = productos.get(0), pMenor = productos.get(0);
        for(Producto producto : productos){
            if(producto.getStock()>mayor){
                mayor = producto.getStock();
                pMayor = producto;
            }else if(producto.getStock()<menor){
                menor = producto.getStock();
                pMenor = producto;
            }
        }
        System.out.println("Mayor stock: " + pMayor.getNombre() + "cant: " + mayor);
        System.out.println("Menor stock: " + pMenor.getNombre() + "cant: " + menor );

    }
}
