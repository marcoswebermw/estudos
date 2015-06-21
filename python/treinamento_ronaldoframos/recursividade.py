# coding:utf-8
import os
os.system("clear")

print("FATORIAL")
# Toda função recursiva chama a sí própria.
# Toda função recursiva tem um caso base, caso de parada ou condição de escape,
# que finaliza o processo de recursão, e evita loop infinito.
def fat(n):
	if n < 0:
		return "Erro... valor menor que zero"
	elif n == 0:
		return 1
	else:
		print("%d! * " %n),
		return fat(n - 1) * n
		
x = int(input("Digite um valor para calcular o fatorial: "))
print("\b\b\b\b\b = %d" %(fat(x)) )


os.system("clear")

print("\nFIBONACCI RECURSIVO")
def fib(n):
	if n == 1:
		return 0
	elif n == 2:
		return 1
	else:
		return fib(n-1) + fib(n-2)
		
x = int(input("Digite um valor para ser o limite do fibonacci: "))

for i in range(1, x+1):
	print(fib(i)),
