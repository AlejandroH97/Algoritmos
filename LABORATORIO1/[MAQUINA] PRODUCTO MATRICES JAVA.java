package matricesmul;

import java.io.*;
import java.util.*;
import java.lang.*;

public class MatricesMul {
    
    static int[][] multiplicar(int[][]A, int[][]B){
        
        int resultado[][] = new int[A.length][B.length];
        for (int k = 0; k < A.length; k++) {
            
            for (int l = 0; l < A.length; l++) {
                
                for (int m = 0; m < A.length; m++) {  
                    
                    resultado[l][m] = resultado[l][m] + (A[k][l] * B[l][m]);
                }        
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero n de los arreglos de 1s y 2s de tamano nxn");
        int longitud = sc.nextInt();
        long tiempofinal;
        long tiempoinicial;
        double promedio;
        double[] listapromedio = new double[longitud-2];
        
        for (int i = 2; i < longitud; i++) {
            
            int matrizA[][] = new int[i][i];
            int matrizB[][] = new int[i][i];
            int resultado[][] = new int[i][i];
            
            for (int j = 0; j < i; j++) {
                
                for (int k = 0; k < i; k++) {
                    
                    matrizA[j][k] = 1;
                    matrizB[j][k] = 2;
                }
            }
            
            double aux = 0;
            
            for (int h = 0; h < 10; h++) {
                               
                tiempoinicial = System.nanoTime();
                resultado = multiplicar(matrizA,matrizB); 
                tiempofinal = System.nanoTime();
                promedio = (tiempofinal -  tiempoinicial) / (2*(Math.pow((double)i, 3.0)));
                aux = aux + promedio;
            }
            
            listapromedio[i-2] = aux * ((double)1/Math.pow(10.0,9.0 ));
        }
        
        for (int i = 0; i < listapromedio.length; i++) {
            
            System.out.println("Promedio de produco de matrices "+(i+2)+"x"+(i+2)+" con 1s y "+(i+2)+"x"+(i+2)+" con 2s es: "+listapromedio[i]);
        } 
    }
}
/*Ingrese el numero n de los arreglos de 1s y 2s de tamano nxn
100
Promedio de produco de matrices 2x2 con 1s y 2x2 con 2s es: 1.7372500000000002E-6
Promedio de produco de matrices 3x3 con 1s y 3x3 con 2s es: 6.177407407407408E-7
Promedio de produco de matrices 4x4 con 1s y 4x4 con 2s es: 5.71328125E-7
Promedio de produco de matrices 5x5 con 1s y 5x5 con 2s es: 3.48968E-7
Promedio de produco de matrices 6x6 con 1s y 6x6 con 2s es: 3.3855787037037033E-7
Promedio de produco de matrices 7x7 con 1s y 7x7 con 2s es: 3.3788775510204087E-7
Promedio de produco de matrices 8x8 con 1s y 8x8 con 2s es: 3.7461523437500004E-7
Promedio de produco de matrices 9x9 con 1s y 9x9 con 2s es: 2.443312757201646E-7
Promedio de produco de matrices 10x10 con 1s y 10x10 con 2s es: 2.4483250000000007E-7
Promedio de produco de matrices 11x11 con 1s y 11x11 con 2s es: 2.4868782870022546E-7
Promedio de produco de matrices 12x12 con 1s y 12x12 con 2s es: 2.0516521990740742E-7
Promedio de produco de matrices 13x13 con 1s y 13x13 con 2s es: 3.5621301775147926E-8
Promedio de produco de matrices 14x14 con 1s y 14x14 con 2s es: 6.132689504373178E-8
Promedio de produco de matrices 15x15 con 1s y 15x15 con 2s es: 6.278607407407408E-8
Promedio de produco de matrices 16x16 con 1s y 16x16 con 2s es: 6.3427490234375E-8
Promedio de produco de matrices 17x17 con 1s y 17x17 con 2s es: 6.23244453490739E-8
Promedio de produco de matrices 18x18 con 1s y 18x18 con 2s es: 6.295293209876544E-8
Promedio de produco de matrices 19x19 con 1s y 19x19 con 2s es: 6.156998104679984E-8
Promedio de produco de matrices 20x20 con 1s y 20x20 con 2s es: 6.14218125E-8
Promedio de produco de matrices 21x21 con 1s y 21x21 con 2s es: 6.123199438505563E-8
Promedio de produco de matrices 22x22 con 1s y 22x22 con 2s es: 5.968195905334336E-8
Promedio de produco de matrices 23x23 con 1s y 23x23 con 2s es: 5.738016766663928E-8
Promedio de produco de matrices 24x24 con 1s y 24x24 con 2s es: 5.5807870370370375E-8
Promedio de produco de matrices 25x25 con 1s y 25x25 con 2s es: 6.332019200000001E-8
Promedio de produco de matrices 26x26 con 1s y 26x26 con 2s es: 5.8785389167045976E-8
Promedio de produco de matrices 27x27 con 1s y 27x27 con 2s es: 5.236229233348575E-8
Promedio de produco de matrices 28x28 con 1s y 28x28 con 2s es: 3.9702897230320704E-8
Promedio de produco de matrices 29x29 con 1s y 29x29 con 2s es: 8.600762638894584E-9
Promedio de produco de matrices 30x30 con 1s y 30x30 con 2s es: 7.895722222222223E-9
Promedio de produco de matrices 31x31 con 1s y 31x31 con 2s es: 7.550770366889329E-9
Promedio de produco de matrices 32x32 con 1s y 32x32 con 2s es: 7.667465209960938E-9
Promedio de produco de matrices 33x33 con 1s y 33x33 con 2s es: 7.3780922169351925E-9
Promedio de produco de matrices 34x34 con 1s y 34x34 con 2s es: 7.317270506818645E-9
Promedio de produco de matrices 35x35 con 1s y 35x35 con 2s es: 5.540827988338192E-9
Promedio de produco de matrices 36x36 con 1s y 36x36 con 2s es: 5.265935785322359E-9
Promedio de produco de matrices 37x37 con 1s y 37x37 con 2s es: 4.689978875880995E-9
Promedio de produco de matrices 38x38 con 1s y 38x38 con 2s es: 4.68400094766001E-9
Promedio de produco de matrices 39x39 con 1s y 39x39 con 2s es: 4.642863163573223E-9
Promedio de produco de matrices 40x40 con 1s y 40x40 con 2s es: 4.8044375E-9
Promedio de produco de matrices 41x41 con 1s y 41x41 con 2s es: 4.545160401038871E-9
Promedio de produco de matrices 42x42 con 1s y 42x42 con 2s es: 4.539864755425979E-9
Promedio de produco de matrices 43x43 con 1s y 43x43 con 2s es: 4.660753141232848E-9
Promedio de produco de matrices 44x44 con 1s y 44x44 con 2s es: 4.571040336213374E-9
Promedio de produco de matrices 45x45 con 1s y 45x45 con 2s es: 5.5659588477366255E-9
Promedio de produco de matrices 46x46 con 1s y 46x46 con 2s es: 5.476611942138571E-9
Promedio de produco de matrices 47x47 con 1s y 47x47 con 2s es: 4.45683037477245E-9
Promedio de produco de matrices 48x48 con 1s y 48x48 con 2s es: 4.423796477141204E-9
Promedio de produco de matrices 49x49 con 1s y 49x49 con 2s es: 4.381992197128748E-9
Promedio de produco de matrices 50x50 con 1s y 50x50 con 2s es: 4.365496E-9
Promedio de produco de matrices 51x51 con 1s y 51x51 con 2s es: 4.369997210725889E-9
Promedio de produco de matrices 52x52 con 1s y 52x52 con 2s es: 4.746198651570323E-9
Promedio de produco de matrices 53x53 con 1s y 53x53 con 2s es: 4.415084264191245E-9
Promedio de produco de matrices 54x54 con 1s y 54x54 con 2s es: 4.8627908601331095E-9
Promedio de produco de matrices 55x55 con 1s y 55x55 con 2s es: 4.251480090157777E-9
Promedio de produco de matrices 56x56 con 1s y 56x56 con 2s es: 4.864240729774053E-9
Promedio de produco de matrices 57x57 con 1s y 57x57 con 2s es: 5.245427742949248E-9
Promedio de produco de matrices 58x58 con 1s y 58x58 con 2s es: 4.360664643896839E-9
Promedio de produco de matrices 59x59 con 1s y 59x59 con 2s es: 4.3394456103106944E-9
Promedio de produco de matrices 60x60 con 1s y 60x60 con 2s es: 4.3438587962962975E-9
Promedio de produco de matrices 61x61 con 1s y 61x61 con 2s es: 4.383351469946823E-9
Promedio de produco de matrices 62x62 con 1s y 62x62 con 2s es: 4.292191853244268E-9
Promedio de produco de matrices 63x63 con 1s y 63x63 con 2s es: 4.325334837050634E-9
Promedio de produco de matrices 64x64 con 1s y 64x64 con 2s es: 4.322319030761719E-9
Promedio de produco de matrices 65x65 con 1s y 65x65 con 2s es: 4.359462903959946E-9
Promedio de produco de matrices 66x66 con 1s y 66x66 con 2s es: 4.274369034699613E-9
Promedio de produco de matrices 67x67 con 1s y 67x67 con 2s es: 5.9826325046631406E-9
Promedio de produco de matrices 68x68 con 1s y 68x68 con 2s es: 6.663733335029514E-9
Promedio de produco de matrices 69x69 con 1s y 69x69 con 2s es: 6.275993960591644E-9
Promedio de produco de matrices 70x70 con 1s y 70x70 con 2s es: 4.410574344023324E-9
Promedio de produco de matrices 71x71 con 1s y 71x71 con 2s es: 4.28656705158545E-9
Promedio de produco de matrices 72x72 con 1s y 72x72 con 2s es: 4.738880047582304E-9
Promedio de produco de matrices 73x73 con 1s y 73x73 con 2s es: 4.6951958397704985E-9
Promedio de produco de matrices 74x74 con 1s y 74x74 con 2s es: 4.685238287959253E-9
Promedio de produco de matrices 75x75 con 1s y 75x75 con 2s es: 4.578878814814815E-9
Promedio de produco de matrices 76x76 con 1s y 76x76 con 2s es: 4.593879847645429E-9
Promedio de produco de matrices 77x77 con 1s y 77x77 con 2s es: 4.2115980662953175E-9
Promedio de produco de matrices 78x78 con 1s y 78x78 con 2s es: 4.273369409464084E-9
Promedio de produco de matrices 79x79 con 1s y 79x79 con 2s es: 4.326946752690963E-9
Promedio de produco de matrices 80x80 con 1s y 80x80 con 2s es: 4.7004374999999996E-9
Promedio de produco de matrices 81x81 con 1s y 81x81 con 2s es: 4.580793540581175E-9
Promedio de produco de matrices 82x82 con 1s y 82x82 con 2s es: 4.6374553837001786E-9
Promedio de produco de matrices 83x83 con 1s y 83x83 con 2s es: 4.6135798820190035E-9
Promedio de produco de matrices 84x84 con 1s y 84x84 con 2s es: 5.21378040303423E-9
Promedio de produco de matrices 85x85 con 1s y 85x85 con 2s es: 4.165296967229798E-9
Promedio de produco de matrices 86x86 con 1s y 86x86 con 2s es: 4.278855163696278E-9
Promedio de produco de matrices 87x87 con 1s y 87x87 con 2s es: 4.189173018194298E-9
Promedio de produco de matrices 88x88 con 1s y 88x88 con 2s es: 4.60492360654583E-9
Promedio de produco de matrices 89x89 con 1s y 89x89 con 2s es: 4.237299086910205E-9
Promedio de produco de matrices 90x90 con 1s y 90x90 con 2s es: 4.666064471879286E-9
Promedio de produco de matrices 91x91 con 1s y 91x91 con 2s es: 4.445255324315825E-9
Promedio de produco de matrices 92x92 con 1s y 92x92 con 2s es: 4.19971991349552E-9
Promedio de produco de matrices 93x93 con 1s y 93x93 con 2s es: 4.4644511081522266E-9
Promedio de produco de matrices 94x94 con 1s y 94x94 con 2s es: 4.406632562149042E-9
Promedio de produco de matrices 95x95 con 1s y 95x95 con 2s es: 4.713360548184868E-9
Promedio de produco de matrices 96x96 con 1s y 96x96 con 2s es: 4.355156792534722E-9
Promedio de produco de matrices 97x97 con 1s y 97x97 con 2s es: 4.1278963002082905E-9
Promedio de produco de matrices 98x98 con 1s y 98x98 con 2s es: 4.358819454479002E-9
Promedio de produco de matrices 99x99 con 1s y 99x99 con 2s es: 4.13484709352478E-9
BUILD SUCCESSFUL (total time: 29 seconds)
*/
