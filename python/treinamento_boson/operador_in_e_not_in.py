# Operador in e not in
# in - operador lógico - verifica se um dado valor
# esta dentro de determinada coleção.
# Coleções podem ser strings, listas, dicionários e tuplas.
l = ["Uva", "Manga", "Laranja", "Goiaba", "Maçã"]
if "Goiaba" in l:
    print("Está na lista")
else:
    print("Não está na lista")


# not in - o inverso do in.
l = ["Python","Ruby","Java","C#","C++"]
if "Php" not in l:
    print("Linguagem não encontrada")
else:
    print("Linguagem encontrada")



# Outra forma
palavra = "Python"
if "a" in palavra:
    print("Letra encontrada")
else:
    print("Letra não encontrada")
