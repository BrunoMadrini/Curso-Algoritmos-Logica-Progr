# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um programa que carregue um vetor com 10 nº inteiros. Calcule e mostre os nº 
# superiores a 50 e suas respectivas posições. Mostrar mensagem caso # não tenha esta 
# condição.

#Variáveis
vec = []
tem_maior_50 = False

#Entrada
for n in range (0, 10):
    num = int(input("Informe {0} valor para o vetor: ".format(n+1)))
    vec.append(num)

for n in vec:
    if n > 50:
        print("O número {0} está na posição {1} do vetor.".format(n, vec.index(n))) #Informa a posição do valor no vetor
        tem_maior_50 = True

if tem_maior_50 == False:
    print("Não existe nenhum número maior do que 50!")