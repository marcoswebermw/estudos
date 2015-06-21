# Sequencias

# Listas
# Não são imutáveis. Lembra os vetores de outras linguagens.
# Pode crescer e diminuir de tamanho.
# Criação de listas.
l = []
print(l)
l = [0,1,2,3,4]
print(l)
l = ["a","b","c"]
print(l)
l = ["a",["b","c","d"]]
print(l)

# Para visualizar uma lista no interpretador de comandos,
# pode-se usar o comando list ao invés do print.
list(l)

# Concatenação.
l1 = [1, 2, 3, 4]
l2 = [5, 6, 7]
print(l1 + l2)

# Multiplicação - Exibir na tela várias vezes os mesmos itens.
print(l1 * 3)

# Verificar existencia.
pertence = (1 in l1)
if pertence == True:
    print("1 está dentro da lista l1.")
else:
    print("1 não está dentro da lista l1")


# Repetição
for x in l1:
    print(x)

# Acrescentar itens
l1.append(9)
print(l1)

# Inserir item em posição especifica.
l1.insert(2,99)
print(l1)


# Busca posição por valor.
print("Posição do valor 99: ")
print(l1.index(99))


# Contagem de ocorrências de determinado valor.
l1.append(3)
print("O número de vezes que o valor 3 aparece na lista:")
print(l1.count(3))




# Ordenar lista.
print("Lista não ordenada:")
print(l1)
l1.sort()
print("Lista ordenada:")    
print(l1)


# Lista reversa.
print("Lista reversa:")
l1.reverse()
print(l1)
l1.reverse() # Para voltar ao normal.

# Remover a primeira ocorrência de um item.
l1.remove(3)
print("Primeira ocorrencia de 3 removida")
print(l1)

# Remover item na posição especificada e retorn�-lo.
l1.pop(5)
print("Remover o item na posição 5, no caso o 99")
print(l1)

# Remove item na posição de indice especificada.
del l1[4]
print("Removendo o número nove que esta na posição 4")
print(l1)

# Remove iten em um intervalo especificado.
del l1[1:3]
print("Removendo um intervalo de itens")
print(l1)

# Atribuição em uma posição da lista, substituindo valor caso exista.
l1[1] = 25
print("Adicionando o valor 25 à lista no lugar do 4")
print(l1)

# Atribuição de valore em um intervalo.
l1[1:5] = [2,3,4,5]
print("Adicionando um intervalo de valores")
print(l1)

# Compreensão - Criar nova lista com valores incrementados
l3 = [x + 1 for x in l1]
print("Nova lista criada a partir da lista l1, com cada valor incrementado de + 1")
print(l3)

# Retornar o tamanho da lista
print("Retornar o tamanho da lista l1")
print(len(l1))

# map(f,lista) Aplica a função f a cada um dos elementos da lista;
import math
print("Raiz quadrada de todos elementos da lista l1:")
print(  list( map(math.sqrt,l1) ))




