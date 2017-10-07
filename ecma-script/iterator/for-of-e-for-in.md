## For..of e For..in

### for..of

O `for..of` é uma implementação um pouco mais nova que foi criada para percorrer uma
estrutura que tenha um iterador. Isso é feito de forma implícita. 
Ele também pode usar o `break` e o `continue`.  
Se a estrutura não for um iterável, ou seja, não tenha um iterador o `for..of` não vai funcionar.


**Exemplo 1**

```js
let colors = ['Red', 'Green', 'Blue']

for(let color of colors){
    console.log(color);
}

```

**Exemplo 2**

```js
// Existe um objeto iterator implicitamente sendo usado.
// Use o babel e veja o que acontece atrás dos panos.
// https://babeljs.io/repl/

let cores = [
    { nome: 'Vermelho', valor: 'FF0000'}, 
    { nome: 'Verde', valor: '00FF00'},
    { nome: 'Azul', valor: '0000FF'}];

// Imprime toda a lista.
for(let cor of cores){
    console.log(cor);
}

// Somente o nome das cores.
for(let cor of cores){
    console.log(cor.nome);
}

```



### for..in

O `for..in` não é o novo e também serve para percorrer lista.  
Funciona também onde não tem iterador, ou seja, em estruturas comuns.  
Pode fazer acesso às propriedades dos elementos.


**Exemplo 1**

```js
// Com o in não é necessário um iterator.

let cores = [
    { nome: 'Vermelho', valor: 'FF0000'}, 
    { nome: 'Verde', valor: '00FF00'},
    { nome: 'Azul', valor: '0000FF'}];

for(let cor in cores){
    console.log(cores[cor].nome);
}

```

**Exemplo 2**

```js
// Percorrendo os atributos de um objeto.
// O for..of não consegue fazer isso, pois aqui não existe iterator.

let cores = {nome: 'Vermelho', valor: 'FF0000'};

// Imprime todas propriedades.
for(let cor in cores){
    console.log(cores[cor]);
}

```
