# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um algoritmo que leia um n� inteiro e mostre uma mensagem indicando se este
# n�mero � par ou impar, e se � positivo ou negativo.

#Entrada
n1 = float(input("Informe um valor: "))

#Processamento
if n1 % 2 == 0:
    if n1 > 0:
        print("O n�mero {0:.2f} � par e positivo.".format(n1))
    else:
        print("O n�mero {0:0.2f} � par e negativo.".format(n1))
else:
    if n1 > 0:
        print("O n�mero {0:0.2f} � impar e positivo.".format(n1))
    else:
        print("O n�mero {0:.2f} � impar e negativo.".format(n1))


    