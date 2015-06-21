#coding:utf-8
import os
os.system("cls")
#slices

# lista
a = [0,10,20,30,40,50]
print(a)

# todos os elementos
print("todos os elementos: {0}".format(a[:]))
# resultado: [0,10,20,30,40,50]

# imprimir todos os elementos até o 5º elemento excetuando-o.
# resultado: [0,10,20,30,40]
print("todos os elementos até o 5º não o incluindo: {0}".format(a[:5]))

# imprimir elemento com índice 1 até o 3, excetuando-o 3.
# resultado: [10,20]
print(" {0}".format(a[1:3]))

# imprimir elemento com índice 2 até o elemento com índice 4, excetuando-o o 4.
# resultado: [20,30]
print(" {0}".format(a[2:4]))

# imprimir do elemento de indece 3 até o fim.
# resultado: [30,40,50]
print("do elemento de índice 3 até o fim: {0}".format(a[3:]))

# imprimir o ultimo elemento.
# resultado: [50]
print("ultimo elemento: {0}".format(a[-1]))


