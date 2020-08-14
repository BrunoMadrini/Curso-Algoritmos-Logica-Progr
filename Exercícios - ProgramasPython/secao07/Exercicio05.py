# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Faça um programa que leia os nomes de usuários e a sua senha e não aceite a senha
# igual ao nome de usuário, mostrando uma mensagem de erro e voltando ao inicio.

name = input("Informe o nome do usuário: ")
password = input("Informe a senha do usuário: ")

#Processamento
while name.lower() == password.lower():
    print("ERRO!!! O nome de usuário e a senha devem ser diferentes.")
    name = input("Informe o nome do usuário: ")
    password = input("Informe a senha do usuário: ")

