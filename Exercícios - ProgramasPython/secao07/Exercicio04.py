# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Construa um algoritmo que leia 10 valores inteiros e positivos e a) encontre o maior
# valor, b) encontre o menor valor e calcule a m�dia dos n� lidos.

#Vari�veis
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

#Sa�das
print("O maior n�mero foi: {0}.".format(maior))
print("O menor n�mero foi: {0}.".format(menor))
print("A m�dia dos n�meros informados �: {0}.". format(media))