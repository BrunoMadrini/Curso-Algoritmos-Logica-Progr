# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# A secretaria do Meio Ambiente que controla....

#Entrada
ind = float(input("Informe o �ndice de polui��o: "))

#Processamento
if ind >= 0.3 and ind < 0.4:
    print("As empresas do 1� grupo dever�o suspender suas atividades.")

if ind >= 0.4 and ind < 0.5:
    print("As empresas do 1� e 2� grupo dever�o suspender suas atividades.")

if ind >= 0.5:
    print("Todas as empresas dever�o suspender suas atividades.")

if ind < 0.3:
    print("O �ndice de polui��o est� dentro do limite aceit�vel.\nNenhuma empresa dever� suspender suas atividades.")