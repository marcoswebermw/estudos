## Git 3
  
Será demonstrado como `baixar` e fazer `alterações` em uma branch existente no servidor.
Essa branch `não é a master`.  
Alterações serão feitas nessa branch mas `não será feito o 'merge'` na master. 
Ao invés disso a branch `será enviada` para o servidor remoto com as alterações. 
Para finalizar é demonstrado como `remover` a branch lá no servidor.
  
O que será feito:  
  
* Clonar um repositório;
* Baixar uma branch remota desse repositório;
* Fazer alterações nessa branch;
* Enviar alterações para essa branch no servidor remoto;
* Remover essa branch do servidor remoto.  
  
### Clonar repositório
  
`git clone https://github.com/marcoswebermw/estudos.git`  
  
### Baixar uma branch remota desse repositório
  
`git checkout -t origin/branch-exemplo-nao-e-a-master`   

ou  

`git checkout -b branch-exemplo-nao-e-a-master origin/branch-exemplo-nao-e-a-master`
  
### Fazer alterações nessa branch
  
`git commit -m "UPDATE feito na branch."`  
  
### Enviar alterações para essa branch no servidor remoto
  
`git push origin branch-exemplo-nao-e-a-master`  
  
### Remover essa branch do servidor remoto
  
`git push origin :branch-exemplo-nao-e-a-master`  
