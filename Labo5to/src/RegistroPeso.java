import personas.Persona;

import java.util.*;
public class RegistroPeso extends Persona {
    private HashMap<Date,ArrayList<Double>>pesoAltura;
    public RegistroPeso() {
        super();
        pesoAltura = new HashMap<Date, ArrayList<Double>>();
    }
    public RegistroPeso(HashMap<Date, ArrayList<Double>> pesoAltura) {
        super();
        this.pesoAltura = pesoAltura;
    }

    public HashMap<Date, ArrayList<Double>> getPesoAltura() {
        return pesoAltura;
    }

    public void setPesoAltura(HashMap<Date, ArrayList<Double>> pesoAltura) {
        this.pesoAltura = pesoAltura;
    }
    public void agregarPesoAltura(Date fecha, double peso, double altura){
        ArrayList<Double>pesoAlt = new ArrayList<>();
        pesoAlt.add(peso); pesoAlt.add(altura);
        pesoAltura.put(fecha, pesoAlt);
    }
    public void mostrarPesoAltura(Date fecha){
        if(pesoAltura.containsKey(fecha)){
            System.out.println("Peso: " + pesoAltura.get(fecha).get(0) +
                    " Altura: " + pesoAltura.get(fecha).get(1));
        }
    }
    public ArrayList<Double> promedioAnio(int anio){
        double total = 0, sumaPeso = 0, sumaAltura = 0;
        ArrayList<Double>promedios = new ArrayList<Double>();
        for(Date fecha : pesoAltura.keySet()){//Map.Entry...
            if(fecha.getYear() == anio){
                total++;
                sumaPeso += pesoAltura.get(fecha).get(0);
                sumaAltura += pesoAltura.get(fecha).get(1);
            }
        }
        sumaPeso = sumaPeso/total;
        sumaAltura = sumaAltura/total;
        promedios.add(sumaPeso);
        promedios.add(sumaAltura);

        return promedios;
    }

    public void diferenciarAnios(int y1, int y2){//altura max no promedio
        ArrayList<Double>prom1 = promedioAnio(y1);
        ArrayList<Double>prom2 = promedioAnio(y2);
        System.out.println("Diferencia Peso: " + (prom2.get(0)-prom1.get(0)));
        System.out.println("Diferencia Altura: " + (prom2.get(1)-prom1.get(1)));
    }
}
