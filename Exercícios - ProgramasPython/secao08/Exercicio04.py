# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um algoritmo que leia e mostre um vetor de 20 elementos inteiros, em seguida mostre
# a soma de todos elementos.

#Vari�veis
vec = []
soma = 0

#Proessamento
for n in range (0, 20):
    num = int(input("Informe um valor para o vetor ({0}/20): ".format(n+1)))
    vec.append(num)
    soma = soma + num

#Sa�da
print("A soma dos n�meros do vetor �: {0}.".format(soma))