# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

#Fa�a um algoritmo para calcular o estoque m�dio de uma pe�a.

#Entradas
qtd_min = int(input("Informe a quantidade m�nima: "))
qtd_max = int(input("Informe a quantidade m�xima: "))

#Processamento
est_med = (qtd_min + qtd_max) / 2

#Sa�da
print("O estoque m�dio da pe�a � de {0} unidades.".format(est_med))