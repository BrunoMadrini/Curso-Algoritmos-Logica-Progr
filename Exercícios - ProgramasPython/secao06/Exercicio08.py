# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um algoritmo que leia um nº inteiro e mostre uma mensagem indicando se este
# número é par ou impar, e se é positivo ou negativo.

#Entrada
n1 = float(input("Informe um valor: "))

#Processamento
if n1 % 2 == 0:
    if n1 > 0:
        print("O número {0:.2f} é par e positivo.".format(n1))
    else:
        print("O número {0:0.2f} é par e negativo.".format(n1))
else:
    if n1 > 0:
        print("O número {0:0.2f} é impar e positivo.".format(n1))
    else:
        print("O número {0:.2f} é impar e negativo.".format(n1))


    