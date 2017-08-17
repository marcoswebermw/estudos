## Map

* É usado quando queremos executar uma função em todos os elementos de um determinado array.
* Ela vai devolver um novo array como resultado da operação do método `map()`.
* É uma forma `funcional` de se iterar um array.

## Passo-a-passo do uso do map

1. O método map() é invocado à partir de um array. 

```js 
array.map()
```

2. O map() recebe uma função callback passada como argumento para ele.

```js
array.map( funcao_callback( item ) {} )
```

3. A função de callback é executada para cada **item** do array e devolve um array como resultado.

```js
var colecao = itens.map( function( item ) {
    return item.valor;
});
```
> Irá retornar um array com os valores dos itens.

-----------------------------------

## Exemplo prático


* ***Array usado nos exemplos abaixo:***

```js
let filmes = [
         {nome: 'Matrix', ano: 1999,} 
       , {nome: 'Blade Runner', ano: 1982} 
       , {nome: 'Star Wars', ano: 1977}
       , {nome: 'Back to the Future', ano: 1985}
      ];
```


* ***Exemplo construído sem o map.***

```js

let filmografia = []

for ( let i = 0; i < filmes.length; i++ ) {
    filmografia.push( filmes[i].nome );
}

console.log( filmografia );
```



* ***O mesmo exemplo com o map.***

```js

let filmografia = filmes.map( function( filme ) {
    return filme.nome;
});

console.log( filmografia );
```

* ***Ambos retornam um array com os filmes:***

`[ 'Matrix', 'Blade Runner', 'Star Wars', 'Back to the Future' ]`



-----------------------------------------

## Usando Arrow Functions


```js

let filmografia = filmes.map( ( filme ) => { return filme.nome } )

console.log( filmografia );
```

Algumas fontes:

* [MDN](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array/map)

> Existem mais coisas possíveis de se fazer com o `map()`.
