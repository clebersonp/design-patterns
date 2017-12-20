Definicao:
- Builder e um padrao de projeto de software criacional que permite a separacao da construcao de um objeto complexo da sua representacao, de forma que o mesmo processo de construcao possa criar diferentes representacoes.

Motivacao:
- Imagine um tipo de objeto complexo com muitos atributos na classe e ter que passar todos os atributos
via parametro do construtor? Ficaria muito dificil de ler e enteder;


Ex: NotaFiscal com milhares de atributos;
- Cria-se um builder para criar uma nota fiscal;
- No builder criamos varios metodos para atender a construcao e inicializacao dos atributos do objeto;
- E criamos um metodo que devolve o objeto criado e inicializado;
- Nos builder usamos o conceito de "interface fluente", facil de ler e entender, criando chamadas aos metodos do
builder de forma encadeada. A cada chamada de um metodo fluente e retornado a instancia do proprio builder, ate
chegar ao metodo que retorna o objeto, que se deseja, criado;