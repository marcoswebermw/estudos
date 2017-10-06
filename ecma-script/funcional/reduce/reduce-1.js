"use strict";

var numeros = [1, 2, 3];

var somatorio = 0; // Apenas inicializando.
var valor_inicial = 0; // Definindo o valor inicial do argumento soma.

somatorio = numeros.reduce(function (soma, numero) {
    return soma += numero; // 0+1 = 1; 1+2 = 3; 3+3 = 6; resultado é 6.
}, valor_inicial);

console.log(somatorio); // 6
