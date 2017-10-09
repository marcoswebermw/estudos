let conjunto = new Set([1,4,8,2,0]);
console.log(conjunto);  // Set { 1, 4, 8, 2, 0 }


let paises = new Set();
paises.add('Brasil');
paises.add('Alemanha');
paises.add('Itália');
paises.add('Brasil');     // Não vai ser inserido pois já existe.
paises.add('Argentina');
console.log(paises);

for(let pais of paises){
  console.log(pais);      // Brasil, Alemanha, Itália, Argentina.
}

paises.delete('Argentina');

for(let pais of paises){
  console.log(pais);      // Brasil, Alemanha, Itália.
}

console.log(paises.size);              // 3.
console.log(paises.has('Brasil'));     // true.
console.log(paises.has('Argentina'));  // false.

paises.clear(); // Remove todos.

for(let pais of paises){
  console.log(pais);  // Não retorna nada.
}


