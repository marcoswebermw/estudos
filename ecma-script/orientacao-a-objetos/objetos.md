## Objetos em Javascript

Objetos tem propriedades, que nada mais são do que variáveis vinculadas ao objeto.  
As propriedades são as características do objeto.  
Propriedades que não tem valor definido tem o valor `ùndefined`.  
Propriedades podem ser acessadas por notação de pontos ou com strings como arrays associativos.  
Também é possível usar a notação de colchetes com o comando `for...in` para iterar por todas as propriedades enumeráveis de um objeto.  
Só não é objeto em Javascript os tipos null e undefined.  


**Exemplo MDN**

```js
let meuObj = new Object();
let str = "minhaString";
let aleatorio = Math.random();
let obj = new Object();

meuObj.tipo               = "Sintaxe de ponto";
meuObj["data de criacao"] = "String com espaco";
meuObj[str]               = "valor de String";
meuObj[aleatorio]         = "Numero Aleatorio";
meuObj[obj]               = "Objeto";
meuObj[""]                = "Mesmo uma string vazia";

console.log(meuObj);
```

### Enumerar todas as propriedades de um objeto

Com `for...in` loops.  Itera sobre todas propriedades enumeráveis de um objeto.  
Com `Object.keys(objeto)`.  Retorna um array com todos as chaves de propriedades do objeto(menos na cadeia de protótipos).  
Com `Object.getOwnPropertyNames(objeto)`.  Retorna um array com todos os nomes de propriedades do objeto.  

### Criando novos objetos

**Usando inicializadores de objeto**

```js
let minhaMoto = {
    cor: "vermelho", 
    rodas: 4, 
    motor: {cilindros: 4, tamanho: 2.2} // Propriedade também é um objeto.
};
```

**Usando uma função construtora**

1. Criar uma função construtora. Convenção de letra maiúscula.  
2. Criar a instância do objeto com new.  

```js
function Carro( marca, modelo, ano, dono ) {
  this.marca = marca;
  this.modelo = modelo;
  this.ano = ano;
  this.dono = dono
}

function Pessoa( nome, idade, sexo ) {
  this.nome = nome;
  this.idade = idade;
  this.sexo = sexo;
}
```
```js
let jose = new Pessoa( "Jose da Silva", 30, "Masculino");
let meuCarro = new Carro( "Chevrolet", "Onix", 2016, jose);
```
> É possível adicionar uma nova propriedade para um objeto, mas só terá efeito no objeto desejado e não nos demais.

```js
meuCarro.cor = "Vermelho";
```

**Usando o método Object.create**

Permite definir o objeto protótipo para o objeto que você quer criar, sem a necessidade de se definir uma função construtora.

Exemplo MDN:

```js
// Encapsulamento das propriedades e métodos de Animal
let Animal = {
  tipo: "Invertebrados", // Propriedades de valores padrão
  qualTipo : function() {  // Método que ira mostrar o tipo de Animal
    console.log(this.tipo);
  }
}

// Cria um novo tipo de animal chamado animal1
let animal1 = Object.create(Animal);
animal1.qualTipo(); // Saída:Invertebrados

// Cria um novo tipo de animal chamado Peixes
let peixe = Object.create(Animal);
peixe.tipo = "Peixes";
peixe.qualTipo(); // Saída: Peixes
```

### Herança

Todos os objetos em JavaScript herdam de pelo menos um outro objeto.  
O objeto "pai" é conhecido como o `protótipo`, e as propriedades herdadas podem ser encontradas no objeto `prototype` do construtor.  



### Fontes:

MDN - https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Guide/Trabalhando_com_Objetos
