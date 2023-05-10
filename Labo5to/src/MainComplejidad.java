import java.util.*;
public class MainComplejidad {
    public static void main(String[] args) {
        //1)
        //ult1) 4
        //ult2) 5
        //ult3) 4n+4
        /*
        2)
        1_ O(1)
        2_ O(1)
        3_ O(n)
        4_ O(n)
        5_ O(n)
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
        4) 9n + 9
        5) 5n + 3
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
    }
}
