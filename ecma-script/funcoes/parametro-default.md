## Parâmetros Default (ECMAScript 2015 (ES6))

Se nenhum parâmetro ou `undefined`for passado em um lugar que necessita de um, será usado um valor padrão.
Em Javascript `undefined` é o valor padrão dos parâmetros.
Funções também podem ser usadas como parâmetros defaults.

```js
function soma( a, b = 0 ) {
    return a + b;
}
```
```js
soma( 2, 3 ); // 5.
soma( 6 ); // 6.
soma( undefined, 9 ); // 9.
```
> Apesar de possível nunca passe `undefined`. Deixe isso para a linguagem, caso contrário podem ocorrer efeitos colaterais.
