# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um algoritmo que determine o maior entre N n�meros. A condi��o de parada � a
# entrada do valor 0, ou seja, o algoritmo deve ficar calculando o maior at� que a
# entrada seja igual a zero.

#Vari�veis
maior = 0

#Entrada
print("Para cancelar o programa, insira o n�mero 0.")
n = int(input("Informe um n�mero: "))

#Processamento
while n != 0:
    if n > maior:
        maior = n
    n = int(input("Informe um n�mero: "))
print("O maior n�mero � {0:0.2f}.".format(maior))