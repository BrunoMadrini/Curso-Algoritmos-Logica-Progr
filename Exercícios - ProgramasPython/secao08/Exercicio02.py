# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Escreva um algoritmo que leia dois vetores de 10 posi��es e fa�a a soma dos elementos
# do mesmo �ndice, colocando o resultado em um terceiro valor. Mostre o vetor final.

#Vari�veis
vec1 = []
vec2 = []
soma = []

#Entrada
for n in range (1, 11):
    num1 = int(input("Informe o valor para o primeiro vetor: "))
    vec1.append(num1)
    num2 = int(input("Informe o valor para o segundo vetor: "))
    vec2.append(num2)
    soma.append(num1 + num2)
    
#Processamento
for n in soma:
    print(n)