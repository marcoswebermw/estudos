'use strict';

var personagens = [
      { nome: 'Luke', sexo: 'Masculino' }
    , { nome: 'Han Solo', sexo: 'Masculino' }
    , { nome: 'Princesa Leia', sexo: 'Feminino' }
    , { nome: 'Obi Wan Kenobi', sexo: 'Masculino' }];

var alguma_mulher = personagens.some(function (personagem) {
    return personagem.sexo == 'Feminino';
});

console.log(alguma_mulher); // true, pois "Princesa Leia" é do sexo feminino.
