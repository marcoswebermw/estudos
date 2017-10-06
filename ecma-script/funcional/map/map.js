'use strict';

var filmes = [
      { nome: 'Matrix', ano: 1999 }
    , { nome: 'Blade Runner', ano: 1982 }
    , { nome: 'Star Wars', ano: 1977 }
    , { nome: 'Back to the Future', ano: 1985 }];

var filmografia = filmes.map(function (filme) {
    return filme.nome;
});

console.log(filmografia);
