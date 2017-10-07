// Com o in não é necessário um iterator.

let cores = [
    { nome: 'Vermelho', valor: 'FF0000'}, 
    { nome: 'Verde', valor: '00FF00'},
    { nome: 'Azul', valor: '0000FF'}];

for(let cor in cores){
    console.log(cores[cor].nome);
}
