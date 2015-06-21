# coding:utf8
import os
os.system("clear")

# fibonacci.
def fibonacci(limite):
    f = [0,1]
    atual = 1
    anterior = 1
    while(atual <= limite):
        f.append(atual)
        tmp = atual
        atual = atual + anterior
        anterior = tmp
        
    print(f)

limite = int(input("Digite o limite para o fibonacci: "))    
fibonacci(limite)
