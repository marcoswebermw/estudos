'use strict';

var personagens = [
      { nome: 'Luke', eJedi: true }
    , { nome: 'Han Solo' , eJedi: false }
    , { nome: 'Yoda', eJedi: true }
    , { nome: 'Obi Wan Kenobi', eJedi: true }];

var todos_sao_jedis = personagens.every(function (personagem) {
    return personagem.eJedi == true;
});

console.log(todos_sao_jedis);  // false, "Han Sole" não é jedi.
