## Parâmetros Rest(ECMAScript 2015 (ES6))

* Sendo o `último` argumento de uma função for antecedido pelo prefixo `...` ele será um `rest parameter`. Isso significa 
que ele se tornará um `array` e poderá conter quantos elementos forem necessários.  

* Ele é diferente de `arguments`. 
Na verdade foi escrito para fazer a mesma coisa que `arguments` mas com código reduzido. 
Além disso ele pode usar todos os métodos de um array o que o `arguments` não pode fazer sem conversão para array.

```js
function imprimir( ...valores ) {
    valores.forEach( ( valor ) => {
        console.log(valor);
    } );
};


imprimir( 4, 5, 9 );
```


Fonte:

* MDN - https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Functions/rest_parameters
