#coding:utf8
# NÃºmeros aleatÃ³rios
import random
import math

a = random.random()
b = random.random() * 5
print("Num. aleatorio entre 0  e 1: ")
print(a)
print("Num. aleatÃ³rio entre 0 e 5")
print(b)
print("Num. aleatÃ³rio entre 1 e 5 arredondado")
print(math.ceil(b))

escolha = random.choice([1,10,20,30,40,50])
print("Escolha aleatoria em lista predefinida")
print(escolha)

escolha_string = random.choice(["Uva","MaÃ§Ã£","Banana","Pera","Morango"])
print("Escolha aleatoria em lista predefinida com string")
print(escolha_string)


