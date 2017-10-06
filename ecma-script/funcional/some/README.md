## Some

O `some` verifica se pelo menos um elemento da lista satisfaz determinada condição.  
Se sim ele retorna true caso contrário falso.  
O loop é interrompido na primeira ocorrência em que o critério for satisfeito.  

```js
let personagens = [
      { nome: 'Luke', sexo: 'Masculino' }
    , { nome: 'Han Solo', sexo: 'Masculino' }
    , { nome: 'Princesa Leia', sexo: 'Feminino' }
    , { nome: 'Obi Wan Kenobi', sexo: 'Masculino' }];

let alguma_mulher = personagens.some(function (personagem) {
    return personagem.sexo == 'Feminino';
});

console.log(alguma_mulher); // true, pois "Princesa Leia" é do sexo feminino.
```
