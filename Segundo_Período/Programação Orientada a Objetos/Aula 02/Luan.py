
qtdPessoas = 0 #Dado Inteiro
somaSalarios = 0.0 #Pois é um dado Float
somaFilhos = 0 #Pois é um dado inteiro
qtdPessoasBaxoSalario = 0
maiorSalario = 0.0
menorSalario = 0.0
nomeMaiorSalario = ""
nomeMenorSalario = ""

while(True): #loop infinito
    nome = input("Digite seu nome: ")
    salario = float(input("Digite o salário? "))
    if (salario < 0):
        print("Salário NEGATIVO, encerrado!!")
        break
    qtdFilhos = int(input("Digite a quantidade de filhos: "))
    if (qtdPessoas == 0):
        maiorSalario = salario
        menorSalario = salario
        nomeMaiorSalario = nome
        nomeMenorSalario = nome

    qtdPessoas += 1
    somaSalarios += salario
    somaFilhos += qtdFilhos

    if (salario <= 1500):
        qtdPessoasBaxoSalario += 1

    if(salario > maiorSalario):
        maiorSalario = salario
        nomeMaiorSalario = nome
    if(salario < menorSalario):
        menorSalario = salario
        nomeMenorSalario = nome

mediaSalarios = somaSalarios / qtdPessoas
print("A média dos salários é: ",mediaSalarios)
mediaFilhos = somaFilhos / qtdPessoas
print("A média da quantidade de filhos é: ",mediaFilhos)
porcentagemBaixoSalario = (qtdPessoasBaxoSalario * 100) / qtdPessoas
print("A porcentagem é: ", porcentagemBaixoSalario)
print("O mais rico é: ",  nomeMaiorSalario, "e o mais pobre é: ", nomeMenorSalario)