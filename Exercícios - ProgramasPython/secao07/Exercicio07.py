# coding: iso-8859-1 -*- #tag usada para não dar conflitos com acentuação

# Sua organização acaba de contratar um estagiário...

#Variáveis
cont_t = 0
cont_sit_1 = 0
cont_sit_2 = 0
cont_sit_3 = 0
cont_sit_4 = 0

#Entrada
ident = int(input("Informe a identificação do mouse: "))

#Processamento
while ident != 0:
    print("1 - Necessita de esfera.")
    print("2 - Nexessita de limpeza.")
    print("3 - Necessita de troca do cabo ou conector")
    print("4 - Quebrado ou inutilizável.")
    
#Entrada novamente
    defeito = int(input("Informe o defeito: "))

#Processamento
    if defeito == 1:
        cont_sit_1 = cont_sit_1 + 1
    elif defeito == 2:
        cont_sit_2 = cont_sit_2 + 1
    elif defeito == 3:
        cont_sit_3 = cont_sit_3 + 1
    elif defeito == 4:
        cont_sit_4 = cont_sit_4 + 1
    cont_t = cont_t + 1

#Entrada
    ident = int(input("Informe a identificação do mouse: "))


p1 = cont_sit_1 / cont_t * 100
p2 = cont_sit_2 / cont_t * 100
p3 = cont_sit_3 / cont_t * 100
p4 = cont_sit_4 / cont_t * 100

    
#Saída
print("\nQuantidade total de mouses: {0}.\n".format(cont_t))
print("        Situação                                  Quantidade                 Percentual")
print("1 - Necessita de esfera                              {0}                         {1:0.2f}%".format(cont_sit_1, p1))      
print("1 - Necessita de limpeza                             {0}                         {1:0.2f}%".format(cont_sit_2, p2))        
print("1 - Necessita de troca de cabo ou conector           {0}                         {1:0.2f}%".format(cont_sit_3, p3))          
print("1 - Quebrado ou Inutilizável                         {0}                         {1:0.2f}%".format(cont_sit_4, p4))


