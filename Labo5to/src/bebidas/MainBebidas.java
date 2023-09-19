package bebidas;

import personas.ClienteBebidas;

public class MainBebidas {
    public static void main(String[] args) {
        ClienteBebidas c1 = new ClienteBebidas("Juan",123456);
        ClienteBebidas c2 = new ClienteBebidas("Pepe",456789);
        ClienteBebidas c3 = new ClienteBebidas("Rigoberto",123456);
        ClienteBebidas c4 = new ClienteBebidas("Belnanya",456123);
        ClienteBebidas c5 = new ClienteBebidas("Bianqa",123879);

        Azucarada azucarada1 = new Azucarada("Coca Cola", 50);
        Azucarada azucarada2 = new Azucarada("Sprite", 20);
        Azucarada azucarada3 = new Azucarada("aja sisi", 100);

        Neutra neutra1 = new Neutra("agua", 100, 0);
        Neutra neutra2 = new Neutra("agua2", 80, 2);

        Alcoholica alcoholica1 = new Alcoholica("alc1",150);
        Alcoholica alcoholica2 = new Alcoholica("alc2",30);
        Alcoholica alcoholica3 = new Alcoholica("alc3",45);

        SistemaBebidas sistema = new SistemaBebidas();
        try{
            sistema.mejorPeor();//no hay personas Exception
        }catch(NullPointerException e){
            System.err.println(e);
        }
        sistema.agregarCliente(c1);
        sistema.agregarCliente(c2);
        sistema.agregarCliente(c4);
        sistema.agregarCliente(c5);
        sistema.agregarCliente(c3);// dni igual exception

        sistema.agregarBebida(azucarada1);
        sistema.agregarBebida(azucarada2);
        sistema.agregarBebida(neutra1);
        sistema.agregarBebida(neutra2);
        sistema.agregarBebida(alcoholica1);
        sistema.agregarBebida(alcoholica2);
        sistema.agregarBebida(alcoholica3);

        sistema.consumir(c1,azucarada1,5);
        sistema.consumir(c2,azucarada2,2);
        sistema.consumir(c4,neutra1,4);
        sistema.consumir(c5,neutra2,4);
        sistema.consumir(c1,alcoholica1,1);
        sistema.consumir(c1,alcoholica3,8);
        sistema.consumir(c1,azucarada2,9);
        sistema.consumir(c2,azucarada3,5);// bebida no existe exception

        try {
            sistema.mejorPeor();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
