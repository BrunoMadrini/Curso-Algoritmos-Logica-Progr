# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um programa que carregue um vetor com dez n�meros inteiros. Mostre o vetor na
# ordem inversa que foi digitado.

#Vari�veis
vec = []

#Entrada
for n in range (1, 11):
    num = int(input("Informe o valor para o vetor: "))
    vec.append(num)
    
#Processamento
vec.reverse() #Inverte a lista
for n in vec:
    print(n)