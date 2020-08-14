//A secretaria do Meio Ambiente que controla....

#include <stdio.h>

int main(){

	//Variáveis
	float ind_poluicao;

	//Entrada
	printf("Informe o índice de poluição: ");
	fflush(stdout);
	scanf("%f", &ind_poluicao);

	//Processamento
	if (ind_poluicao >= 0.3 && ind_poluicao < 0.4){
		printf("As empresas do 1º grupo devem suspender suas atividades temporariamente");
	}
	if(ind_poluicao >= 0.4 && ind_poluicao < 0.5){
		printf("As empresas do 1º e 2º grupo devem suspender suas atividades temporariamente");
	}
	if(ind_poluicao >= 0.5){
		printf("Todas as empresas devem suspender suas atividades temporariamente");
	}
	if(ind_poluicao <= 0.3){
		printf("O nível de poluição está dentro do limite, nenhuma empresa deve suspender suas atividades");
	}
}
