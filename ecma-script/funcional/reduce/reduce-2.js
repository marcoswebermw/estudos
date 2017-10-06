'use strict';

var times = [
      { nome: 'Golden State Warriors', vitorias: 67 }
    , { nome: 'Cleveland Cavaliers', vitorias: 55 }
    , { nome: 'San Antonio Spurs', vitorias: 60 }
    , { nome: 'Boston Celtics', vitorias: 56 }];

var valor_inicial = []; // Definindo o valor inicial do array arrayDeVitorias.

vitorias = times.reduce(function (arrayDeVitorias, vitoria) {
    arrayDeVitorias.push(vitoria.vitorias);
    return arrayDeVitorias;
}, valor_inicial);

console.log(vitorias); // [ 67, 55, 60, 56 ].
