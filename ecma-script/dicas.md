> Informações que não se encaixam em outros lugares serão colocadas aqui.

* O escopo global do javascript em um navegador é o `window`.


* Existem 6 tipos básicos no Javascript:  
1. números;
1. strings;
2. booleanos;
3. funções;
4. objetos;
5. undefined.

**Exemplos dos tipos:**

```js
console.log(typeof 2);              // number.
console.log(typeof false);          // boolean.
console.log(typeof 'Olá');          // string.
console.log(typeof function(){});   // function.
console.log(typeof {});             // object.
console.log(typeof undefined);      // undefined.


console.log(typeof null);           // object.
console.log(typeof NaN);            // number.

console.log(true || false);         // true.
console.log(true && false);         // false
console.log(false || 'Olá');        // Olá.
console.log(false && 'Olá');        // false.

```
