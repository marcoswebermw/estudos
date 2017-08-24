## This

O lógico seria pensar no `this` como uma espécie de apontador para o escopo no qual se está inserido.  
Mas o `this` no Javascript funciona de forma diferente de outras linguagens. Pode causar muita confusão.    
Também é diferente no modo estrito e o não estrito.  
Ele geralmente se comporta de acordo com a forma que a função é chamada.  


### This no contexto global

Em modo estrito ou não, o this se refere ao objeto global(fora de qualquer função) quando em contexto global.

**Exemplo MDN:**
```js
console.log( this.document === document ); // true

// Em navegadores web, o objeto window é também o objeto global:
console.log( this === window ); // true

this.sistema = 'Linux';
console.log( window.sistema ); // Linux.
```

### This no contexto de uma função
No contexto de uma função o this vai depender da forma que a função for chamada.

**Chamada de forma simples**

```js
function f1() { return this; }

f1() === window; // Objeto global
```

> O this assume como padrão o objeto global. 

O this será o que foi determinado com valor que estava quando entrou no modo estrito. Se era window continuaria com window.
Se for undefined continuará undefined.

**Arrow Functions**  
Em arrow functions o this será o valor definido no contexto de execução atual. 
Se extiver em um contexto global o this será um objeto global.
Nesse caso é muito parecido com o caso das outras linguagens.
O this nesse caso não mudará sendo chamado em outros contextos.

```js
let globalObject = this;
let foo = (() => this);
console.log(foo() === globalObject); // true
```

**Método de um objeto**  
Quando uma função é chamada como um método de um objeto, seu this toma o valor do objeto pertencente ao método chamado.

```js
let objeto = {
  propriedade: 50,
  f: function() {
    return this.propriedade;
  }
};

console.log( objeto.f() ); // 50.
```

**This na cadeia de protótipos (prototype chain) do objeto**

No exemplo abaixo, mesmo a função `f` sendo definida em ´o´, como `f` é chamada como método de `p`, seu this refere-se a `p`.  Este é um recurso interessante de herança prototípica do JavaScript.

```js
let o = { f:function() { return this.a + this.b; } };
let p = Object.create( o );
p.a = 1;
p.b = 4;

console.log( p.f() ); // 5
```

### Fontes:

MDN - https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Operators/this
