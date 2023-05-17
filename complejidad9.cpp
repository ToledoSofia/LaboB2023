#include <iostream>
#include <vector>
using namespace std;
void mostrarVector(vector<int>v1){
    for(int i =  0; i<v1.size();i++){
        cout<<v1[i]<<"  ";
    }
    cout<<endl;
}
vector<int>ordenarVectores(vector<int>v1, vector<int>v2){
    vector<int>ordenado;
    int i = 0, j = 0;
    while(i<v1.size() && j<v2.size()){
        if(v1[i]<=v2[j]){
            ordenado.push_back(v1[i]);
            i++;
        }else if(v1[i] > v2[j]){
            ordenado.push_back(v2[j]);
            j++;
        }
    }
    if(i>= v1.size()){
        while(j<v2.size()){
            ordenado.push_back(v2[j]);
            j++;
        }
    }else if(j>= v2.size()){
        while(i<v1.size()){
            ordenado.push_back(v1[i]);
            i++;
        }
    }
    return ordenado;
}
int main(){
    vector<int>v1 = {1,2,3,4,5,6};
    vector<int>v2 = {1,3,5,8,9,10};
    vector<int> ordenados = ordenarVectores(v1, v2);
    mostrarVector(ordenados);
}