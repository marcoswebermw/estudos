
let elementos = ['A', 'B', 'C','D'];

// Pega o iterator da lista(array).
let iteradorDaLista = elementos[Symbol.iterator]();

// Pega o elemento seguinte na lista.
// No caso é o primeiro elemento.
let elemento = iteradorDaLista.next();

// Enquanto os elementos da lista não acabarem.
// O 'done' retorna 'true' se a lista foi percorrida até o final.
while(!elemento.done){
    // Pega o valor do elemento.
    let e = elemento.value;
    // Imprime o valor do elemento.
    console.log(e);
    // Pega o próximo elemento da lista.
    elemento = iteradorDaLista.next();
};
