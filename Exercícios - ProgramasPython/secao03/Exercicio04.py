# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um algoritmo que pergunta quanto voc� ganha por hora e o n�mero de horas trabal
# no m�s. Calcule e mostre o total do sal�rio no referido m�s.

#Entradas
valor_hora = int(input("Informe o valor recebido por hora trabalhada: "))
hora_mes = int(input("Informe a quantidade de horas trabalhadas no m�s: "))

#Processamento
total = valor_hora * hora_mes

#Sa�da
print("Voc� receber�, no referido m�s, {0} reais.". format(total))
