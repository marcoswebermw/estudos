## Estrutura WeakSet

O `WeakSet` é parecido com o `set`, ele armazena uma lista de valores que não se repete.  
Todavia, ele só pode armazenar objetos. Ele não é iterável. E não é possível remover todos os objetos de uma vez.  


### Métodos e Propriedades do WeakSet  


| Método | Detalhes |
|------------|--------------|
| new WeakSet() |Instância um weakSet.|
| weakSet.add() |Adiciona um objeto ao weakSet.|
| weakSet.has() |Indica se determinado elemento existe no weakSet.|
| weakSet.delete() |Remove um elemento através do nome.|

> É possível passar vários objetos para o `WeakSet` pelo seu construtor, mas esses devem estar em um array.

* O `WeakSet` é usado para manter objetos por pouco tempo na memória evitando memory leak(vazamento de memória).  
Isso quer dizer que se um objeto perde o objeto que o referenciava ele estará pronto para ser coletado pelo garbage colletor.

