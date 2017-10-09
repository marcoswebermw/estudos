
let mapa = new Map();

mapa.set('red', 'FF0000');
mapa.set('green', '00FF00');
mapa.set('blue', '0000FF');
console.log(mapa); // Map { 'red' => 'FF0000', 'green' => '00FF00', 'blue' => '0000FF' }

console.log(mapa.has('green'));    // true
console.log(mapa.get('red'));      // FF0000
console.log(mapa.size);            // 3

console.log(mapa.delete('green')); // true
console.log(mapa.get('green'));    // undefined
console.log(mapa.has('green'));    // false

console.log(mapa); // Map { 'red' => 'FF0000', 'blue' => '0000FF' }
mapa.clear()
console.log(mapa); // Map {}
