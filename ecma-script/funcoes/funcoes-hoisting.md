## Funções Hoisting

* Em Javascript é possível declarar funções depois que elas foram usadas. Esse é o mecanismo de `hoisting`.
* Porém `function expressions` não podem ser hoisted(içadas).  
  
**Exemplo de função hoisting**

```js
minhaFuncao();

function minhaFuncao(){
    console.log('Função criada depois de ser chamada.');
};
```

**Exemplo de function expressions**

```js
minhaFuncao(); // Ainda não existe para o Javascript.

let minhaFuncao = function(){
    console.log('Essa function expression dará erro.'); // TypeError: minhaFuncao is not a function.
};
```
