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

listatiempos = []

tiempoinicio = time.clock()
for i in range(0, 25000, 1):
    resultado_fibo = fibI(i)
    tiempofinal = time.clock()
    listatiempos.append(tiempofinal-tiempoinicio)
    print("n=", i, "fib(", i, ")=", resultado_fibo, "time", tiempofinal - tiempoinicio, "seconds process time")


numeros = np.arange(0, 25000, 1)
pl.ylabel("Tiempo")
pl.xlabel("Numero")
pl.plot(numeros, listatiempos)
pl.show()



