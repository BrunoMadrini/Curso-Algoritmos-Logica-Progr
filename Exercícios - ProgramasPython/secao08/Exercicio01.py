# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um algoritmo que carregue um vetor de 5 elementos inteiros e em seguida armezene
# em um vetor apenas os n�meros pares maiores que 0. no final deve mostrar os elemenn
# do vetor na tela.

#Vari�veis
vec = []            # � um tipo de dado chamado lista
pares = []          # � um tipo de dado chamado lista

#Processamento
for n in range (1, 6):
    vec.append(n)   # vetor vai adicionar o valor de N
    if n % 2 == 0:
        pares.append(n)

for p in pares:     # Fun��o pega os n�meros que est�o dentro do vetor pares
    print(p)
