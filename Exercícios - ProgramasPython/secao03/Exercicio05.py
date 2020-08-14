# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Tendo como dados de entrada a altura da pessoa, construa um algoritmo que calcule o
# seu peso ideal, usando uma fórmula definida.

#Entrada
height = float(input("Informe, em metros, sua altura: "))

#Processamento
ideal_weight = (72.7 * height) - 58;

#Saída
print("O peso ideal, para a altura informada, é de {0:.2f} kilos.".format(ideal_weight))