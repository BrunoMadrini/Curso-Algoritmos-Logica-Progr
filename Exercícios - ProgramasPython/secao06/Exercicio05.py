# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

#Jo�o da silva, pescador,.... Algoritmo para mostrar, caso tenha pescado acima de 50 kg, 
# a multa que dever� ser paga.

#Entrada
weight = float(input("Informe a quantidade, em kg, de peixes pescados: "))

if weight > 50:
    excess = weight - 50
    fine = excess * 4
    print("A quantidade pescada est� {0} kilo(s) acima do valor permitido.".format(excess))
    print("Voc� dever� pagar uma multa de R$ {0}.".format(fine))

else:
    excess = 0
    fine = 0
    print("A quantidade pescada est� dentro do limite.\nN�o ser� necess�rio pagar nenhuma multa.")
    print("Excesso: {0} kilos.".format(excess))
    print("Multa: R$ {0}.".format(fine))
