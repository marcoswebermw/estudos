## Iterators

> Um iterável está ligado a um iterador que indica como o iterável será percorrido.  
O iterador fornece uma maneira sequêncial de acessar os elementos do iterável.  
O iterável deixa toda a responsabilidade pela iteração para o iterador preservando assim sua
extrutura interna.  
  
  
  
* Um objeto é um `iterador` se ele sabe como acessar todos os elementos de um iterável, 
e mantém sua posição na estrutura acessada.
Iteradores oferecem o método `next()` que retorna um objeto que contém duas propriedades: `value` e `done`.  
O `value` retorna o valor do iterável. O `done` é um booleano que diz se chegou ao fim da estrutura do iterável.  
* Um objeto é `iterável` se ele implementa o seu iterador na propriedade `Symbol.iterator`.
* Iterators são `lazy`. Não sabem quantos elementos vão ter que percorrer.  
  
Tipos iteráveis por padrão:
  * Array;  
  * String;  
  * Maps;  
  * Sets;  
  
  
  ----------------------------------------------------
  
**Exemplo:**
```js
let times = ['Warriors', 'Cavs', 'Spurs','Celtics'];

let timesIterator = times[Symbol.iterator]();

timesIterator.next(); // { value: 'Warriors', done: false }
timesIterator.next(); // { value: 'Cavs', done: false }
timesIterator.next(); // { value: 'Spurs', done: false }
timesIterator.next(); // { value: 'Celtics', done: false }
timesIterator.next(); // { value: undefined, done: true }

```

### Usando Iterators

```js
let elementos = ['A', 'B', 'C','D'];

// Pega o iterator da lista(array).
let iteradorDaLista = elementos[Symbol.iterator]();

// Pega o elemento seguinte na lista.
// No caso é o primeiro elemento.
let elemento = iteradorDaLista.next();

// Enquanto os elementos da lista não acabarem.
// O 'done' retorna 'true' se a lista foi percorrida até o final.
while(!elemento.done){
    // Pega o valor do elemento.
    let e = elemento.value;
    // Imprime o valor do elemento.
    console.log(e);
    // Pega o próximo elemento da lista.
    elemento = iteradorDaLista.next();
};


```
