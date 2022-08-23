programa{
	funcao inicio() {
		//Calculo da área do triângulo
		escreva("Calcular a área e perímetro do TRIÂNGULO")
		real b
		real h
		real A
		real l
		real P
		const real n = 2
		escreva("\n","Digite o valor da base: ")
		leia(b)
		escreva("Digite o valor da altura: ")
		leia(h)
		escreva("Digite o valor do lado: ")
		leia(l)
		A = ((b*h)/n)
		escreva("A área do triângulo é igual a: ",A)
		P = ((l*l)+b)
		escreva("\n","O perímetro do triângulo é igual a: ",P)			
	
		escreva("\n \n","Calcular a área e o perímetro do RETÂNGULO")
		real b1
		real h1
		real A1
		real P1
		escreva("\n","Digite o valor da base: ")
		leia(b1)
		escreva("Digite o valor da altura: ")
		leia(h1)
		A1 = (b1*h1)
		escreva("A área do Retângulo é igual a: ",A1)
		P1 = (h1+h1+b1+b1)
		escreva("\n","O perímetro do Retângulo é igual a: ",P1)

		escreva("\n \n","Calcular a área e o perímetro do QUADRADO")
		real l2
		real A2
		real P2
		escreva("\n","Digite o valor do lado: ")
		leia(l2)
		A2 = (l2*l2)
		escreva("A área do quadrado é igual a: ",A2)
		P2 = (l2+l2+l2+l2)
		escreva("\n","O perímetro do quadrado é igual a: ",P2)

		escreva("\n \n","Calcular a área e o perímetro do TRAPÉZIO")
		real B3
		real b3
		real h3
		real l3
		real A3
		real P3
		const real n3 = 2
		escreva("\n","Digite o valor da base maior: ")
		leia(B3)
		escreva("Digite o valor da base menor: ")
		leia(b3)
		escreva("Digite o valor da altura: ")
		leia(h3)
		escreva("Digite o valor do lado: ")
		leia(l3)
		A3 = (((B3+b3)*h3)/n3)
		escreva("A área do trapézio é igual a: ",A3)
		P3 = (B3+b3+l3+l3)
		escreva("\n","O perímetro do trapézio é igual a: ",P3)

		escreva("\n \n","Calcular a área do LOSANGO")
		real D4
		real d4
		real l4
		real A4
		real P4
		const real n4 = 2
		escreva("\n","Digite o valor da diagonal maior: ")
		leia(D4)
		escreva("Digite o valor da diagonal menor: ")
		leia(d4)
		escreva("Digite o valor do lado: ")
		leia(l4)
		A4 = ((D4*d4)/n4)
		escreva("A área do Losango é igual a: ",A4)
		P4 = (l4+l4+l4+l4)
		escreva("\n","O perímetro do losango é igual a: ",P4)

		escreva("\n \n","Calcular a área do CIRCULO")
		real r5
		real A5
		real P5
		const real pi = 3.14
		const real n5 = 2
		escreva("\n","Digite o valor do raio: ")
		leia(r5)
		A5 = (pi*(r5*r5))
		escreva("A área do Circulo é igual a: ",A5)
		P5 = n5*pi*r5
		escreva("\n","O Perímetro do Circulo é igual a: ",P5)
	
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */