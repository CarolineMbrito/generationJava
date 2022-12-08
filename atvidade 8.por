programa
{
	inclua biblioteca Matematica --> mat
	

   /*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
   (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
   escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. */
	
	funcao inicio()
	{
		real soma,custoF,porcentagD,impostos

		escreva ("Custo de fabrica: ")
		leia (custoF)

	     porcentagD = ((custoF/100)*28)
	     impostos = ((custoF/100)*45)
	     soma = ((porcentagD + impostos)+custoF)
	    

		escreva ("custo do carro novo: "+soma+"\ncusto % destri: "+mat.arredondar(porcentagD,2)+"\n custo % impos: "+mat.arredondar(impostos,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 767; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */