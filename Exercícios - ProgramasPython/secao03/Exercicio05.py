# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Tendo como dados de entrada a altura da pessoa, construa um algoritmo que calcule o
# seu peso ideal, usando uma f�rmula definida.

#Entrada
height = float(input("Informe, em metros, sua altura: "))

#Processamento
ideal_weight = (72.7 * height) - 58;

#Sa�da
print("O peso ideal, para a altura informada, � de {0:.2f} kilos.".format(ideal_weight))