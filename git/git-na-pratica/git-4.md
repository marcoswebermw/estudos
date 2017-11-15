## Git 4
  
Um exemplo de fluxo de trabalho com git.  
  
### Inicie um repositório  
`git init`

### Vinculando repositório local ao servidor remoto(Github no caso)
  
`git remote add origin https://github.com/usuario/repostiorio.git`

### Verificando se existem arquivos novos no repositório remoto
  
`git pull origin master` 


### Crie uma tag anotada marcando o release inicial  
`git tag -a v0.1 -m 'Versão inicial 0.1'`


### Verifique a tag  
`git tag`


### Crie uma branch de desenvolvimento e mude para ela
`git checkout -b develop`


### Verifique as branchs criadas  
`git branch`


### Faça alterações na branch de desenvolvimento  
`git commit -m "ADD novas features."`


### Verifique o log do commit  
`git log --pretty=oneline`


### Volte para a master  
`git checkout master`


### Faça o merge dela na master
`git merge develop`


### Remova a branch de desenvolvimento  
`git branch -d develop`


### Verifique se existe alguma alteração no repositório remoto  
`git pull origin master` 

### Enviando alterações do repositório local para o remoto
  
`git push origin master`  


### E envie as tags para o repositório remoto
`git push origin v0.1`  
ou  
`git push origin --tags`   

