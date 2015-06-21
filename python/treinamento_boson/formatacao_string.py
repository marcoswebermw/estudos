# Operador de modulo ou formatação ou interpolação.
jedi = "Anakin Skywalker"
print("Darth Vader é na verdade %s" %jedi)
sith = 1
print("Um mestre Lord Sith só pode ter %d aprendiz." %sith)

a = "Força"
b = "Sabre de Luz"
print("Todo Jedi com a %s tem que ser capaz de construir seu %s" %(a,b))

# Tipos de caracteres de formatação.
# s - String
# d - Decimal Inteiro
# f - Decimal Ponto-Flutuante
# o - Octal
# x - Hexadecimal (min)
# X - Hexadecimal (mai)
# c - Um caractere

# Método str.format
rainha_senadora = "Padmé Amidala"
print("{0} casou-se com a senadora {1}. {0} se tornou um sith.".format(jedi,rainha_senadora))



