import java.util.*;
public class MainComplejidad {

    public static void main(String[] args) {
        //1)
        //ult1) 4
        //ult2) 5
        //ult3) 4n+4
        /*
        2)
        f1_ O(3+ 13/2n) = O(n)
        f2_ O(10000) = O(1)
        f3_ O(n)
        f4_ O(1000) = O(1)
        f5_ O(n+r)
        */
        /*
        3)
        a_ devuelve la mayor cantidad de numeros iguales consecutivos
        b_ 8n2 + 10n + 4
        c_ */
        ArrayList<Integer>v = new ArrayList<Integer>();
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(9);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(2);
        v.add(6);
        v.add(6);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(5);
        v.add(5);
        v.add(5);
        v.add(5);
        v.add(5);
        v.add(5);
        v.add(5);

        int i = 0;
        int maxMeseta = 0;
        int meseta = 0;
            while ( i < v.size()) {
                if(i+1<v.size() && v.get(i) == v.get(i+1) && meseta == 0){
                    meseta += 2;
                }else if(i+1<v.size() && v.get(i) == v.get(i+1)){
                    meseta++;
                }else if(meseta>maxMeseta){
                    maxMeseta = meseta;
                    meseta = 1;
                }else{
                    meseta = 1;
                }
                i++;
            }

        System.out.println(maxMeseta);
        /*
        4) 700(10n+1)+2 = 7000n+702
        5) 5n + 3 NO
        5) 2+log2(n) --> O(log2(n))
         */
        //6)
        int imparesConsec = 0;
        int maxCantidad = 0;
        int cont = 0;
        while(cont<v.size()){
            if(cont+1<v.size() && imparesConsec==0 && v.get(cont)%2!=0 && v.get(cont+1)%2!=0){
                imparesConsec += 2;
            }else if(cont+1<v.size() && v.get(cont)%2!=0 && v.get(cont+1)%2!=0){
                imparesConsec++;
            }else if(maxCantidad<imparesConsec){
                maxCantidad = imparesConsec;
                imparesConsec = 1;
            }
            cont++;
        }
        System.out.println("max impares: " + maxCantidad);
        //10)
        ArrayList<Integer>v1 = new ArrayList<>();
        ArrayList<Integer>v2 = new ArrayList<>();
        ArrayList<Integer>v3 = new ArrayList<>();
        v1.add(1); v1.add(2); v1.add(3); v1.add(4);
        v2.add(2); v2.add(4); v2.add(8); v2.add(200);
        v3.add(9); v3.add(11); v3.add(7); v3.add(2);
        int posicion1 = 0, posicion2 = 0, posicion3 = 0;
        for(int i2 = 0; i2<v1.size(); i2++){
            if(v2.contains(v1.get(i2)) && v3.contains(v1.get(i2))){
                posicion1 = i2;
            }
        }
        for(int p2 = 0; p2<v2.size(); p2++){
            if(v2.get(p2) == v1.get(posicion1)){
                posicion2 = p2;
            }
        }
        for(int p3 = 0; p3<v3.size(); p3++){
            if(v3.get(p3) == v1.get(posicion1)){
                posicion3 = p3;
            }
        }
        System.out.println("posiciones: [" + posicion1 + ", " + posicion2 + ", " + posicion3 + "] " );

        //11)
        ArrayList<Integer>unoTres = new ArrayList<Integer>();
        ArrayList<Integer>unoTresOrdenado = new ArrayList<Integer>();

        unoTres.add(1); unoTres.add(2); unoTres.add(1); unoTres.add(1);
        unoTres.add(3); unoTres.add(3);
        for(int num = 1; num<4; num++){
            for(int num2 = 0; num2<unoTres.size(); num2++){
                if(unoTres.get(num2) == num){
                    unoTresOrdenado.add(num);
                }
            }
        }
        // fuera de la funcion
        System.out.print("Del uno al tres ordenado: ");
        for(int num = 0; num<unoTresOrdenado.size(); num++){
            System.out.print(unoTresOrdenado.get(num) + "  ");
        }
    }
}
