# coding: iso-8859-1 -*- #tag usada para n�o dar conflitos com acentua��o

# Sua organiza��o acaba de contratar um estagi�rio...

#Vari�veis
cont_t = 0
cont_sit_1 = 0
cont_sit_2 = 0
cont_sit_3 = 0
cont_sit_4 = 0

#Entrada
ident = int(input("Informe a identifica��o do mouse: "))

#Processamento
while ident != 0:
    print("1 - Necessita de esfera.")
    print("2 - Nexessita de limpeza.")
    print("3 - Necessita de troca do cabo ou conector")
    print("4 - Quebrado ou inutiliz�vel.")
    
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
    ident = int(input("Informe a identifica��o do mouse: "))


p1 = cont_sit_1 / cont_t * 100
p2 = cont_sit_2 / cont_t * 100
p3 = cont_sit_3 / cont_t * 100
p4 = cont_sit_4 / cont_t * 100

    
#Sa�da
print("\nQuantidade total de mouses: {0}.\n".format(cont_t))
print("        Situa��o                                  Quantidade                 Percentual")
print("1 - Necessita de esfera                              {0}                         {1:0.2f}%".format(cont_sit_1, p1))      
print("1 - Necessita de limpeza                             {0}                         {1:0.2f}%".format(cont_sit_2, p2))        
print("1 - Necessita de troca de cabo ou conector           {0}                         {1:0.2f}%".format(cont_sit_3, p3))          
print("1 - Quebrado ou Inutiliz�vel                         {0}                         {1:0.2f}%".format(cont_sit_4, p4))


