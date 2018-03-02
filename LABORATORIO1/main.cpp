#include <cstdlib>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>

using namespace std;

static int fibIint(int numero){
        if ( numero == 0) { 
            return 0;
        }
        else{ 
            int a = 0;
            int b = 1;
            int c;
            for (int i = 1; i < numero; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }  
}
static short fibIshort(short numero){
        if ( numero == 0) { 
            return 0;
        }
        else{ 
            short a = 0;
            short b = 1;
            short c;
            for (short i = 1; i < numero; i++) {
                c = (short)(a + b);
                a = b;
                b = c;
            }
            return b;
        }  
}
static long fibIlong(long numero){
        if ( numero == 0) { 
            return 0;
        }
        else{ 
            long a = 0;
            long b = 1;
            long c;
            for (long i = 1; i < numero; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }  
}
static long fibIlonglong(long long numero){
        if ( numero == 0) { 
            return 0;
        }
        else{ 
            long long a = 0;
            long long b = 1;
            long long c;
            for (long long i = 1; i < numero; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }  
}
int main() {
       
    int numeroi = 46;
    short numeros = 25;
    long numerol = 103;
    long long numeroll = 134;
        
    cout<<"despues de fib (" << numeros << ")=" << fibIshort(numeros) << " short hacer overflow" << endl;
    cout<<"despues de fib (" << numeroi << ")=" << fibIint(numeroi) << " int hacer overflow" << endl;
    cout<<"despues de fib (" << numerol << ")=" << fibIlong(numerol) << " long hacer overflow" << endl;
    cout<<"despues de fib (" << numeroll << ")=" << fibIlonglong(numeroll) << " longlong hacer overflow" << endl;

    return 0;
}

