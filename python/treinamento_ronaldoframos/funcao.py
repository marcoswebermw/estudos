# -*- coding:utf8 -*-
import os
os.system("clear")

print("Fatorial")



# Lembrando: fatorial tem q ser maior q zero.
# E fatorial de 0 é 1.

def fat(n):
	if n < 0 :
		print("Erro. Não existe fatorial de número negativo!")
	elif n == 0:
		return 1
	else:
		fat = n # fat é uma variável não tem nada a ver com fat nome da função.
		for i in range(1,n):
			fat = fat * i
		return fat


num = int(input("Número:"))
n = fat(num)		
print(n)




# Outro modo de representar fatorial.
print("Fatorial 2")

def fat2(n):
	if n < 0 :
		print("Erro. Não existe fatorial de número negativo!")
	elif n == 0:
		return 1
	else:
		fatorial = n 
		for i in range(1,n):
			fatorial = fatorial * i
		return fatorial

n = fat2(int(input("Número:")))		
print(n)
