import componentes.Periferico;
import personas.Cliente;

public class Compra {
    private Cliente cliente;
    private Computadora computadora;
    private boolean metodoPago;//0.efectivo 1.tarjeta

    public Compra(){
        cliente = new Cliente();
        computadora = new Computadora();
        metodoPago = false;
    }

    public Compra(Computadora computadora, boolean metodoPago) {
        if(comprobarComponentes(computadora)){
            this.computadora = computadora;
            this.metodoPago = metodoPago;
        }else{
            System.out.println("-------compra no valida--------");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public boolean isMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(boolean metodoPago) {
        this.metodoPago = metodoPago;
    }
    public boolean comprobarComponentes(Computadora compu){
        boolean entrada = false, salida = false;
        for(int i = 0; i<compu.getPerifericos().size() && !entrada && !salida; i++){
            if(compu.getPerifericos().get(i).isEntradaSalida() == true){
                entrada = true;
            }else{
                salida = true;
            }
        }
        if(!compu.getCpu().getNombre().equals("") || entrada == false || salida == false){
           return false;
        }else{
            return true;
        }
    }
    public double calcularPrecioTotal(){
        double precioTotal = 0;
        for(int i = 0; i<computadora.getPerifericos().size(); i++){
            precioTotal += computadora.getPerifericos().get(i).getPrecioVenta();
        }
        return precioTotal + computadora.getCpu().getPrecioVenta();
    }
    public void comprobarPago(){

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