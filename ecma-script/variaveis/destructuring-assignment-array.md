
### Desestruturação de array

**Atribuição básica de variável**

```js
let x = [ 1, 2, 3, 4, 5 ];
let [ y, z ] = x;

console.log( y ); // 1
console.log( z ); // 2
```

**Atribuição separada da declaração**
```js
let a, b;

[ a, b ] = [ 1, 2 ]; // a = 1 e b = 2. 
```
**Valores padrões**
```js
let a, b;

[ a=5, b=7 ] = [ 1 ]; // a = 1 e b = 7. b receberia undefined por isso pegou o valor padrão.

console.log(a); // 1
console.log(b); // 7
```
**Trocando variáveis**
```js
let a = 1;
let b = 3;

[ a, b ] = [ b, a ]; // a = 3 e b = 1. Não foi necessária uma variável temporária.
```
**Ignorando alguns valores retornados**
```js
function f() {
    return [ 1, 2, 3 ];
}

let [ a, , b ] = f(); // a = 1 e b = 3. O valor '2' foi ignorado.
```
Para ignorar todos os valores retornados use: `[,,] = f();`

**Atribuindo o resto de um array para uma variável**
```js
let [ a, ...b ] = [ 1, 2, 3 ]; // a = 1 e b = [2, 3].
```


### Fontes

Mais informações e exemplos em: 

MDN: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Operators/Atribuicao_via_desestruturacao
