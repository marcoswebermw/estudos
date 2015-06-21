# coding:utf-8
import os
os.system("clear")

def pesquisar(vetor_ordenado, valor_procurado):
	def pesquisa_binaria(base, topo):
		if base==topo: return base
		else:
			meio = (topo + base) / 2
			if valor_procurado > vetor_ordenado[meio]:
				return pesquisa_binaria((meio + 1), topo)
			else:
				return pesquisa_binaria(base, meio)
	# FIM DA FUNÇÂO pesquisa_binaria
	
	i = pesquisa_binaria(0, len(vetor_ordenado) -1)	
	if vetor_ordenado[i] == valor_procurado:
		print("O valor %d foi encontrado no indice [%d]" %(valor_procurado, i))
	else:
		print("O valor não foi encontrado no vetor passado.")			
# FIM DA FUNÇÂO pesquisar		
		
#pesquisar([1,2,5,6,9,12],12)
vet = input("Informe o vetor a ser procurado(ATENÇÂO: o vetor deve estar ordenado):\n")
procurar = input("Digite o valor a ser procurado: ")
pesquisar(vet,procurar)
