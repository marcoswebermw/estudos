## Módulos

### Export vs Module.exports

No node.js usamos o `export` e o `module.exports` para exportar um módulo(arquivo) para que esse possa ser usado em outro script.
Ambos apontam para a a mesma referência(objeto), ou seja, uma propriedade alterada em um será refletida no outro.

**O código abaixo mostrando que ambas referências apontam para o mesmo lugar.**

```js
module.exports.linguagem = 'Javascript';
    
console.log( exports.linguagem ); // 'Javascript'
```

A diferença ocorre quando altaremos não uma propriedade, mas a referencia de um deles. 
A partir daí se quiser exportar um módulo deve-se usar sempre o `module.exports` 
que vai ser de onde o `require` carregará o módulo.

**Veja o exemplo:**
```js
// linguagens.js

console.log( module.exports == exports ); // O resultado é True.
    
module.exports = 'Javascript';
exports = 'EcmaScript';

```
**Agora o importando:**
```js
let linguagem = require( './linguagens.js' );
    
console.log( linguagem ); // O resultado é 'Javascript' pois foi ele quem foi exportado pelo module.exports.
```

### Require

Como visto no exemplo acima, no Node.js, para importar um módulo é usado o `require`.

```js
let meu_modulo = require( '../nome-do-modulo' );
```

### Uso do `exports`
O `exports` é usado quando queremos adicionar a exportação elemento por elemento.

```js
// operacões.js
exports.soma = function( a, b ){
    return a + b;
}

exports.subtracao = function( a, b ){
    return a - b;
}
```
```js
let operacoes = require( './operacoes.js' );

console.log( 'A soma é: ' + operacoes.soma( 5, 4 ) ); // A soma é 9.
```


### Uso do `module.exports`

O `module.exports` é usado para exportar o módulo de uma única vez.


**Ele pode ser criado para ser usado como uma única função:**
```js
// operacoes.js
module.exports = function( valorA, valorB ) {
    return {
        soma: function() {
            return valorA + valorB;
        },
        subtracao: function() {
            return valorA - valorB;
        }
    };
}
```
```js
let operacoes = require( './operacoes.js' );
let operador = operacoes( 3, 2 ); // Unica atribuição para todas as operações.

console.log( operador.soma() ); // O resultado será 5.
console.log( operador.subtracao() ); // O resultado será 1.
```
**Ou pode ser usado para exportar um objeto completo de uma vez:**

```js
// operacoes.js
module.exports = {
    soma: function( valorA , valorB ) {
        return valorA + valorB;
    },
    subtracao: function( valorA , valorB ) {
        return valorA - valorB;
    }    
};
```
```js
let operacoes = require('./operacoes.js');

console.log( operacoes.soma( 3, 2 ) ); // O resultado será 5.
console.log( operacoes.subtracao( 3, 2 ) ); // O resultado será 1.
```

> Ainda existe a forma de exportar módulos do es6. Com import e export.


### Referências

* https://www.sitepoint.com/understanding-module-exports-exports-node-js/
* http://www.devfuria.com.br/javascript/node.js/modulos/
* https://pt.stackoverflow.com/questions/55084/quando-usar-module-exports-ou-exports-no-node-js

