Definicao:

- O padrao state permite que um objeto altere o seu comportamento quando o seu estado interno muda. O objeto parecera ter mudado de classe.
- O padrao encapsula os estados em classes separadas e delega as tarefas para o objeto que representa o estado atual, nos sabemos que os comportamentos mudam juntamento com o estado interno.
- Sempre que uma solicitacao() e feita ao contexto, ela e delegada ao estado apropriado para ser processado


Ex: 

- Vamos imaginar um cenario, vamos imaginar uma conta corrente bem simples com opcao de depositar e sacar dinheiro e ja imaginamos os estado que essa conta pode estar saldoPositivo, saldoNegativo e bloqueado.
