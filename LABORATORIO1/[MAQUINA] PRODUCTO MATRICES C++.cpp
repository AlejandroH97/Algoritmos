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
            clock_t tiempoinicial = clock();
            for (int k = 0; k < i; k++) {
            
                for (int l = 0; l < i; l++) {
                
                    for (int m = 0; m < i; m++) {  
                    
                        resultado[l][m] = resultado[l][m] + (A[k][l] * B[l][m]);
                    }        
                }
            }
            clock_t tiempofinal = clock();
            tiempo = double(double(tiempofinal-tiempoinicial) / double(2.0 * (pow((double)i,3.0))))/double(CLOCKS_PER_SEC);
            aux = aux + tiempo;
        }
        double promedio = (double)(aux/10.0);
        cout <<"Promedio tiempo para "<<i<<"x"<<i<<" es: "<<scientific<<promedio<<endl;
        
    }
    return 0;
}
/*100
Promedio tiempo para 2x2 es: 0.000000e+00
Promedio tiempo para 3x3 es: 0.000000e+00
Promedio tiempo para 4x4 es: 0.000000e+00
Promedio tiempo para 5x5 es: 0.000000e+00
Promedio tiempo para 6x6 es: 0.000000e+00
Promedio tiempo para 7x7 es: 0.000000e+00
Promedio tiempo para 8x8 es: 0.000000e+00
Promedio tiempo para 9x9 es: 0.000000e+00
Promedio tiempo para 10x10 es: 0.000000e+00
Promedio tiempo para 11x11 es: 0.000000e+00
Promedio tiempo para 12x12 es: 0.000000e+00
Promedio tiempo para 13x13 es: 0.000000e+00
Promedio tiempo para 14x14 es: 0.000000e+00
Promedio tiempo para 15x15 es: 0.000000e+00
Promedio tiempo para 16x16 es: 0.000000e+00
Promedio tiempo para 17x17 es: 0.000000e+00
Promedio tiempo para 18x18 es: 0.000000e+00
Promedio tiempo para 19x19 es: 0.000000e+00
Promedio tiempo para 20x20 es: 9.375000e-08
Promedio tiempo para 21x21 es: 0.000000e+00
Promedio tiempo para 22x22 es: 0.000000e+00
Promedio tiempo para 23x23 es: 0.000000e+00
Promedio tiempo para 24x24 es: 0.000000e+00
Promedio tiempo para 25x25 es: 0.000000e+00
Promedio tiempo para 26x26 es: 0.000000e+00
Promedio tiempo para 27x27 es: 0.000000e+00
Promedio tiempo para 28x28 es: 0.000000e+00
Promedio tiempo para 29x29 es: 3.280167e-08
Promedio tiempo para 30x30 es: 0.000000e+00
Promedio tiempo para 31x31 es: 0.000000e+00
Promedio tiempo para 32x32 es: 0.000000e+00
Promedio tiempo para 33x33 es: 2.086986e-08
Promedio tiempo para 34x34 es: 0.000000e+00
Promedio tiempo para 35x35 es: 0.000000e+00
Promedio tiempo para 36x36 es: 1.714678e-08
Promedio tiempo para 37x37 es: 0.000000e+00
Promedio tiempo para 38x38 es: 0.000000e+00
Promedio tiempo para 39x39 es: 0.000000e+00
Promedio tiempo para 40x40 es: 0.000000e+00
Promedio tiempo para 41x41 es: 1.160749e-08
Promedio tiempo para 42x42 es: 0.000000e+00
Promedio tiempo para 43x43 es: 0.000000e+00
Promedio tiempo para 44x44 es: 9.391435e-09
Promedio tiempo para 45x45 es: 0.000000e+00
Promedio tiempo para 46x46 es: 8.218953e-09
Promedio tiempo para 47x47 es: 7.223833e-09
Promedio tiempo para 48x48 es: 7.233796e-09
Promedio tiempo para 49x49 es: 6.374895e-09
Promedio tiempo para 50x50 es: 0.000000e+00
Promedio tiempo para 51x51 es: 0.000000e+00
Promedio tiempo para 52x52 es: 0.000000e+00
Promedio tiempo para 53x53 es: 5.373563e-09
Promedio tiempo para 54x54 es: 5.080526e-09
Promedio tiempo para 55x55 es: 4.507889e-09
Promedio tiempo para 56x56 es: 4.555394e-09
Promedio tiempo para 57x57 es: 8.369647e-09
Promedio tiempo para 58x58 es: 4.100209e-09
Promedio tiempo para 59x59 es: 7.547023e-09
Promedio tiempo para 60x60 es: 7.175926e-09
Promedio tiempo para 61x61 es: 3.524524e-09
Promedio tiempo para 62x62 es: 6.503642e-09
Promedio tiempo para 63x63 es: 6.198835e-09
Promedio tiempo para 64x64 es: 6.103516e-09
Promedio tiempo para 65x65 es: 5.644060e-09
Promedio tiempo para 66x66 es: 5.391379e-09
Promedio tiempo para 67x67 es: 5.153559e-09
Promedio tiempo para 68x68 es: 5.088541e-09
Promedio tiempo para 69x69 es: 4.718288e-09
Promedio tiempo para 70x70 es: 4.518950e-09
Promedio tiempo para 71x71 es: 4.330686e-09
Promedio tiempo para 72x72 es: 4.286694e-09
Promedio tiempo para 73x73 es: 6.040867e-09
Promedio tiempo para 74x74 es: 3.825045e-09
Promedio tiempo para 75x75 es: 5.570370e-09
Promedio tiempo para 76x76 es: 5.353368e-09
Promedio tiempo para 77x77 es: 3.395154e-09
Promedio tiempo para 78x78 es: 4.952039e-09
Promedio tiempo para 79x79 es: 3.143768e-09
Promedio tiempo para 80x80 es: 4.589844e-09
Promedio tiempo para 81x81 es: 4.421940e-09
Promedio tiempo para 82x82 es: 2.811190e-09
Promedio tiempo para 83x83 es: 4.109922e-09
Promedio tiempo para 84x84 es: 3.964880e-09
Promedio tiempo para 85x85 es: 5.047832e-09
Promedio tiempo para 86x86 es: 4.952394e-09
Promedio tiempo para 87x87 es: 5.922524e-09
Promedio tiempo para 88x88 es: 5.722906e-09
Promedio tiempo para 89x89 es: 5.532158e-09
Promedio tiempo para 90x90 es: 5.349794e-09
Promedio tiempo para 91x91 es: 5.175358e-09
Promedio tiempo para 92x92 es: 6.035794e-09
Promedio tiempo para 93x93 es: 4.848593e-09
Promedio tiempo para 94x94 es: 4.695491e-09
Promedio tiempo para 95x95 es: 5.423531e-09
Promedio tiempo para 96x96 es: 5.312319e-09
Promedio tiempo para 97x97 es: 6.026255e-09
Promedio tiempo para 98x98 es: 5.790529e-09
Promedio tiempo para 99x99 es: 5.616825e-09

RUN SUCCESSFUL (total time: 4s)


*/
