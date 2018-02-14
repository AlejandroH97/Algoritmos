import numpy as np
import pylab as pl
import time

def fibR(n):
    if n==0 :
        return 0
    if n==1 :
        return 1
    return fibR(n-1)+fibR(n-2)

listatiempos = []

tiempoinicio = time.clock()
for i in range(0, 45, 5):
    resultado_fibo = fibR(i)
    tiempofinal = time.clock()
    listatiempos.append(tiempofinal-tiempoinicio)
    print("n=", i, "fib(", i, ")=", resultado_fibo, "time", tiempofinal - tiempoinicio, "seconds process time")


numeros = np.arange(0, 45, 5)
pl.ylabel("Tiempo")
pl.xlabel("Numero")
pl.plot(numeros, listatiempos)
pl.show()



