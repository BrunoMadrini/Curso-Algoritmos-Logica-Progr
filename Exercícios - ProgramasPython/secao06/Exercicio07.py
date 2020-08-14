# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Desenvolva um algoritmo que leia 4 nº, calcule o quadrado de cada um. Imprima apenas o
# terceiro, caso seja maior que 1000. Se não, imprima os quatro.

#Entrada
n1 = float(input("Informe o primeiro valor: "))
n2 = float(input("Informe o segundo valor: "))
n3 = float(input("Informe o terceiro valor: "))
n4 = float(input("Informe o quarto valor: "))

#Processamento
q1 = n1 * n1
q2 = n2 * n2
q3 = n3 * n3
q4 = n4 * n4

#Saída
if q3 > 1000:
    print("O quadrado de {0:0.2f} é {1:0.2f}.".format(n3, q3))
    
else:
    print("O quadrado de {0:0.2f} é {1:0.2f}.".format(n1, q1))
    print("O quadrado de {0:0.2f} é {1:0.2f}.".format(n2, q2))
    print("O quadrado de {0:0.2f} é {1:0.2f}.".format(n3, q3))
    print("O quadrado de {0:0.2f} é {1:0.2f}.".format(n4, q4))
    
