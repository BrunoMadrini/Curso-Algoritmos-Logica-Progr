# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um programa para mostrar a tabuada de um numero informado.

#Entrada
num = int(input("Informe um n�mero inteiro: "))

#Processamento e Sa�da
while num < 1 and num > 10:
    num = int(input("Informe um n�mero inteiro: "))

print("Tabuada do n�mero {0}.".format(num))
for n in range (1, 11):
    print("{0} x {1} = {2}".format(n, num, (num * n)))


