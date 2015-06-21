# Loop For
# O loop for em Python pode iterar pelos itens
# de qualquer sequência, como uma lista ou string.
var = 'Python'
for x in var:
    print(x)

frutas = ['laranja','morango','guaraná','açaí']
for y in frutas:
    print('Fruta: %s' %y)

# Função range() - Gera uma lista contendo uma
# progressão aritmética.
# range(inicio,fim,salto)

range(11)     # valores de 0 a 10.
range(5,11)   # valores de 5 a 10.
range(2,50,2) # valores de 2 a 50 saltando de 2 em 2.

for x in range(11):
    print(x)

for w in range(0,51,5):
    print(w)


