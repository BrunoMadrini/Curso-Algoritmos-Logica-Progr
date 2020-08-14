# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Ler um nº e verificar se ele é par ou impar. Quando for par armazenar esse valor em
# p e quando for impar armazenar em i. Mostrar par ou impar no final

#Entrada
num = float(input("Informe um valor: "))

#Processamento e Saída
if num % 2 == 0:
    p = num
    print("O número {0} é par.".format(p))
    
else:
    i = num
    print("O número {0} é impar.".format(i))