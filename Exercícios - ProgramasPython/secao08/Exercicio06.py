# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um programa que receba um c�digo num�rico inteiro e um vetor de cinco posi��es de 
# n�meros reais. Se o c�digo for zero, termine o programa. Se o c�digo for 1, mostre o 
# vetor na ordem direta, se o c�digo for 2, mostre o vetor na ordem inversa.

#Vari�veis
vec = []

#Entrada
print("1 - Para mostrar os valores da forma que foram inseridos")
print("2 - Para mostrar os valores da forma invertida � que foram inseridos")
cod = int(input("Informe o c�digo: "))

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
