// Percorrendo os atributos de um objeto.
// O for..of não consegue fazer isso, pois aqui não existe iterator.

let cores = {nome: 'Vermelho', valor: 'FF0000'};

// Toda a lista.
for(let cor in cores){
    console.log(cores[cor]);
}
