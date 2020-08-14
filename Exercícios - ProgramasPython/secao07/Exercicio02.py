# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um algoritmo que conte de 1 a 100 e a cada multiplo de 10 emita uma msg de
# que o numero é multiplo de 10.

#Processamento

for n in range (1, 101):    #A função range determina o alcance (vai até n-1)
    print(n)
    if n % 10 == 0:
        print("Multiplo de 10.")
