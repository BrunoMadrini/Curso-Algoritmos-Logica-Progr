# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um algoritmo que determine o maior entre N números. A condição de parada é a
# entrada do valor 0, ou seja, o algoritmo deve ficar calculando o maior até que a
# entrada seja igual a zero.

#Variáveis
maior = 0

#Entrada
print("Para cancelar o programa, insira o número 0.")
n = int(input("Informe um número: "))

#Processamento
while n != 0:
    if n > maior:
        maior = n
    n = int(input("Informe um número: "))
print("O maior número é {0:0.2f}.".format(maior))