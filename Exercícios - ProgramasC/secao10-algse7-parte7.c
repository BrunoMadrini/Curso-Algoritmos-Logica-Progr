//Sua organiza��o acaba de contratar um estagi�rio...

#include <stdio.h>

int main(){

	//Vari�veis
	float cont_total = 0, cont_sit_1 = 0, cont_sit_2 = 0, cont_sit_3 = 0, cont_sit_4 = 0,
			ident, defeito, p1, p2, p3, p4;


	//Entradas
	printf("Informe a identifica��o: ");
	fflush(stdout);
	scanf("%f", &ident);

	while(ident !=0){
		printf("1 - Necessita de esfera\n");
		printf("2 - Necessita de limpeza\n");
		printf("3 - Necessita de troca do cabo ou conector\n");
		printf("4 - Quebrado ou Inutiliz�vel\n");
		printf("Informe o tipo de defeito: \n");
		fflush(stdout);
		scanf("%f", &defeito);

		//Processamento
		if(defeito == 1){
			cont_sit_1 = cont_sit_1 + 1;
		}
		if(defeito == 2){
			cont_sit_2 = cont_sit_2 + 1;
		}
		if(defeito == 3){
			cont_sit_3 = cont_sit_3 + 1;
		}
		if(defeito == 4){
			cont_sit_4 = cont_sit_4 + 1;
		}
		cont_total = cont_total + 1;

		//Entrada novamente
		printf("Informe a identifica��o: \n");
		fflush(stdout);
		scanf("%f", &ident);
	}
	p1 = (cont_sit_1 / cont_total) * 100;
	p2 = (cont_sit_2 / cont_total) * 100;
	p3 = (cont_sit_3 / cont_total) * 100;
	p4 = (cont_sit_4 / cont_total) * 100;

	printf("Quantidade de Mouses: %0.2f\n\n\n", cont_total);
	printf("Situa��o \t\t\t\t\t\tQuantidade \tPercentual\n");
	printf("1 - Necessita de esfera \t\t\t\t%0.2f \t\t%0.2f\n", cont_sit_1, p1);
	printf("2 - Necessita de limpeza \t\t\t\t%0.2f \t\t%0.2f\n", cont_sit_2, p2);
	printf("3 - Necessita de troca do cabo ou conector \t\t%0.2f \t\t%0.2f\n", cont_sit_3, p3);
	printf("4 - Quebrado ou Inutiliz�vel \t\t\t\t%0.2f \t\t%0.2f\n", cont_sit_4, p4);


}
