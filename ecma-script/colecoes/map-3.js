let mapa = new Map();

mapa.set('red', 'FF0000');
mapa.set('green', '00FF00');
mapa.set('blue', '0000FF');


// Imprime as chaves do mapa.
for(let chave of mapa.keys()){
  console.log(chave);
}

// Imprime os valores do mapa.
for(let chave of mapa.values()){
  console.log(chave);
}

// Imprime as chaves e valores do mapa.
for(let chave_valor of mapa.entries()){
  console.log(chave_valor);
}
