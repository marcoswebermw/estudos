## Funções em Javascript(ECMAScript)

### Operador Function

* Funções são subprogramas com um conjunto de instruções internas que podem ou não receber valores(parâmetros). 
Sempre retornam um valor. Podem ser chamadas de diversas partes de um programa. Em Javascript uma função é sempre um objeto do tipo `Function`. E ela é um `objeto` de primeira classe, que significa que ela pode ter propriedades e metodos e pode ser chamada.

* Uma função que não tenha o método return, irá retornar um valor padrão que geralmente é `undefined`. 
Um caso especial é quando uma função é criada com `new` usando o método construtor que nesse caso irá retornar `this`.

* Uma função em Javascript recebe argumentos(parâmetros) por valor, que significa que os valores passados 
se alterados na função não surtirão efeito fora dela, a não ser, se o argumento for uma referência de um objeto. 

**Dica do MDN:**
> A palavra reservada this não se refere a função sendo executada no momento, então você deve referenciar um objeto Function pelo nome, mesmo dentro do corpo da função.

**Exemplo de Função**
```js
function minhaFuncao( parametro1, parametro2 = 'Valor padrão' ) {
    console.log( 'Aqui vem as instruções' );
    return 'Se a instrução "return" for omitida, será devolvido o valor undefined';
}
```

### Arrow Function (ECMAScript 2015 (ES6))

Vem do conceito funcional da linguagem. Tem uma sintaxe curta.

```js
let adicao = ( a, b ) => {
    // Instruções.
}

let potencia =  p  => p * p; // Com um parâmetro não precisa dos parenteses.

let imprime = () => console.log( 'Javascript' ); // Uso sem parâmetros.
```
> A expressão é implicitamente o valor de retorno da função.

### O construtor `Function`

Objetos `Function` podem ser criados com `new` assim como todos os outros objetos em javascript. 
Se um objeto `Function` for criado sem o `new` ele será tratado como se fosse invocado com um construtor comum.

```js
let soma = new Function('valor1', 'valor2', 'return valor1 + valor2;');

console.log( soma( 1, 6 ) );
```

> O método do construtor `new Function()` é mais lento que os outros métodos de criação de funções. Portanto deve ser evitado.

ver mais em: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Object/constructor


#### Use `typeof` para verificar se uma função existe ou se ela existe em algum objeto
```js
if ('function' == typeof window.funcao) {
    // Faça alguma coisa caso ela exista
}
```

---------------------------------------
### Fontes

* [MDN - developer.mozilla.org](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Functions?redirectlocale=en-US&redirectslug=JavaScript%2FReference%2FFunctions_and_function_scope)


ver mais em: 
* https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Function
* https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Guide/Funções
