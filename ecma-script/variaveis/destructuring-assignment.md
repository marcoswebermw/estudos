## Atribuição via desestruturação (destructuring assignment)

A atribuição via desestruturação é apenas uma sintaxe.  
É uma sintaxe de expressão Javascript.  
Faz com que seja possível passar valores que estão dentro de arrays e objetos para dentro de variáveis separadas.  



**Exemplo - Atribuindo via array:**

```js
let carro, cor;

[ carro, cor ] = [ 'Corvette', 'Preto' ]; // carro = Corvette e cor = Preto.

```

**Exemplo - Atribuindo com destructuring via spread operator:**

```js
let [ triangulo, quadrado, ...outros ] = [ 3, 4, 5, 6, 7 ];
// triangulo = 3, quadrado = 4, outros = [ 5, 6, 7 ];
```




**Exemplo - (ES2016) Atribuindo com destructuring via spread operator:**

```js
({a, b, ...rest} = {a:1, b:2, c:3, d:4});

console.log(a);       // 1.
console.log(b);       // 2.
console.log(rest.c);  // 3.
console.log(rest.d);  // 4.

```



### Fontes

Mais informações e exemplos em: 

MDN: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Operators/Atribuicao_via_desestruturacao
