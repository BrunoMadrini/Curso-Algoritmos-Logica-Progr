# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um programa que carregue um vetor com 10 n� inteiros. Calcule e mostre os n� 
# superiores a 50 e suas respectivas posi��es. Mostrar mensagem caso # n�o tenha esta 
# condi��o.

#Vari�veis
vec = []
tem_maior_50 = False

#Entrada
for n in range (0, 10):
    num = int(input("Informe {0} valor para o vetor: ".format(n+1)))
    vec.append(num)

for n in vec:
    if n > 50:
        print("O n�mero {0} est� na posi��o {1} do vetor.".format(n, vec.index(n))) #Informa a posi��o do valor no vetor
        tem_maior_50 = True

if tem_maior_50 == False:
    print("N�o existe nenhum n�mero maior do que 50!")