## Filter

O `filter` filtra os itens de um array por determinado critério e se o critério for `true` o item é retornado em um novo array.  
O `filter` assim como o map e o forEach recebe uma função de callback que tem um parâmetro que representa cada 
item da iteração.

```js
let filmes = [
         {nome: 'Matrix', ano: 1999,} 
       , {nome: 'Blade Runner', ano: 1982} 
       , {nome: 'Star Wars', ano: 1977}
       , {nome: 'Back to the Future', ano: 1985}
      ];

let filmes_anos_80 = filmes.filter( function( filme ) {
    return filme.ano >= 1980 && filme.ano < 1990;
});

console.log( filmes_anos_80 ); 
// Retornará:
// [ { nome: 'Blade Runner', ano: 1982 }, { nome: 'Back to the Future', ano: 1985 } ]
```
