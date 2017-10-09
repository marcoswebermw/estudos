let mapa = new Map();

mapa.set('red', 'FF0000');
mapa.set('green', '00FF00');
mapa.set('blue', '0000FF');
console.log(mapa);  // Map { 'red' => 'FF0000', 'green' => '00FF00', 'blue' => '0000FF' }

let mapa2 = new Map();
mapa2.set(1, 'Um');
mapa2.set(2, 'Dois');
mapa2.set(3, 'Três');
console.log(mapa2);  // Map { 1 => 'Um', 2 => 'Dois', 3 => 'Três' }

function funcao1(){};
function funcao2(){};
function funcao3(){};

let mapa3 = new Map();
mapa3.set(funcao1, 'Função 1');
mapa3.set(funcao2, 'Função 2');
mapa3.set(funcao3, 'Função 3');

console.log(mapa3);  
// Map { 
// [Function: funcao1] => 'Função 1',   
// [Function: funcao2] => 'Função 2',   
// [Function: funcao3] => 'Função 3' }
