# coding:utf-8
import os
os.system("clear")

# extend adiciona a uma lista valores de outra.
# não é bem uma cópia mas sim uma extensão.
# mas funciona como uma cópia se a lista que vai
# receber os valores do outro vetor for vazia.

x = []
y = [5, 100]

print("x é %s" %x)
print("y é %s" %y)

print("-----------------------------------------")
print("Cópia por referência:")
print("\nx = y")
x = y

print("x é %s" %x)
print("y é %s" %y)

y.append(500)

print("\ny.append(500)")
print("x agora é %s" %x)
print("y é %s" %y)
print("\nO valor de x muda de acordo com y\n")

print("-----------------------------------------")
print("Cópia por extend:")

x = []
y = [5, 100]

print("x é %s" %x)
print("y é %s" %y)

print("\nx.extend(y)")
x.extend(y)

print("x é %s" %x)
print("y é %s" %y)

y.append(500)

print("\ny.append(500)")
print("x é %s" %x)
print("y é %s" %y)
print("\nO valor de x NÃO muda de acordo com y\n")
