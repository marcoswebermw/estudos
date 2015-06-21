#coding:utf-8
import os
os.system("cls")

# permutações - Verificar se todos os elementos de A estão em B.
def permutacao(a,b):
    if len(a) == 0:
        return len(b) == 0
    if a[0] in b:
        i = b.index(a[0])
        return permutacao(a[1:], b[0:i] + b[i+1:])
    return False
# FIM DA FUNÇÂO permutacao.

A = input("Digite a lista A: ")
B = input("Digite a lista B: ")
print(permutacao(A,B))
