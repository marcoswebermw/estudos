# coding:utf-8
import os
os.system("clear")

def pesquisa_binaria(vetor_ordenado, valor_procurado):
	base = 0
	topo = len(vetor_ordenado) -1
	encontrou = False
	while((not encontrou) and (base <= topo)):
		meio = (topo + base) / 2
		if valor_procurado == vetor_ordenado[meio]:
			encontrou = True
			return meio
		elif valor_procurado > vetor_ordenado[meio]:
			base = meio + 1
		else:
			topo = meio - 1
	
	return False
	
vet = (input("Informe o vetor a ser procurado(ATENÇÂO: o vetor deve estar ordenado):\n"))	
procurar = int(input("Digite o valor a ser procurado: "))
resultado = pesquisa_binaria(vet, procurar)

if resultado != False:
	print("O valor %d foi encontrado no indice [%d]" %(procurar, resultado))
else:
	print("O valor não foi encontrado no vetor passado.")
		
	
