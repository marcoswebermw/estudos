## WeakMap

O `WeakMap` assim como o `map`  é uma coleção de pares chave e valor, mas que as chaves só podem ser `objetos`.  
A referência para os objetos da chave são mantidas de forma fraca.  
Caso o objeto seja excluído não será mais possível acessar o valor no WeakMap.   
Além de poderem ser removidos pelo Garbage Colletor caso não exista nenhuma referência para ele em memória.  


### Métodos e Propriedades do WeakMap  

| Método | Detalhes |
|------------|--------------|
| new weakMap() |Instância um WeakMap.|
| weakMap.set() |Define um WeakMap.|
| weakMap.get() |Recupera os valores de um WeakMap.|
| weakMap.has() |Indica se determinado elemento existe no WeakMap.|
| weakMap.delete() |Remove um elemento através da chave.|


--------------------------------------------------------

* O `WeakMap` é usado para manter objetos por pouco tempo na memória evitando memory leak(vazamento de memória).  
Isso quer dizer que se um objeto perde o objeto que o referenciava ele estará pronto para ser coletado pelo garbage colletor.


