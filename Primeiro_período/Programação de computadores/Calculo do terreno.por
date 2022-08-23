programa {
	
	funcao inicio() {
		// DECLARAÇÃO DAS VARIÁVEIS
		real frente
		real lateral
		real area
		real Valor_metro_quadrado
		real preco_do_terreno
		logico corretor
		//PROCESSAMENTO
		escreva("Digite o valor da frente: ")
		leia(frente)
		escreva("\n","Digite o valor da lateral: ")
		leia(lateral)
		escreva("\n","Quanto custa o metro quadrado do terreno: ")
		leia(Valor_metro_quadrado)
				
		area = frente * lateral
		preco_do_terreno = area * Valor_metro_quadrado
		
		escreva("\n","O valor da área do terreno é igual a: ",area," metros quadrados")
		escreva("\n","O Preço do terreno é R$",preco_do_terreno," reais")

		se(preco_do_terreno >= 100000){
			escreva("\n","Pagamento com subcidio do governo")
		}senao{
			escreva("\n","Pagamento com PIX")
		}
		escreva("\n","Tem corretor? ")
		leia(corretor)
		
		se(corretor == verdadeiro){
			preco_do_terreno = (preco_do_terreno * 1.1)
		}
		escreva("\n","O Valor final do terreno será R$: ",preco_do_terreno) 
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 856; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */