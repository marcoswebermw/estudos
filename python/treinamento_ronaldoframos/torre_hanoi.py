# coding:utf-8
import os
from time import sleep

os.system("clear")

## torre de hanói
# Consiste em 3 pinos, onde o 1º contem uma pilha com todos os discos.
# Os discos estão disposto de modo que no topo sempre fique o menor e 
# na base o maior.
# Um disco menor nunca poderá ficar em baixo de um disco maior.
# O objetivo é transportar os discos do pino 1(origem) para o pino 3 (destino).
# Para isso é necessário usar o pino 2(temp).

# Função que indica a quantidade de movimentos necessários 
# para completar a torre de hanói.
# movimentos = (2^n) - 1 onde n é a quantidade de discos existentes.

def quant_movimentos(num_elementos):
	return (2**num_elementos) - 1

def mover(origem, destino):
	disco = origem.pop()
	destino.append(disco)
	print("------------------------")
	print("moveu")	
	print("{0} - {1} - {2}".format(pino1,pino2,pino3))
	sleep(1)
#fim da função mover

def hanoi(num_elementos, origem, destino, tmp):
	if num_elementos == 1:
		mover(origem, destino)		
	else:
		hanoi(num_elementos-1, origem, tmp, destino)
		mover(origem, destino)
		hanoi(num_elementos-1, tmp, destino, origem)
#fim da função hanoi		

x = int(input("Digite o número de anéis: "))

os.system("clear")
print("Para %d elemento(s) é(são) necessário(s) %d movimento(s) " %(x, quant_movimentos(x)))

pino1 = []
pino2 = []
pino3 = []

for i in range(0,x):
	pino1.append(x-i)


print("1:",pino1)
print("2:",pino2)
print("3:",pino3)

hanoi(x,pino1,pino3,pino2)

