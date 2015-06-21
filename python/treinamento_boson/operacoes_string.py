# Operações com Strings
a = "Inconstitucionalissimamente"
print(a)
print("O comprimento de a: ")
print(len(a))
print("Acessar o terceiro caractere de a")
print(a[2])


# Slicing - Fatiamento
# Retornar a string inteira
print(a[:])
# Retornar a partir do indice 1, até o indice 3 - 1.
print(a[2:16])
# Retornar até o indice 16 - 1. Mesma coisa de a[0:16].
print(a[:16])
# Retornar a partir do indice 2 até o fim.
print(a[2:])
# Retornar o ultimo caractere.
print(a[-1])
# Retornar o penultimo caractere.
print(a[-2])
# Concatenação.
nome = "Scarlett "
sobrenome = "Johansson"
print("Concatenação: " + nome + sobrenome)
# Repetição de strings.
print("Repetição de strings")
print(nome * 6)

# Teste
c = "Linux"
print(c[:3])


# Imutabilidade - strings, numeros e tuplas são imultaveis.
#nome[0] = "A" # Gera erro.


