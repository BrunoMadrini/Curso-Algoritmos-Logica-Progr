//A secretaria do Meio Ambiente que controla....

#include <stdio.h>

int main(){

	//Vari�veis
	float ind_poluicao;

	//Entrada
	printf("Informe o �ndice de polui��o: ");
	fflush(stdout);
	scanf("%f", &ind_poluicao);

	//Processamento
	if (ind_poluicao >= 0.3 && ind_poluicao < 0.4){
		printf("As empresas do 1� grupo devem suspender suas atividades temporariamente");
	}
	if(ind_poluicao >= 0.4 && ind_poluicao < 0.5){
		printf("As empresas do 1� e 2� grupo devem suspender suas atividades temporariamente");
	}
	if(ind_poluicao >= 0.5){
		printf("Todas as empresas devem suspender suas atividades temporariamente");
	}
	if(ind_poluicao <= 0.3){
		printf("O n�vel de polui��o est� dentro do limite, nenhuma empresa deve suspender suas atividades");
	}
}
