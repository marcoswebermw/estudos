## Find

O `find` retorna um item procurado dentro de uma lista.  
O `find` itera sobre uma lista. Recebe uma função de callback como argumento. Essa função recebe um parâmetro que representa 
cada item da lista.  
Mesmo se o item procurado aparecer duas vezes na lista, somenter será retornado o primeiro item correspondente.



```js
let atrizes = [
      'Scarlett Johansson'
    , 'Margot Robbie'
    , 'Ana de Armas'
    , 'Mila Kunis'
    , 'Amber Heard'
    , 'Olivia Wilde'
    ];
    
let atriz_escolhida = atrizes.find(function(atriz){
    return atriz === 'Margot Robbie';
});
    
console.log(atriz_escolhida);
```
