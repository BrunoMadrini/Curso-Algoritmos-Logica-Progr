# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# A secretaria do Meio Ambiente que controla....

#Entrada
ind = float(input("Informe o índice de poluição: "))

#Processamento
if ind >= 0.3 and ind < 0.4:
    print("As empresas do 1º grupo deverão suspender suas atividades.")

if ind >= 0.4 and ind < 0.5:
    print("As empresas do 1º e 2º grupo deverão suspender suas atividades.")

if ind >= 0.5:
    print("Todas as empresas deverão suspender suas atividades.")

if ind < 0.3:
    print("O índice de poluição está dentro do limite aceitável.\nNenhuma empresa deverá suspender suas atividades.")