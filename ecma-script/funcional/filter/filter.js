'use strict';

var filmes = [
      { nome: 'Matrix', ano: 1999 }
    , { nome: 'Blade Runner', ano: 1982 }
    , { nome: 'Star Wars', ano: 1977 }
    , { nome: 'Back to the Future', ano: 1985 }];

var filmes_anos_80 = filmes.filter(function (filme) {
    return (filme.ano >= 1980) && (filme.ano < 1990);
});

console.log(filmes_anos_80);
