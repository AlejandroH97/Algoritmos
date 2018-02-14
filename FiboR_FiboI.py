import numpy as np
import pylab as pl
import time

def fibI(n):
    if( n == 0):
        return 0
    else:
        a = 0
        b = 1
        for i in range(1,n):
            c = (a + b)
            a = b
            b = c
        return b

def fibR(n):
    if n==0 :
        return 0
    if n==1 :
        return 1
    return fibR(n-1)+fibR(n-2)

listatiemposR = []
listatiemposI = []

print "Tiempo empleado para Fibonacci de Manera Recursiva"
tiempoinicioR = time.clock()
for i in range(0, 40, 1):
    resultado_fiboR = fibR(i)
    tiempofinalR = time.clock()
    listatiemposR.append(tiempofinalR - tiempoinicioR)
    print("n=", i, "fib(", i, ")=", resultado_fiboR, "time", tiempofinalR - tiempoinicioR, "seconds process time")

print "Tiempo empleado para Fibonacci de Manera Iterada"
tiempoinicioI = time.clock()
for i in range(0, 40, 1):
    resultado_fiboI = fibI(i)
    tiempofinalI = time.clock()
    listatiemposI.append(tiempofinalI - tiempoinicioI)
    print("n=", i, "fib(", i, ")=", resultado_fiboI, "time", tiempofinalI - tiempoinicioI, "seconds process time")

print"Fibo recursivo = Azul e Iterado = Naranja"
numeros = np.arange(0, 40, 1)
pl.ylabel("Tiempo")
pl.xlabel("Numero")
pl.plot(numeros, listatiemposR, numeros, listatiemposI)
pl.show()
