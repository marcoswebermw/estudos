### Desestruração de objeto

**Atribuição básica**

```js
let carro = { modelo: 'Fusca', cor: 'Amarelo' };
let { modelo, cor } = carro;

console.log( modelo ); // Fusca.
console.log( cor );    // Amarelo.
```

**Atribuição sem declaração**

> Uma variável pode ter seu valor atribuído via desestruturação separadamente da sua declaração.

```js
let x, y;

( { x, y } = { x:1, y:2 } );  // x = 1 e y = 2.
// Os '(' e ')' são obrigatórios quando existe a desestruturação com a declaração separada.


```

**Atribuição para variáveis com novos nomes**

> Exemplo - Atribuindo objetos à determinadas variáves:
```js
let dias = { domingo:1, segunda:2, terca:3, quarta:4, quinta:5, sexta:6, sabado:7 }
let { segunda:s, sexta:sx } = dias; // Atribui "2 à s" e "6 à sx".

console.log( 'Segunda: ' + s );    // 2.
console.log( 'Sexta: ' + sx );     // 6.
```

> Exemplo - Atribuindo objetos à determinadas variáveis de forma curta e direta:
```js
let dias = { domingo:1, segunda:2, terca:3, quarta:4, quinta:5, sexta:6, sabado:7 }
let { segunda, sexta } = dias; // Atribui "2 à segunda" e "6 à sexta" de forma curta e direta.

console.log( 'Segunda: ' + segunda ); // 2.
console.log( 'Sexta: ' + sexta );     // 6.
```

**Valores padrões**

```js
// a recebe um novo valor mas b recebe o valor padrão na falta de um valor passado.
let { a=6, b=3 } = { a: 5 }; // a = 5 e b = 3.
```


### Fontes

Mais informações e exemplos em: 

MDN: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Operators/Atribuicao_via_desestruturacao
