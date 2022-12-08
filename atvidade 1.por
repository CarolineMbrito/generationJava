programa
{

 /*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */
	
	funcao inicio()
	{
		inteiro ano, mes, dia, somadias
		escreva("Anos de vida: ")
		leia(ano)
		escreva("Mes de nascimento: ")
		leia(mes)
		escreva("Dia de nascimento: ")
		leia(dia)
		somadias = (((mes*31)+dia)+(ano*365))
		escreva ("total de dias: ",somadias)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */