# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

#Elabore um algoritmo que leia as vari�veis c e n....

#Entrada
c = input("Informe o c�digo do colaborador: ")
worked_hours = float(input("Informe a quantidade de horas trabalhadas no referido m�s: "))

if worked_hours > 50:
    extra_hour = (worked_hours - 50) * 20
    payment = 50 * 10
    total = payment + extra_hour
    print("O colaborador de c�digo {0} receber� um total de R$ {1:0.2f} no referido m�s.".format(c, total))
    print("Sal�rio normal: R$ {0:0.2f}.".format(payment))
    print("Sal�rio extra: R$ {0:0.2f}.".format(extra_hour))

else:
    extra_hour = 0
    payment = worked_hours * 10
    print("O colaborador de c�digo {0} receber� um total de R$ {1:0.2f} no referido m�s.".format(c, payment))
    print("Sal�rio normal: R$ {0:0.2f}.".format(payment))
    print("Sal�rio extra: R$ {0:0.2f}.".format(extra_hour))
    