import numpy as np
import pylab as pl
import time

matrizA = []
matrizB = []
resultadosum = []

filasA = int(raw_input("Ingrese el numero de filas de la primer matriz A: "))
columnasA = int(raw_input("Ingrese el numero de columnas de la primer matriz A: "))
filasB = int(raw_input("Ingrese el numero de filas de la primer matriz B: "))
columnasB = int(raw_input("Ingrese el numero de columnas de la primer matriz B: "))

if filasA != filasB or columnasA != columnasB:
    print "Las matrices no se pueden sumar"
else:
    print "Matriz A de dimension %s x %s" % (filasA,columnasA)
    for i in range(filasA):
        matrizA.append([0]*columnasA)
    for j in range(filasA):
        for k in range(columnasA):
            matrizA[j][k] = int(raw_input("Posicion %s,%s: " % (j,k)))

    print "Matriz B de dimension %s x %s" % (filasB, columnasB)
    for i in range(filasB):
        matrizB.append([0] * columnasB)
    for j in range(filasB):
        for k in range(columnasB):
            matrizB[j][k] = int(raw_input("Posicion %s,%s: " % (j, k)))

    print "Matriz A"
    print matrizA
    print "Matriz B"
    print matrizB
    print "Resultado Suma"

    for i in range(filasA):
        resultadosum.append([0] * columnasB)
        for j in range(columnasB):
            resultadosum[i][j] = 0

    tiempoinicio = time.clock()
    for i in range(filasA):
        for j in range(columnasA):
            resultadosum[i][j] = resultadosum[i][j] + matrizA[i][j] + matrizB[i][j]
    tiempofinal = time.clock()

    print resultadosum
    print("Matriz A ", filasA, "x", columnasA, " sumada con Matriz B ", filasB, "x", columnasB, " da una Matriz Resultado ", filasA, "x", columnasA, " time", tiempofinal - tiempoinicio, "seconds process time")