programa
{
	
	funcao inicio()
	{
		real valor_da_compra
		real valor_final
		
		cadeia forma_de_pagamento

		escreva("Digite o valor da compra: ")
		leia(valor_da_compra)
		escreva("Digite a forma de pagamento: ")
		leia(forma_de_pagamento)

		se(forma_de_pagamento == "cartao"){
			valor_final = valor_da_compra * 1.1
			escreva("\n","O valor final da compra é: ",valor_final)
		}
		senao{
			valor_final = valor_da_compra
			escreva("\n","O valor final da compra é: ",valor_final,". Pagamento via PIX")
			}

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 132; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */