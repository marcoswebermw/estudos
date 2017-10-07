// Existe um objeto iterator implicitamente sendo usado.
// Use o babel e veja o que acontece atrás dos panos.
// https://babeljs.io/repl/

let cores = [
    { nome: 'Vermelho', valor: 'FF0000'}, 
    { nome: 'Verde', valor: '00FF00'},
    { nome: 'Azul', valor: '0000FF'}];

// Imprime toda a lista.
for(let cor of cores){
    console.log(cor);
}

// Somente o nome das cores.
for(let cor of cores){
    console.log(cor.nome);
}
