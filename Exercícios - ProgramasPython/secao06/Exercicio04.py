# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo
# que calcule seu peso ideal, utilizando as f�rmulas.

#Entrada
heigth = float(input("Informe, em metros, sua altura: "))
sex = input("Informe M para Masculino e F para Feminino: ")

#Processamento
if sex.lower() == 'm':      # a fun��o .lower passa tudo para min�sculo, evitando problemas na entrada de dados
    ideal_weight = (72.7 * heigth) - 58;
    
elif sex.lower() == 'f':
    ideal_weight = (62.1 * heigth) - 44.7

else:
    ideal_weight = 0
    print("Sexo n�o reconhecido, favor informar novamente.")

#Sa�da
print("Seu peso ideal �: {0:.2f}".format(ideal_weight))
     


