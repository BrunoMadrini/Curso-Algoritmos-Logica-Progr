# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Ler um n� e verificar se ele � par ou impar. Quando for par armazenar esse valor em
# p e quando for impar armazenar em i. Mostrar par ou impar no final

#Entrada
num = float(input("Informe um valor: "))

#Processamento e Sa�da
if num % 2 == 0:
    p = num
    print("O n�mero {0} � par.".format(p))
    
else:
    i = num
    print("O n�mero {0} � impar.".format(i))