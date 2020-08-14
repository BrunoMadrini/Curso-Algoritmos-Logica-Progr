# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um algoritmo que leia e mostre um vetor de 20 elementos inteiros, em seguida mostre
# a soma de todos elementos.

#Variáveis
vec = []
soma = 0

#Proessamento
for n in range (0, 20):
    num = int(input("Informe um valor para o vetor ({0}/20): ".format(n+1)))
    vec.append(num)
    soma = soma + num

#Saída
print("A soma dos números do vetor é: {0}.".format(soma))