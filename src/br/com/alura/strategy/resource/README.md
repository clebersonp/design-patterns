Definicao:

- Define uma família de algoritmos, encapsula cada um deles, e torna a escolha de qual usar flexível. O Strategy desacopla os algoritmos dos clientes que os usa.

- Quando se necessita de um algoritmo de estrutura comum mas que trata de modos diferentes os dados submetidos a ele:


Motivacao para usar o design pattern strategy:

1 - Precisa criar muitos condicionais para poder executar uma acao;
2 - Geralmente essa acao a ser executada e comum entre todos os comportamentos;
3 - Pode existir muitos metodos com mesma estrutura mas comportamentos diferentes;
4 - A cada nova regra sera acrescido de mais um if ou metodo e a classe nao para de crescer;

Ex: Impostos:
- Todo imposto sabe calcular o valor do imposta a pagar, pois cada imposto tem seu percentual de tributacao;
- O que os impostos tem em comum? Todos sabem como "calcularImposto";
- Criar uma interface que tenha esse comportamento comum entre todos os impostos - "calcularImposto";
- Fazer com que todos os impostos assinem um contrato com essa interface, para que todos tenham os mesmos comportamento;
- Criar uma classe que recebera essa "Estrategia", ou seja, que receba um imposto qualquer(Interface) e delegue sua execucao para a classe concreta do imposto;
- Ao invocar essa classe que recebe uma "Estrategia" de imposto, devemos passar o imposto concreto e seu orcamento
via parametro;