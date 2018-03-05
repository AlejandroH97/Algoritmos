#include <cstdlib>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <ctime>
#include <math.h> 

using namespace std;

int main(int argc, char** argv) {

    int longitud;
    cin >> longitud;
    double tiempo;
    
    for (int i = 2; i < longitud; i++){
        
        int A[i][i];
        int B[i][i];
        int resultado[i][i];
        
        for (int j = 0; j < i; j++){
            for (int k = 0; k < i; k++){
                
                A[j][k] = 1;
                B[j][k] = 2; 
            }
        }
        double aux = 0;
        
        for (int l = 0; l < 10; l++){
            
            for (int m = 0; m < i; m++){
                for (int n = 0; n < i; n++){
                
                    resultado[m][n] = 0;
                }   
            }
            time_t tiempoinicial = time(0);
            for (int k = 0; k < i; k++) {
            
                for (int l = 0; l < i; l++) {
                
                    for (int m = 0; m < i; m++) {  
                    
                        resultado[l][m] = resultado[l][m] + (A[k][l] * B[l][m]);
                    }        
                }
            }
            time_t tiempofinal = time(0);
            tiempo = double(double(difftime(tiempofinal,tiempoinicial)) / (2.0 * (pow((double)i,3.0))))/double(CLOCKS_PER_SEC);
            aux = aux + tiempo;
        }
        double promedio = (double)(aux/10);
        cout <<"Promedio tiempo para "<<i<<"x"<<i<<" es: "<<scientific<<promedio<<endl;
        
    }
    return 0;
}

