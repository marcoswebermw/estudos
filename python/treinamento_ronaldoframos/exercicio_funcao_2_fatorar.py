# coding:utf-8
import os

os.system("clear")

def fatorar(num):
	total = [[1,1]]
	for i in range(2,num):
		while num % i == 0:
			total.append([num,i])
			num = num / i
	
	total.sort()
	total.reverse()
	
	return total
	
	
numero = int(input("Digite o valor a ser fatorado: "))
fatorados = fatorar(numero)
tam = len(fatorados)

for i in range(0, tam):
	print("%d     |     %d" %(fatorados[i][0], fatorados[i][1]))
