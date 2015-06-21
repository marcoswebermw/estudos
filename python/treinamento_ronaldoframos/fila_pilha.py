# coding: utf-8
import os
os.system("clear")

#fila - FIFO
F = ["primeiro","segundo","terceiro","quarto","quinto"]
print("------------------")
print("Fila: ")
print(F)

while len(F) > 0:
	print("Removendo o %s da fila. " %(F[0]))
	F.pop(0)
	print(F)


#pilha - LIFO
#pilha - LIFO
P = ["primeiro","segundo","terceiro","quarto","quinto"]
print("------------------")
print("Pilha")
print(P)

while len(P) > 0:
	print("Removendo o %s da pilha. " %P[len(P)-1])
	P.pop()
	print(P)
