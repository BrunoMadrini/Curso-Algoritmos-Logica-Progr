# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um algoritmo que carregue um vetor de 5 elementos inteiros e em seguida armezene
# em um vetor apenas os números pares maiores que 0. no final deve mostrar os elemenn
# do vetor na tela.

#Variáveis
vec = []            # É um tipo de dado chamado lista
pares = []          # É um tipo de dado chamado lista

#Processamento
for n in range (1, 6):
    vec.append(n)   # vetor vai adicionar o valor de N
    if n % 2 == 0:
        pares.append(n)

for p in pares:     # Função pega os números que estão dentro do vetor pares
    print(p)
