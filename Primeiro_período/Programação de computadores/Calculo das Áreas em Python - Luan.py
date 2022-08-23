#!/usr/bin/env python
# coding: utf-8

# # 1°) CALCULO DAS ÁREAS DAS FIGURAS GEOMÉTRICAS

# In[ ]:


# Área do triângulo

b = float(input("Digite o valor da base do triângulo em metros: "))
h = float(input("Digite o valor da altura do triângulo em metros: "))
int = 2
A = (b*h)/2
print ("O valor dá área será: {} m²". format(A))


# In[ ]:


# Área do Retangulo:

b = float(input("Digite o valor da base do retângulo em metros: "))
h = float(input("Digite o valor da altura do retÂngulo em metros: "))

A = b*h

print("O valor da área do Retângulo será: {} m²".format(A))


# In[ ]:


# Área do Quadrado

b = float(input("Digite o valor em metros do lado do quadrado: "))
 
A = b*b

print("O valor da área do quadrado será: {} m²".format(A))


# In[ ]:


# Área do Trapézio

B = float(input("Digite o valor em metros da base maior: "))
b = float(input("Digite o valor em metros da base menor "))
h = float(input("Digite o valor em metros da altura: "))
int = 2

A = (((B*b)*h)/2)

print("O valor da área do Trapézio será: {} m²".format(A))


# In[ ]:


# Área do Losango

D = float(input("Digite o valor em metros da diagonal maior: "))
d = float(input("Digite o valor em metros da diagonal menor: "))
int = 2

A = ((D*d)/2)

print("O valor da área do Losango será: {} m²".format(A))


# In[ ]:


# Área do Circulo

pi = 3.14
r = float(input("Digite o valor em metros do raio: "))

A = pi*(r*r)

print("O valor da ára do círculo será: {} m²".format(A))


# # 2°) Programa em que o usuário informe uma palavra

# In[ ]:


str = input("Digite uma palavra: ")

# A palavra digitada;
print (str)

# A primeira metade da palavra (do inicio até a metade);

tamanho_str = len(str)

print (str[0:tamanho_str//2])

#A segunda metade da palavra (da metade até o final);
print (str[(tamanho_str//2)+1:])

#O sufixo da palavra a partir do segundo caracter
print (str[1:])

#A palavra duplicada e triplicada (exemplo: abacaxiabacaxi)
print (str * 2)
print (str * 3)

#A concatenação entre a sua palavra e o seu nome

print (str + " LUAN")


# In[ ]:





# In[ ]:




