#!/usr/bin/env python
# coding: utf-8

# In[ ]:





# In[6]:


# Criar lista de pontos
Pontos_cartesianos_X = []
Pontos_cartesianos_Y = []
count = 0
# Usando o Input() vamos coletar do usuário qual o ponto a ser adicionado:
ponto = float(input('Insira um ponto para X: '))
Pontos_cartesianos_X.append(ponto)
ponto = float(input('Insira um ponto para Y: '))
Pontos_cartesianos_Y.append(ponto)
print ('Deseja adicionar outro ponto? ')
count = count + 1
resposta = int(input('1 - sim, 2-nao : '))
if(resposta == 1):
    while (resposta == 1):
        ponto = float(input('Insira um ponto X: '))
        Pontos_cartesianos_X.append(ponto)
        ponto = float(input('Insira um ponto Y: '))
        count = count + 1
        Pontos_cartesianos_Y.append(ponto)
        print ('Deseja adicionar outro ponto? ')
        resposta = int(input('1 - sim, 2-nao : '))
    print('X = ',Pontos_cartesianos_X)
    print('Y = ',Pontos_cartesianos_Y)
else:
    print('X = ',Pontos_cartesianos_X)
    print('Y = ',Pontos_cartesianos_Y)

print('Temos',count, 'pontos para cada posição')

if (count == 1):
    print('Ponto')
    resultados=[]
    for i in range(1):
        tupla = (Pontos_cartesianos_X[i],Pontos_cartesianos_Y[i])
        resultados.append(tupla)
    print(resultados)
    if (Pontos_cartesianos_X[i] >= 2 and Pontos_cartesianos_X[i] <= 4):
        if (Pontos_cartesianos_Y[i] >= 2 and Pontos_cartesianos_Y[i] <= 4):
            print('Dentro do poligono')
        else:
            print('Fora do poligono')
    else:
        print('Fora do poligono')
else:
    if(count == 2):
        print('Reta')
        resultados=[]
        for i in range(2):
            tupla = (Pontos_cartesianos_X[i],Pontos_cartesianos_Y[i])
            resultados.append(tupla)
        print(resultados)
    elif(count >=3):
        print('Poligono')
        resultados=[]
        for i in range(3):
            tupla = (Pontos_cartesianos_X[i],Pontos_cartesianos_Y[i])
            resultados.append(tupla)
        print(resultados)


# In[ ]:


resultados=[]
for i in range(3):
   tupla = (Pontos_cartesianos_X[i],Pontos_cartesianos_Y[i])
   resultados.append(tupla)
print(resultados)


# In[ ]:


if (Pontos_cartesianos_X[i] >= 2 and Pontos_cartesianos_X[i] <= 4):
    if (Pontos_cartesianos_Y[i] >= 2 and Pontos_cartesianos_Y[i] <= 4):
        print('Dentro do poligono')
    else:
        print('Fora do poligono')
else:
    print('Fora do poligono')


# In[ ]:





# In[ ]:





# In[ ]:




