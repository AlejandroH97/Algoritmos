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
