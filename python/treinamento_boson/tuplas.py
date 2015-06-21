# Tuplas
# Espécie de lista imutável como as strings.
# Usam parênteses, suportam diferentes tipos de dados, aninhamento e
# operações normais de sequencias.
T = ('Anakin','Luke','Yoda','Obi Wan')
U = ('Darth Vader',['jedi','sith'])

print("Tupla T")
print(T)
print("Tupla U")
print(U)
print("Tamanho da tupla T:")
print(len(T))
print("Indice do Yoda dentro da tupla T:")
print(T.index('Yoda'))
print("Quantas vezes aparece o nome Anakin:")
print(T.count('Anakin'))
print("Retorna o segundo elemento:")
print(T[1])
print("Retorna o segundo elemento da lista dentro da tupla:")
print(U[1][1])
