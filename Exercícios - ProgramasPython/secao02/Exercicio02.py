# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação
# Faça um algoritmo para somar 2 números e multiplicar o resultado pelo 1º.

#Entradas
num1 = int(input("Informe o primeiro número: "))
num2 = int(input("Informe o segundo número: "))

#Processamento
soma = num1 + num2
mult = soma * num1

#Saída
print("O resultado é {0}.".format(mult))