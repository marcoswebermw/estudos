# Loop While
cont = 0
while cont < 10:
    print("O valor do contador é %d" %cont)
    cont+= 1
print("Loop encerrado")


# While como variável de controle.
controle = ''
while(controle != 's'):
    print('a. Pagar')
    print('b. Receber')
    print('c. Consultar')
    print('s. Sair')
    controle = input('Digite a opção desejada:')
print('Loop Encerrado')

# While com o comando break
var = 20
while(var > 0):
    print('O valor de var é %d' %var)
    var -= 1
    if(var == 11):
        break
print("Loop Encerrado")
