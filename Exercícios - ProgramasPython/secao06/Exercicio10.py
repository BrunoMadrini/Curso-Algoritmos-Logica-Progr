# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Elaborar um algoritmo que leia a idade de um nadador e classifique-o em uma das
# categorias.

#Entrada
age = int(input("Informe a idade do nadador: "))

#Processamento
if age >= 5 and age <= 7:
    print("O nadador pertece a categoria Infantil A.")

if age >= 8 and age <= 11:
    print("O nadador pertece a categoria Infantil B.")

if age >= 12 and age <= 13:
    print("O nadador pertece a categoria Juvenil A.")

if age >= 14 and age <= 17:
    print("O nadador pertece a categoria Juvenil B.")
    
if age >= 18:
    print("O nadador percente a categoria Adulto.")

if age < 5:
    print("O nadador não tem categoria definida.")