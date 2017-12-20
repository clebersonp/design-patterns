Definicao:
O Decorator surgiu da necessidade de adicionar um comportamento, funcionalidade ou estado extra a um objeto em tempo de execucao, por exemplo quando Heranca nao e concebivel por ser um caso que geraria um numero muito alto de sub-classes.
- Permite adicionar um comportamento a um objeto ja existente em tempo de execucao, ou seja, agrega dinamicamente responsabilidades adicionais a um objeto. Decorators oferecem uma alternativa flexivel ao uso de heranca para estender uma funcionalidade, com isso adiciona-se uma responsabilidade ao objeto e nao a classe.

Motivacao:
- Suponha que existe um objeto Arma, ela pode ter comportamentos diferentes dependendo da municao, dependendo do tipo de mira que tiver, se tiver algum tipo de silenciador ou outro acessorio. Imagine criar agora uma sub classe para cada combinacao possivel de armas, o numero de classes aumenta exponencialmente para cada opcao a mais que voce tiver. E ai que entra o Decorator.

Ex:
- Um exemplo de utilizacao desse padrao seria, por exemplo, um sistema de reserva de passagens no qual o passageiro possa adicionar itens e servicos a sua passagem area ou viaria. Como bagagens extras, cabine com espaco maior e opcoes de refeicao. Uma arvore de natal que recebe a adicao de objetos e luzes que a decoram tambem e um outro exemplo do mundo real no qual aplicar-se-ia o padrao Decorator.
