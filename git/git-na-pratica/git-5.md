## Git 5
  
Um exemplo de fluxo de trabalho com git.   

Nesse exemplo será criado um fluxo onde à partir da master serão criadas algumas ramificações(branches): 
develop, hotfix, release, feature.

### Passo 1  

O primeiro passo é criar o repositório, fazer o link dele com o remoto, atualizá-lo com possíveis 
alterações feitas por outras pessoas e definir uma tag indicando o início do desenvolvimento.  
 
``` 
git init  
  
git remote add origin https://github.com/usuario/repostiorio.git  
  
git pull origin master  

// Baixa a branch develop de servidor ser ela existir.
// Não tenho certeza do que acontece quando ela não existe.
// Talvez seja criada.
git checkout -b develop origin/develop
  
git tag -a v0.1 -m 'Versão inicial 0.1'  
  
git tag  
```  
  
> Ao invés de iniciar um repositório poderia ser feito o clone de um repositório remoto com `git clone repositorio`.  
  
  
### Passo 2  

A branch `master` só terá código estável e não deve ser comitado nada diretamente nela. 
O que deve ser feito é o merge da branch `release` ou `hotfix` nela. 
Mas, por enquanto, vamos seguir o fluxo, criando uma branch para desenvolvimento.  
  
A partir dessa branch serão criadas outras branchs do tipo `feature` que são as novas funcionalidades. 
Cada branch `feature` quando terminada terá seu código comitado na branch `develop` e então será excluída.  
  
```
git checkout -b develop
  
git checkout -b feature1
git commit -m "Comitando na feature1."
git checkout develop  

git checkout -b feature2
git commit -m "Comitando na feature1."
git checkout develop  

// Atualiza com possíveis alterações remotas na develop e faz o merge
git pull origin develop
git merge feature1
git merge feature2  

git branch
git branch -d feature1
git branch -d feature2  

```  
  
O desenvolvimento continua até quando tivermos features suficientes. Depois deverá ser criada uma branch release, 
a partir da `develop` que estará pronta para ser mergeada na `master`. Na `master` é criada uma tag indicando a nova release.  
  
Antes de ser mergeada na `master` a `release` pode ter bugs corrigidos diretamente nela, 
mas que antes do merge devem ser propagados para a branch `develop` corrigindo-a também.  
Logo em seguida a branch `release` é removida.  
  
```
// Dentro da branch develop ainda
git checkout develop
git checkout -b releaseV1.0

// Correções de possíveis erros na release
git commit -m "Correções feitas na branch releaseV1.0'

// Develop recebe as correções e pode continuar o desenvolvimento sem esses erros
git checkout develop
git pull origin develop
git merge releaseV1.0

git checkout master
git merge releaseV1.0
git tag -a v1.0 -m "Versão 1.0 criada." 
git tag

git branch -d releaseV1.0

git push origin master
git push origin develop
git push origin --tags

```
  
### Passo 3  
 
Podem ser descobertos bugs em produção, ou seja, bugs na `master`. 
Então para corrigir esses bugs será criada uma nova branch chamada `hotfix` a partir da `master`.  
As alterações serão feitas nela e logo em seguida enviadas para a `master` e a `develop`. 
Terminando o processo com a remoção da `hotfix`.  

```
git checkout master
git checkout -b hotfix

git commit -m "Bugs corrigidos."
git log --pretty=oneline

git checkout master
git pull origin master
git merge hotfix
git tag -a v1.0.1 -m "Correção do bug x na v1.0." 

git checkout develop
git pull origin develop
git merge hotfix

git branch -d hotfix

git push origin master
git push origin develop
git push origin --tags

```
    
      
> Em várias partes do código foi usado o comando de atualização com o servidor remoto. Não tenho certeza do 
melhor momento para se fazer isso. Talvez em alguns passos isso não seja necessário. Vai depender de quantas 
pessoas e como elas trabalham no repositório.  
        
  
  
### Referências
  
* [Git Book pr-BR](https://git-scm.com/book/pt-br/v2);  
* [Stackoverflow](https://pt.stackoverflow.com/questions/80583/qual-é-a-diferença-entre-um-branch-e-uma-tag);  

  

