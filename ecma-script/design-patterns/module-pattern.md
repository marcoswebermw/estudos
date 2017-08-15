## Alguns Design Patterns em Javascript

### Module pattern

* Padrão de escrita de módulos em javascript.
* Pode ser uma função anônima invocada imediatamente(IIFE) que retorna um objeto com seus valores e suas funções.
* Ou pode ser uma Closure.
* Usado para fechar o escopo das variáveis.
* Faz com que atributos e funções fiquem como se fossem privados.
* A técnica de retornar uma interface pública pode também ser chamada de `Revealing Module Pattern`.

> Sintaxe:

```js

( function() {
    // Código vem aqui.
}) (); // Função executada imediatamente.


```

* Exemplo:

```js
let Contar = (function(){

    // Variável local. Não pode ser acessada de fora.
    let contador = 0; 

    return {    
    
        // O contador só é retornado por aqui. Encapsulamento.
        contador: function() { return contador; },
        
        //  Incrementando o contador. Ele somente pode ser incrementado por aqui.
        incrementar: function() { return contador += 1; }        
        
    };
    
}) ();
```

```js
console.log(Contar.contador()); // 0
Contar.incrementar();
console.log(Contar.contador()); // 1
```

-----------------------------------------
