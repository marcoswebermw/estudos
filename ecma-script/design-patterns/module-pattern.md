## Alguns Design Patterns em Javascript

### Module pattern

* Padrão de escrita de módulos em javascript.
* Pode ser uma função anônima invocada imediatamente(IIFE) que retorna um objeto com seus valores e suas funções.
* Ou pode ser uma Closure.
* Usado para fechar o escopo das variáveis.
* Faz com que atributos e funções fiquem como se fossem privados.
* Essa técnica de retornar uma interface pública(Object interface) tem uma variante chamada `Revealing Module Pattern`.

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

## Revealing Module Pattern - Método alternativo
* Exemplo:

```js
let Contar = (function(){

    // Variável local. Não pode ser acessada de fora.
    let contador = 0; 

    // Retorno o valor do contador
    let contar = function() { return contador; };
        
    //  Incrementando o contador.
    let incrementar = function() { return contador += 1; };  


    // Tudo que quiser ser tornado público deve vir dentro do `return` abaixo.
    return {    
        getContador: contar,
        incContador: incrementar
    };
    
}) ();
```

```js
console.log(Contar.getContador()); // 0
Contar.incContador();
console.log(Contar.getContador()); // 1
```

