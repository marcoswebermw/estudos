# Dicionários - Mapeamentos não são propriamente sequencias.
# São coleções de objetos.
# Objetos são armazenados em chaves em vez de posição relativa.
# Mapeiam chaves a valores associados.
# São mutáveis.
DIC = {'produto':'tigela',"cor":"azul","preço":14}
print("Imprimir dicionário:")
print(DIC)

# Imprimir um item do dicionário pela chave.
print("Imprimir o produto:")
print(DIC['produto'])

# Alterar o valor de um item do dicionário pela chave.
DIC["preço"] += 1 # aumenta em 1 o valor do preço.
print("Novo preço:")
print(DIC['preço'])

# Criar um dicionário.
D = {}
D['nome'] = 'Anakin'
D['sobrenome'] = 'Skywalker'
D['lado'] = 'Dark Side'
print(D)

# Aninhamento em dicionários.
R = {'nome': {'primeiro':'Scarlett','ultimo':'Johansson'},
     'filmes':['A ilha','Os vingadores','Capitão America 2'],
     'idade':29}

print("\n")
print(R)

# Acessando valores em dicionários aninhados.
print(R['nome'])
print(R['nome']['primeiro'])
print(R['filmes'])
print(R['filmes'][-1]) # Ultimo elemento da lista
print(R['idade'])

# Inserindo elemento na lista que esta dentro do dicionário.
R['filmes'].append('Lucy')
print(R['filmes'])
print('\n')

# Ordenação de Dicionários.
print("\nOrdenando o dicionário com uma lista:")
D = {'b':2,'a':1,'d':4,'c':3}
ordenada = list(D.keys())
ordenada.sort()
for chave in ordenada:
    print(chave, ' = ', D[chave])

# Função sorted.
print("\nOrdenando o dicionário com a função sorted:")
for chave in sorted(D):
    print(D[chave])

