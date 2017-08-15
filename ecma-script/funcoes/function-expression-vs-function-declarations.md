## Function Expression x Function Declarations

---------------------------------------------------------

**Function declarations:**

- Define uma função nomeada sem uma atribuição de variável.
- Não são aninhadas em blocos que não são funções.
- Sempre começam com `function`.

```js
function somar( a, b ) { 
    return a + b 
};
```

---------------------------------------------------------

**Function expression:**

- Define uma função como parte de uma expressão maior.
- Geralmente ela é uma atribuição à variável.
- Elas não devem iniciar com a palavra reservada `function` a não ser que sejam auto-invocadas.
- Podem ser nomeadas ou anônimas.
- 3 exemplos abaixo:

```js
// Function expression com nome.
let somar = function adicao( a, b ) { 
    return a + b; 
}; 

// Function expression anônima.
let somar = function( a, b ) { 
    return a + b; 
}; 

// Função auto-invocada.
( function adicao( a + b ) { 
    return a + b 
}) (); 
```

---------------------------------------------------------

### Outras Informações

* Através do `hoisting` uma função definida por uma `function declaration` pode ser chamada antes de ser definida.
* Uma `declaration function` passa a ser uma `function expression` quando:  
  - Torna-se parte de uma expressão.  
  - Quando é uma declaração aninhada em um script ou função.

**Exemplos tirados do MDN:**

```js
// function declaration.
function foo() {}

// function expression
( function bar() {} )

// function expression
x = function hello() {}


if ( x ) {
   // function expression
   function world() {}
}


// function declaration
function a() {
   // function declaration
   function b() {}
   if ( 0 ) {
      // function expression
      function c() {}
   }
}
```

---------------------------------------
### Fontes

* [MDN - developer.mozilla.org](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Functions?redirectlocale=en-US&redirectslug=JavaScript%2FReference%2FFunctions_and_function_scope)
