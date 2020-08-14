# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Construa um algoritmo que leia 10 valores inteiros e positivos e a) encontre o maior
# valor, b) encontre o menor valor e calcule a média dos nº lidos.

#Variáveis
maior = - 999
menor = 999
soma = 0

#Entrada e Processamento
for n in range (1, 11):
    valor = int(input("Informe um valor inteiro e positivo: "))
    if valor > 0:
        if valor > maior:
            maior = valor
        if valor < menor:
            menor = valor
        soma = soma + valor
    
    else:
        valor = int(input("Informe um valor inteiro e positivo: "))

media = soma / 2

#Saídas
print("O maior número foi: {0}.".format(maior))
print("O menor número foi: {0}.".format(menor))
print("A média dos números informados é: {0}.". format(media))