# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo
# que calcule seu peso ideal, utilizando as fórmulas.

#Entrada
heigth = float(input("Informe, em metros, sua altura: "))
sex = input("Informe M para Masculino e F para Feminino: ")

#Processamento
if sex.lower() == 'm':      # a função .lower passa tudo para minúsculo, evitando problemas na entrada de dados
    ideal_weight = (72.7 * heigth) - 58;
    
elif sex.lower() == 'f':
    ideal_weight = (62.1 * heigth) - 44.7

else:
    ideal_weight = 0
    print("Sexo não reconhecido, favor informar novamente.")

#Saída
print("Seu peso ideal é: {0:.2f}".format(ideal_weight))
     


