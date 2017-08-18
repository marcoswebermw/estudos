## Closures

É criada quando uma função interna é diponibilizada para um escopo fora da função externa.

* É um dos recursos mais poderosos do Javascript.
* Permite a criação de funções aninhadas. Ou seja, funções (externas) podem ter funções internas.
* A função externa não tem acesso às variáveis e funções definidas na função interna.
* A função interna tem acesso total às variáveis e funções da função externa, e de todas variáveis e funções que a última tem acesso.


**Vantagens**
* As variáveis da função interna ficam mais seguras. É quase um encapsulamento.

**Desvantagens**
* Se uma função interna define uma variável com o mesmo identificador de uma variável de escopo externo, 
não será possível acessar a variável externa novamente.

> Dica MDN:  A palavra reservada this é muito complicada em closures.  Elas têm de ser usadas com muito cuidado, 
como ao que this se refere depende completamente de onde a função foi chamada, ao invés de onde ela foi definida.

**Exemplo**
```js
let novoUsuario = function( nome ) {
    let idade;
    
    return {                                // Retorna uma objeto interno. Closure(Fechamento).
        
        setNome: function( novoNome ) {
            nome = novoNome;                // Atribui novoNome ao argumento nome passado no construtor.
        },
    
        getNome: function() {
            return nome;                   
        },
    
        setIdade: function( novaIdade ) {
            idade = novaIdade;              // Atribui novaIdade a variavel da funcao externa idade.
        }
    }
}


let usuario = novoUsuario("Jon Snow");

usuario.getNome();                          // Jon Snow
usuario.setIdade(32);
```


### Fontes:

* MDN - https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Guide/Funções
