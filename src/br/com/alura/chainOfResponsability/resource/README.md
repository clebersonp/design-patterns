Definicao:

- Quando temos diversas regras e essas regras devem ser executadas em uma determinada sequencia, ou seja,
quanda a primeira regra nao for atendida entao a proxima sera chamada;

- Independente da regra que for executada, existe uma estrutura em comum e a unica coisa que varia e o
comportamente entre elas;

- E um padrao que utiliza a ideia de baixo acoplamento por permitir que outros objetos da cadeia tenham a oportunidade de tratar uma solicitacao;


Motivacao:

- Existem varias regras que devem ser executada em uma determinada ordem, e cria-se diversos if condicionais
para verificar qual e a regra que deve ser executada;
- A classe cresce a cada nova regra que e incluida no condicional;
- Dificil manutencao por conta da quantidade grande de condicionais;

Ex: Descontos de uma compra de supermercado;
- Cria-se uma interface para isolar os tipos de descontos(regra de desconto) concretos com uma assinatura
em comum que e "calcularDesconto";
- Cria-se um metodo na interface para configurar quem sera o proximo desconto a ser executado, forcando com que
as classes concretas implementem os metodos;
- Cria-se as classes de desconto concretas, implementando a interface de desconto;
- Cria-se uma classe com um metodo para calcular o desconto passando somente a fatura, ou orcamento. E nesse metodo
sera criado as regras de descontos e sera configurada a ordem de execucao das regras;
- Cada regra de desconto sabera calcular o desconto, e quando a condicao nao for atendida ele sabera invocar
o proximo desconto, e assim por diante. Por isso o nome de "chain of responsibility", ou seja,
corrente de responsabilidades;

- A base mantem um ponteiro como "proximo";
- Cada classe concreta implementa sua propria implementacao para manusear o pedido (request);
- Se o pedido precisa ser passado para outra classe, entao a classe concreta "chama de volta" a classe padrao, delegando um novo ponteiro;
- O cliente (terceirizado ou nao) cria e encadeia a cadeia, a qual pode incluir uma ligacao do ultimo no ate o no da raiz;
- O cliente lanca e deixa cada request com a raiz da cadeia;
- As delegacoes recursivas produzem um efeito de ilusao;