# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

#Faça um algoritmo para calcular o estoque médio de uma peça.

#Entradas
qtd_min = int(input("Informe a quantidade mínima: "))
qtd_max = int(input("Informe a quantidade máxima: "))

#Processamento
est_med = (qtd_min + qtd_max) / 2

#Saída
print("O estoque médio da peça é de {0} unidades.".format(est_med))