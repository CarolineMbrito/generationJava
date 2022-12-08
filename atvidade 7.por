programa
{

/*Um sistema de equações lineares do tipo: 

Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. */
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a,b,c,d,E,f,x,y

		escreva("Informe o coeficiente de A: ")
		leia(a)
		escreva("Informe o coeficiente de B: ")
		leia(b)
		escreva("Informe o coeficiente de C: ")
		leia(c)
		escreva("Informe o coeficiente de D: ")
		leia(d)
		escreva("Informe o coeficiente de E: ")
		leia(E)
		escreva("Informe o coeficiente de F: ")
		leia(f)

		x = (c*E)-(b*f)/(a*E)-(b*d)
          y = (a*f)-(c*d)/(a*E)-(b*d)

          escreva("valor de X: ",mat.arredondar(x,2),"\nvalor de Y: ",mat.arredondar(y,2))

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */