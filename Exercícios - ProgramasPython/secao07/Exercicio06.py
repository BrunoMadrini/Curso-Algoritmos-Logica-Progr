# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um programa para mostrar a tabuada de um numero informado.

#Entrada
num = int(input("Informe um número inteiro: "))

#Processamento e Saída
while num < 1 and num > 10:
    num = int(input("Informe um número inteiro: "))

print("Tabuada do número {0}.".format(num))
for n in range (1, 11):
    print("{0} x {1} = {2}".format(n, num, (num * n)))


