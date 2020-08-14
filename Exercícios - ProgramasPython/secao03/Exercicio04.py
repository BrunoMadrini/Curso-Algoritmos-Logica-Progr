# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um algoritmo que pergunta quanto você ganha por hora e o número de horas trabal
# no mês. Calcule e mostre o total do salário no referido mês.

#Entradas
valor_hora = int(input("Informe o valor recebido por hora trabalhada: "))
hora_mes = int(input("Informe a quantidade de horas trabalhadas no mês: "))

#Processamento
total = valor_hora * hora_mes

#Saída
print("Você receberá, no referido mês, {0} reais.". format(total))
