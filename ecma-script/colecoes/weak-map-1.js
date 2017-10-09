let mapaFraco = new WeakMap();

let vermelho = {nome:'red'};
let verde    = {nome:'green'};
let azul     = {nome:'blue'};

mapaFraco.set(vermelho, 'FF0000');  // FF0000
mapaFraco.set(verde,    '00FF00');  // 00FF00
mapaFraco.set(azul,     '0000FF');  // 0000FF

console.log(mapaFraco.get(vermelho));
console.log(mapaFraco.get(verde));
console.log(mapaFraco.get(azul));

console.log(mapaFraco.has(verde));    // true.
console.log(mapaFraco.delete(verde)); // true
console.log(mapaFraco.has(verde));    // false.
