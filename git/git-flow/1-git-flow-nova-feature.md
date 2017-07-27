## Fluxo de desenvolvimento com o Git Flow.

**Criando uma nova feature**
1. Executar este comando dentro de um repositório git.
- `git-flow init` 
2. Dentro da branch `develop` abrimos uma nova branch para a nova feature.  
- `git-flow feature start nova_funcionalidade` 
3. Finaliza o desenvolvimento da feature. Mescla a nova feature com `develop`, remove a nova branch, e volta para a branch `develop`.
- `git-flow feature finish nova_funcionalidade` 
