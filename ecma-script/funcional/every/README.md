## Every

O `every` recebe uma lista e verifica uma condição booleana para todos os elementos da lista.  
O `every` retorna um valor booleano `true` ou `false`.

```js

let personagens = [
      {nome : 'Luke', eJedi: true}
    , {nome : 'Han Solo', eJedi: false}
    , {nome : 'Yoda', eJedi: true}
    , {nome : 'Obi Wan Kenobi', eJedi: true}
    ];
    
let todos_sao_jedis = personagens.every(function(personagem){
    return personagem.eJedi == true;
});

console.log(todos_sao_jedis);  // false, pois "Han Solo" não é jedi.

```

