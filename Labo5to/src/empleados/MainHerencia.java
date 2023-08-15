package empleados;

public class MainHerencia {
    public static void main(String[] args) {
        Directivo d1 = new Directivo("Mario");
        Operario o1 = new Operario("Alfonso");
        Oficial of1 = new Oficial("Luis");
        Tecnico t1 = new Tecnico("Pablo");
        System.out.println(d1);
        System.out.println(o1);
        System.out.println(of1);
        System.out.println(t1);
    }
}
