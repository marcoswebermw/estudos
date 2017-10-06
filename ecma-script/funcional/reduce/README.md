## Reduce

O `reduce` itera e transforma todos os elementos de um array de modo que no final só retorne um valor ou elemento.  
O `reduce` pega o resultado da iteração anterior e o usa como entrada da próxima iteração.

Recebe dois argumentos:  
  
  * Função de callback com dois parâmetros:  
    - Uma variável que pode ter um valor inicial.  
    - E o item da lista em cada iteração.  
  * Um valor inicial.  
  
  -------------------------------------
  
 **Exemplo 1**
 
 Somando todos os valores de um array.
 
  * Função de callback com dois parâmetros:  
    - Um acumulador que pode ter um valor inicial(no exemplo abaixo é o `soma`).  
    - E o item da lista(no exemplo abaixo é o `numero`).  
  * Valor inicial de soma é `0`.  
  
  ```js
let numeros = [1,2,3];

let somatorio = 0; // Apenas inicializando.
let valor_inicial = 0; // Definindo o valor inicial do argumento soma.

somatorio = numeros.reduce(function(soma, numero){
    return soma += numero; // 0+1 = 1; 1+2 = 3; 3+3 = 6; resultado é 6.
}, valor_inicial);

console.log(somatorio); // 6
  ```
  
  -------------------------------------
  
 **Exemplo 2**
 
  Criar um novo array que contenha somente todas as vitórias de cada time.
 
  * Função de callback com dois parâmetros:  
    - Um array que pode ter um valor inicial(no exemplo abaixo é o `arrayDeVitorias`).  
    - E o item da lista(no exemplo abaixo é o `vitoria`).  
  * Valor inicial de arrayDeVitorias é `[]`.  
 
 ```js
 let times = [
      { nome :'Golden State Warriors', vitorias : 67 }
    , { nome :'Cleveland Cavaliers', vitorias : 55 }
    , { nome :'San Antonio Spurs', vitorias : 60 }
    , { nome :'Boston Celtics', vitorias : 56 }
    ];


let valor_inicial = []; // Definindo o valor inicial do array arrayDeVitorias.

vitorias = times.reduce(function(arrayDeVitorias, vitoria){
    arrayDeVitorias.push(vitoria.vitorias);
    return arrayDeVitorias;
}, valor_inicial);

console.log(vitorias); // [ 67, 55, 60, 56 ].
 ```
 
