# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um programa que receba um código numérico inteiro e um vetor de cinco posições de 
# números reais. Se o código for zero, termine o programa. Se o código for 1, mostre o 
# vetor na ordem direta, se o código for 2, mostre o vetor na ordem inversa.

#Variáveis
vec = []

#Entrada
print("1 - Para mostrar os valores da forma que foram inseridos")
print("2 - Para mostrar os valores da forma invertida à que foram inseridos")
cod = int(input("Informe o código: "))

#Processamento
if cod != 0:
    for n in range (0, 5):
        num = float(input("Informe um valor real: "))
        vec.append(num)
    if cod == 1:
        for n in vec:
            print(n)
    
    if cod == 2:
        vec.reverse()
        for n in vec:
            print(n)   
