## Mais sobre Objetos

### Definindo propriedades para um tipo de objeto

É possível adicionar propriedades a objetos definidos anteriormente através da propriedade `prototype`.  
Ela definie uma propriedade que passa a existir para todos os objetos do tipo especificao e não somente para uma instância.  

```js
Carro.prototype.cor = null;  // Todos obejtos do tipo carro agora tem a propriedade cor.
carro1.cor = "Azul";  // A instância carro1 tem cor Azul.
carro2.cor = "Verde";  // A instância carro2 tem cor Verde.
```

### Métodos

```js
nomeDoObjeto.nomedometodo = nome_da_funcao;
```
Ou:

```js
let meuObjeto = {
  meuMetodo: function( parametros ) {
    // ...faça algo
  }
};
```

### Definindo Getters e Setters

**Exemplo MDN - Usando objetos inicializadores**

```js
let obj = {
    a: 7,
    get b() { 
        return this.a + 1;
    },
    set c( x ) {
        this.a = x / 2
    }
};

console.log( obj.a ); // 7
console.log( obj.b ); // 8
obj.c = 50;
console.log( obj.a ); // 25
```  
Ou:  

**Exemplo MDN - Adicionar posteriormente para qualquer objeto a qualquer tempo usando um método getter ou setter adicionado**

```js
let obj = { a:0 }

Object.defineProperties( obj, {
    "b": { get: function () { return this.a + 1; } },
    "c": { set: function (x) { this.a = x / 2; } }
});

obj.c = 10        // Roda o setter, que associa 10 / 2 (5) para a propriedade 'a'.
console.log( obj.b )  // Roda o getter, que yields a + 1 ou 6.
```

### Removendo uma propriedade de um objeto

**Exemplo MDN:**

```js
// Criando um novo objeto, myobj, com duas propriedades, a e b.
let myobj = new Object;
myobj.a = 5;
myobj.b = 12;

// Removendo a propriedade a, deixando myobj com apenas a propriedade b.
delete myobj.a;
console.log ( "a" in myobj ) // yields "false"
```

### Fontes

MDN - https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Guide/Trabalhando_com_Objetos  
Mais detalhes - https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Guide/Detalhes_do_Modelo_do_Objeto
