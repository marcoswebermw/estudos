let selecao_brasileira = {
  nome: 'Brasil',
  copasQueGanhou: 5
};

let selecao_alema = {
  nome: 'Alemanha',
  copasQueGanhou: 4
};

let selecao_italiana = {
  nome: 'Italia',
  copasQueGanhou: 4
};

let selecao_inglesa = {
  nome: 'Inglaterra',
  copasQueGanhou: 1
};


let selecoes = new WeakSet([selecao_brasileira, selecao_alema, selecao_italiana]);
selecoes.add(selecao_inglesa);


console.log(selecoes.has(selecao_brasileira));  // true.
console.log(selecoes.has(selecao_alema));       // true.
console.log(selecoes.has(selecao_italiana));    // true.
console.log(selecoes.has(selecao_inglesa));     // true.

selecoes.delete(selecao_alema);
console.log(selecoes.has(selecao_alema));       // false.

