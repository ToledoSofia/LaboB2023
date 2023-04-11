import vehiculos.*;

import java.util.ArrayList;

public class EmpresaVehiculos {
    private ArrayList<Vehiculo>vehiculos;
    public EmpresaVehiculos(){
        vehiculos = new ArrayList<Vehiculo>();
    }
    public EmpresaVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public void agregarVehiculo(Vehiculo v1){
        vehiculos.add(v1);
    }
    public String buscarMayorCantidad(){
        int cont , cantMayor = 0;
        String clase, claseMayor = vehiculos.get(0).getClass().getCanonicalName();;
        for(int j=0;j<vehiculos.size()-1;j++) {
            clase = vehiculos.get(j).getClass().getCanonicalName();
            cont = 0;
            for (Vehiculo vehiculo:vehiculos) {
                if (vehiculo.getClass().getCanonicalName() == clase) {
                    cont++;
                }
            }
            if(cont>cantMayor){
                cantMayor = cont;
                claseMayor = clase;
            }
        }
        return claseMayor;
    }
    public double calcularPorcentajeDescapotables(){
        int cantidad = 0, descap = 0;
        for(Vehiculo vehiculo:vehiculos){
            if(vehiculo instanceof Coche){
                cantidad++;
                if(((Coche) vehiculo).isDescapotable()){
                    descap ++;
                }
            }
        }
        return descap*100/cantidad;
    }
}
