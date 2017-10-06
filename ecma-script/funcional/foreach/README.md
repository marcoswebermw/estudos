## forEach

O `forEach` permite que a estrutura de repetição `for` seja usada diretamente de uma lista.  
O `forEach` recebe uma função de callback com um parâmetro que representa cada item da lista na iteração.


```js
"use strict";

var cores = ["Red", "Green", "Blue"];

function mostraCores(cor) {
    console.log(cor);
};

cores.forEach(mostraCores);

```



* Valores alterados depois que a função de callback for chamada pela primeira vez não surtirão efeito na iteração.   
Mas os valores adicionados, alterados ou removidos da lista mesmo não aparecendo na iteração serão executados e depois
podem ser vistos normalmente.

```js
"use strict";

var cores = ["Red", "Green", "Blue"];

cores.forEach(function (cor) {
    cores.push('Purple');
    console.log(cor); // Red, Green, Blue.
});

console.log(cores); //  Red, Green, Blue, Purple, Purple, Purple.
```
