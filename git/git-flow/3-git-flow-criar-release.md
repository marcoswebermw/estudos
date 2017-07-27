## Criando uma nova release

> Cria uma nova versão baseada na branch `develop`. Esta será uma branch que se prepara para produção. 
Nela poderão ser corrigidos bugs menores e fazer pequenos ajustes.

`git flow release start 0.1.0`

> Também, opcionalmente, pode-se usar um hash de um commit da branch `develop` como ponto inicial da release.

`git flow release start 0.1.0  4403d83`

* Depois de criada é importante enviar a release para o servidor remoto para ser usada por outros desenvolvedores. 
Para publicá-la usamos:

`git flow release publish 0.1.0`

* Para acompanhar uma release que já estaja em um servidor remoto usamos:

`git flow release track 0.1.0`



