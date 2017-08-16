## O Objeto Arguments

É muito usado quando é necessário passar vários argumentos para uma função mas não é possível da forma tradicional, 
pois a interface da função não prevê a passagem de parâmetros ou o número de parâmetros na assinatura da função não é suficiente.

* É parecido com um array que contém os argumentos passados à função.  
* Dentro das funções é possível acessar `arguments` e obter informações de cada parâmetro passado.  
* O `arguments` só possue a propriedade `lenght` em comum com Arrays.  
* Pode ser convertido em um Array.
* O índice do primeiro elemento de `arguments` é `0`.

**Acessando um argumento.**

```js
arguments[0]
```

**Definindo o valor de um argumento**
```js
arguments[0] = 'Novo valor';
```

**Pegando os argumentos passados sem terem sido definidos na interface da função.**
```js
function soma() {
    console.log( arguments.length );
    return arguments[0] + arguments[1];
}

console.log(soma(7,3));
```

**Convertendo `arguments` em um Array. Exemplo do MDN:**

```js
var args = Array.prototype.slice.call( arguments );
var args = [].slice.call( arguments );

// ES2015
var args = Array.from( arguments );
```







### Fontes:

[MDN](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Functions/arguments)
