Definicao:
- O Padrao Template Method define o esqueleto de um algoritmo dentro de um metodo, transferindo alguns de seus passos para as subclasses; 
- O Template Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do proprio algoritmo;
- O algoritmo principal fica na super classe, e alguns passos que podem ser mais especificos serao implementados
pelas subclasses;
- Portanto, o padrao Template Method basicamente oferece um metodo que define um algoritmo (uma sequencia de passos) que pode, por sua vez, ser definido como abstrato para posteriormente ser implementado por uma subclasse. Pode-se notar que a estrutura do algoritmo fica inalterada mesmo com as subclasses fazendo parte da implementacao.

- Propósito
	- Esqueleto de um algoritmo em uma operacao
	- Delega alguns passos as subclasses
	- Redefinicao de alguns passos de um algoritmo sem alterar a estrutura do algoritmo
- Aplicabilidade
	- Implementar partes invariantes de um algoritmo
	- Deixar as subclasses implementar as partes que variam
	- Comportamento comum entre subclasses deve ser fatorado e agrupado em uma classe comum
	- Evitar replicacao de codigo
	- Controlar extensoes das subclasses

Motivacao:
- Imagine criar os mesmos metodos para cada classe concreta, estariamos duplicando codigo;
- Criar varias classe com metodos com estruturas semelhantes, mas sem utilizar o polimorfismo. 
Se alterar um metodo de uma determinada classe tem que lembrar de alterar nas outras;
- Codigo fica dificil de mantem com o crescimento;

Ex: Treino
- Cria-se uma classe abstrata "Treino" que tera o metodo com o algoritmo base(concreto) e outros metodos
abstratos que serao utilizados pelo algoritmo base e serao implementados pelas classes concretas;
- As classes concretas herdam da super classe e precisam implementar os metodos abstratos;
- Quando invocar o metodo base a partir de qualquer classe concreta, ele sabera de qual objetos devera
invocar os metodos abstratos que sao utilizados pelo metodo base;