#include <iostream>
#include <vector>
using namespace std;
void mostrarVector(vector<int>v){
    for(int i = 0; i<v.size();i++){
        cout<<v[i]<<endl;
    }
}
vector<bool> compararFilas(bool m1[5][4]){
    int fila = 0 ;
    bool repite = true;
    int i = 0, j = 0, col;
    while(j<4){//columna
        col = j+1;
        if(m1[i][j]==m1[i][col]){
            i++;
        }else{
            col++;
            i = 0;
            if(j==3 && i < 5){
                fila = i;
            }
            if(i==5){
                i = 0;
            }
        }
        j++;
    }
    ;
}

int main(){
    int i = 0;
    bool m1[5][4]={{1,0,0,1},{1,0,0,1},{1,1,0,1},{1,1,0,0},{1,1,0,1}};
    
    
}