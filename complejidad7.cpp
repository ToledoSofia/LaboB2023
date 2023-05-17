#include <iostream>
#include <vector>
using namespace std;
void mostrarVector(vector<int>v){
    for(int i = 0; i<v.size();i++){
        cout<<v[i]<<endl;
    }
}
void mostrarFilaDiferente(bool m1[5][4]){
    int cont1, cont0;
    for(int i = 0; i<4; i++){//columnas
        cont1 = 0; cont0 = 0;
        for(int j = 0; j<5; j++){//filas
            if(m1[j][i] == true){
                cont1++;
            }else{
                cont0++;
            }
        }
        if(cont1%2!=0){
            cout<< " 1 ";
        }else{
            cout<< " 0 ";
        }  
    }
}

int main(){
    int i = 0;
    bool m1[5][4]={{1,0,0,1},{1,0,0,1},{1,1,0,1},{1,1,0,0},{1,1,0,1}};
    mostrarFilaDiferente(m1); 
    cout<<endl;
}