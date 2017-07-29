## Hotfix

> A branch de `hotfix` é criada quando surge um erro, bug na versão de produção(`master`) e tem que ser corrigido imediatamente.
Será criada a partir da branch `master` e possivelmente de uma versão com uma `tag` que esteja apresentando o problema.

* Criando uma branch hotfix da branch defeituosa 0.1.0

`git flow hotfix start 0.1.0`

* Finalizando uma branch hotfix depois de corrigido o defeito

> A correção será mesclada tanto na branch `master` quanto na branch `develop`. 
E a branch `master` será etiquetada indicando a correção.

`git flow hotfix finish 0.1.0`
