'use strict';

var atrizes = ['Scarlett Johansson', 'Margot Robbie', 'Ana de Armas', 'Mila Kunis', 'Amber Heard', 'Olivia Wilde'];

var atriz_escolhida = atrizes.find(function (atriz) {
    return atriz === 'Margot Robbie';
});

console.log(atriz_escolhida);
