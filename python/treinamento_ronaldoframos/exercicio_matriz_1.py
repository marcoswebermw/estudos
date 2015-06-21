#coding: utf-8

import os

os.system("clear") #linux
#os.system("cls") #windows

# receber o vetor pelo teclado.
a = []
a.append(input("Digite o valor 1: "))
a.append(input("Digite o valor 2: "))
a.append(input("Digite o valor 3: "))

print(a)

# selecionar o maior e o menor valor do vetor.
maior = 0
	
if (int(a[0]) > maior):
	maior = int(a[0])
if (int(a[1]) > maior):
	maior = int(a[1])
if (int(a[2]) > maior):
	maior = int(a[2])

menor = maior

if (int(a[0]) < menor):
	menor = int(a[0])
if (int(a[1]) < menor):
	menor = int(a[1])
if (int(a[2]) < menor):
	menor = int(a[2])

	
print("O maior valor do vetor é: ", maior)
print("O menor valor do vetor é: ", menor)


# calcular a média aritmética do vetor.
media = 0
media = (int(a[0]) + int(a[1]) + int(a[2])) / len(a)
print("A média do vetor \'a\' é: ", media)


# inverter o vetor sem a função reverse.
aux = int(a[0])
a[0] = int(a[2])
a[1] = int(a[1])
a[2] = aux
print("O vetor invertido é: ", a)

# encontrar a posição de um elemento na lista(pesquisa linear).
posicao = 0
busca = int(input("Indique um valor que esteja no vetor: "))
if a[0] == busca:
	print("O valor ", busca," está na posição: 0")
elif a[1] == busca:
	print("O valor ", busca," está na posição: 1")
elif a[2] == busca:
	print("O valor ", busca," está na posição: 2")
else:
	print("O valor digitado não está no vetor.")



# selecionar os elementos pares do vetor e copiá-los para outro vetor.
vetor_par = []

for x in a:
	if x % 2 == 0:
		vetor_par.append(x)
		
if len(vetor_par) != 0:
	print("Os elementos pares são: ", vetor_par)
else:
	print("Não existem elementos pares no vetor 'a'.")


# intercalando vetores.
v1 = [10,"Brasil",'a']
v2 = ['B', 20, "Florianópolis"]
v3 = []
v3.append(a[0])
v3.append(v1[0])
v3.append(v2[0])
v3.append(a[1])
v3.append(v1[1])
v3.append(v2[1])
v3.append(a[2])
v3.append(v1[2])
v3.append(v2[2])

print("Vetores intercalados: ", v3)
