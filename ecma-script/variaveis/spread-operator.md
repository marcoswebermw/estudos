## Spread Operator - Operador de expansão

O spread operator índica um elemento que represente uma coleção de elementos que pode ser usado no lugar dessa coleção só que de
forma mais simples.  

O spread operator é usado onde são esperados vários parâmetros como é o caso de uma função ou em vários elementos de um array.

**Exemplos**

```js
funcaoQualquer( ...objIteravel ); // Na hora de chamar funções.
```

```js
let objetoIteravel = [ 1, 2, 3 ];

// A array vai ser: 1, 2, 3, 4, 5, 6.
[ ...objetoIteravel, 4, 5, 6 ]  // Em array literais.
```

```js
// As variáveis vão ficar: a = 1, b= 2, objIteravel = [ 3, 4, 5 ].
[ a, b, ...objIteravel ] = [ 1, 2, 3, 4, 5 ]; // Em uma desestruturação(destructuring assignment).
```

**Exemplo em uma função soma:**
```js
function soma( a, b ) {
    return a + b;
};

let valores = [ 5, 4 ];

soma( ...valores );
```

**Adicionando um array no final do outro de forma simples**

```js
let cesta = [ 'Melão', 'Mamão', 'Melancia' ];
let novasFrutas = [ 'Uva', 'Maçã', 'Morango' ];

cesta.push( ...novasFrutas );
// cesta == [ 'Melão', 'Mamão', 'Melancia', 'Uva', 'Maçã', 'Morango' ];

```

> Qualquer argumento na lista de argumentos pode usar a sintaxe spread e pode ser usado várias vezes.


### Fontes

MDN - https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Operators/Spread_operator
