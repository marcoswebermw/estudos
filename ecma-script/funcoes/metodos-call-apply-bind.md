## Métodos Call, Apply e Bind

Os métodos apply, call e bind estão presentes em todas as funções em Javascript e servem para manipular o valor de this.

### Call

O método call() invoca uma função com um dado valor this  e argumentos passados individualmente.  

* Você pode atribuir um objeto this diferente quando executar uma função existente.
* this refere-se ao objeto atual, o objeto em execução. 
* Com call, você pode escrever um método uma vez e então herdar-lo em outro objeto, 
sem ter que reescrever o método para o novo objeto.



```js
function sayThis( n1, n2 ) {  
    console.log( this * n1 * n2 );
}
// this = 2, n1 = 3, n2 = 3.
sayThis.call( 2, 3, 3 ) // 18  
// this = 1, n1 = 3, n2 = 3.
sayThis.call( 1, 3, 3 ) // 9  
```

### Apply

Chama uma função passando um contexto(this) e passando seus argumentos de uma única vez através de um array.  

* Você pode atribuir um objeto this diferente quando chamar uma função existente.
this refere-se ao objeto atual, o objeto da chamada.   
* Com apply, você pode escrever um método apenas uma vez e então herdá-lo em outro objeto, 
sem ter que reescrever o método para o novo objeto.  
* Ele aceita objetos array-like como: array literal, objeto `Array`, `arguments`. 
Também significa que se pode usar propriedades como a `length`.  


```js
function sayThis( n1, n2 ) {  
    console.log( this * n1 * n2 );
}
// this = 2, n1 = 3, n2 = 3.
sayThis.apply( 2, [ 3, 3 ] ) // 18  
// this = 1, n1 = 3, n2 = 3.
sayThis.apply( 1, [ 3, 3 ] ) // 9  

```


### Bind
* O bind possui vários usos.
* Geralmente, é usado para preservar o contexto de execução para uma função que executa em outro contexto.
* bind cria uma nova função com o mesmo corpo da função original mas com outro contexto.
* O primeiro argumento passado para bind especifica o valor da palavra-chave this na função associada.
* Você também pode passar argumentos opcionais adicionais para bind.
* Adicionado na ES5.

**Exemplo Stackoverflow**

```js
function foo( nome, idade ) { 
    return 'ola '+ nome + ', você tem ' + idade
}

var joao = foo.bind( window, 'joao' );
joao( '23' ); // ola joao, você tem 23
joao( '26' ); // ola joao, você tem 26

// o que é o mesmo que:
var joao = function ( idade ) {
    return foo( 'joao', idade );
}

// porém evita bastante rescrita no seu código.
// mantive o argumento nomeado como `idade` para fins didaticos o que
// é feito na realidade é não passar argumentos e o segundo argumento em
// foo seria `arguments[0]` dentro da função anonima do joao que é um wrapper.

```


**Outro Exemplo do Stackoverflow**

```js
let car = {
    sound: 'Vrrrrummm',
    startEngine: function() {
        console.log(this.sound);
    }
}

let bike = {
    sound: "Papapapapapapraprap"
}

let minhaFuncao = car.startEngine.bind(bike);
minhaFuncao(); // Papapapapapapraprap.
```

**Outro Exemplo do bind**

```js
function sayThis( n1, n2 ) {  
    console.log( this * n1 * n2 );
}

var thisIs2 = sayThis.bind( 2 );  
var thisIs2N1Is3 = sayThis.bind( 2,3 );  
var thisIs2N1Is3N2Is3 = sayThis.bind( 2,3,3 ); 

thisIs2( 3, 3 );      // 18 - muda this  
thisIs2N1Is3( 3 );    // 18 - muda this e atribui n1  
thisIs2N1Is3N2Is3();  // 18 - muda this e atribui n1 e n2  
```

----------------------------------------------------------------------------------------

### Fontes

* MDN - https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Function/call
* MDN - https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Function/apply
* MSDN - https://msdn.microsoft.com/pt-br/library/dn569317(v=vs.94).aspx
* http://programadorobjetivo.co/call-apply-e-bind-em-javascript/
* https://pt.stackoverflow.com/questions/165545/bind-javascript
* https://pt.stackoverflow.com/questions/4340/qual-a-diferença-dos-métodos-apply-call-e-bind-na-hora-de-chamar-uma-função-no


