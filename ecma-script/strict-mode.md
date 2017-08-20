## Strict Mode

O `strict mode` é uma forma de conseguir um comportamento diferente do javascript convencional. 
Com ele é possível fazer coisas que o javascript puro não consegue e que são bem úteis.  
Com o modo strict "ligado" é possível ter em javascript um código mais simples, semântico e seguro.

O javascript esconde muita besteira que o programador faz. Simplismente algo não funciona mas sem nenhum aviso. 
Com o strict mode o javascript tratará essas situações como erro e lançará exceções deixando tudo muito claro.
Algumas más práticas são forçadas como erro. Atribuições que são permitidas mas que não deveriam com o strict mode passam
a ser consideradas erros. Existem muito mais coisas a serem estudadas sobre o assunto.

No fim das contas o strict mode veio para tentar melhorar algumas coisas que não deveriam ter sido concebidas na criação do 
Javascript mas que foram, alem de outros problemas que surgiram com o tempo. É como se deixasse o Javascript melhorado.

O strict mode é na verdade uma preparação das versões atuais do Javascript para a adição dessas novas regras e funcionalidades que serão implementadas em versões futuras.
 


> Cuidado ao usar strict mode em navegadores antigos. Sempre teste o suporte dos navegadores. Bugs acontecerão com o uso do strict mode mas os sistemas que o usam tem que estar preparados para mitigar os problemas.

### Fontes

* https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Strict_mode
* https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Strict_mode/Transitioning_to_strict_mode
