# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Fa�a um programa que leia os nomes de usu�rios e a sua senha e n�o aceite a senha
# igual ao nome de usu�rio, mostrando uma mensagem de erro e voltando ao inicio.

name = input("Informe o nome do usu�rio: ")
password = input("Informe a senha do usu�rio: ")

#Processamento
while name.lower() == password.lower():
    print("ERRO!!! O nome de usu�rio e a senha devem ser diferentes.")
    name = input("Informe o nome do usu�rio: ")
    password = input("Informe a senha do usu�rio: ")

