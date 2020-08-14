# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

#Elabore um algoritmo que leia as variáveis c e n....

#Entrada
c = input("Informe o código do colaborador: ")
worked_hours = float(input("Informe a quantidade de horas trabalhadas no referido mês: "))

if worked_hours > 50:
    extra_hour = (worked_hours - 50) * 20
    payment = 50 * 10
    total = payment + extra_hour
    print("O colaborador de código {0} receberá um total de R$ {1:0.2f} no referido mês.".format(c, total))
    print("Salário normal: R$ {0:0.2f}.".format(payment))
    print("Salário extra: R$ {0:0.2f}.".format(extra_hour))

else:
    extra_hour = 0
    payment = worked_hours * 10
    print("O colaborador de código {0} receberá um total de R$ {1:0.2f} no referido mês.".format(c, payment))
    print("Salário normal: R$ {0:0.2f}.".format(payment))
    print("Salário extra: R$ {0:0.2f}.".format(extra_hour))
    