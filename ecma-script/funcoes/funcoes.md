## Funções em Javascript(ECMAScript)

### Operador Function

```js
function minhaFuncao(parametro1, parametro2 = 'Valor padrão'){
    console.log('Aqui vem as instruções');
    return 'Se a instrução "return" for omitida, será devolvido o valor undefined';
}
```

### Arrow Function

### O construtor `Function`

### Parâmetros de Função

* **Parâmetros Default**
* **Parâmetros Rest**

### O objeto arguments

### Function constructor
- O método do construtor `new Function()` é mais lento que os outros. Portanto deve ser evitado.

#### Use `typeof` para verificar se uma função existe ou se ela existe em algum objeto
```js
if ('function' == typeof window.funcao) {
    // Faça alguma coisa caso ela exista
}
```

---------------------------------------
### Fontes

* [MDN - developer.mozilla.org](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Functions?redirectlocale=en-US&redirectslug=JavaScript%2FReference%2FFunctions_and_function_scope)
