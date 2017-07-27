# Git Flow

>É um modelo de organização de branches. E para isso tem uma forma peculiar de nomeclatura de branchs.

## Nomeclatura das branches segundo Git Flow


|  Branch  |  Definição  |  
| ---------------- | ----------- |
|  **master**  |  É a principal branch. Usada para produção. É o destino do código quando pronto.  |  
| **develop** | É o passo que o código toma antes de ir para `master`. As features são juntadas aqui e testadas, em seguida são enviadas para produção. |  
| **feature/nome** | É nela que são criadas novas features e depois enviadas para `develop`. Exemplo de convenção de nome: ex: `feature/nova-tela`. |  
| **hotfix/nome** | Surgem e são juntadas a partir da `master` para correção de bugs críticos. Ex: `hotfix/4.22.1`. |  
| **release/nome** | São mais estáveis do que a `develop` e quase prontas para `master`. Ex: `release/4.23.0`. |  

> Git tags são geradas automaticamente quando usados os padrões de nomeclatura como os de `hotfix` e `release` no merge com a branch `master`.


## Instalando o Git Flow

`apt-get install git-flow`


## Fluxo de desenvolvimento com o Git Flow.

**Criando uma nova feature**
1. Executar este comando dentro de um repositório git.
- `git-flow init` 
2. Dentro da branch `develop` abrimos uma nova branch para a nova feature.  
- `git-flow feature start nova_funcionalidade` 
3. Finaliza o desenvolvimento da feature. Mescla a nova feature com `develop`, remove a nova branch, e volta para a branch `develop`.
- `git-flow feature finish nova_funcionalidade` 
