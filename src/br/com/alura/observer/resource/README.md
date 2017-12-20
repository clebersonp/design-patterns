Definicao:
- O padrao Observer funciona como assinaturas de jornais e revistas, ou seja, temos uma editora que publica as edicoes e pessoas que assinam os jornais ou revistas dessa editora e sempre recebem as novas edicoes assim que elas sao publicadas. Enquanto a pessoa e assinante ela continua recebendo as edicoes na sua casa. Se a pessoa cancelar a assinatura do jornal ou da revista ela para de receber as edicoes.

- O padrao Observer funciona da mesma forma, no entanto, tem-se que a editora (que publica) e o chamado SUBJECT no Padrao Observer e os assinantes (que recebem as novas publicacoes) sao os chamados OBSERVER.

- Os OBSERVERs registram-se no SUBJECT para receber atualizacoes quando os dados do SUBJECT sao alterados. Os OBSERVERs tambem podem cancelar o seu registro e dessa forma nao receber mais nenhuma atualizacao do SUBJECT.

- Observer é utilizado quando se precisa manter os objetos atualizados quando algo importante ocorre.

Motivacao:
- Apos executar uma acao precisamos executar outras milhares de acoes (Observers);
- Dependencia de um-para-muitos entre objetos; 
- Quando um objeto muda de estado, todos seus dependentes sao notificados e atualizados automaticamente;
- Abstracao tem dois aspectos, um dependente do outro;
- Encapsular estes aspectos em objetos separados permite variacao e reuso independentemente;
- Mudanca em um objeto requer alterar outros;
- Nao se sabe quantos objetos precisam ser alterados;
- Objeto capaz de notificar outros objetos sem presumir quem sao esses objetos;
