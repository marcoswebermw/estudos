## Artefato (artifact)

Não é obrigatório mas é normalmente um arquivo JAR que fica no repositório do Maven.  
  
Cada artefato é identificado através dos seguintes elementos:  

  
|Elemento|Significado|
|--------|--------|
|`Grupo`| É o nome do grupo de trabalho do projeto, como por exemplo br.com.mw.|
|`Identificador único de artefato`| Nome único do projeto dentro de um grupo.|
|`Número de versão`| É a versão do projeto. O sufixo -SNAPSHOT (0.0.1-SNAPSHOT, por exemplo) significa que o projeto está em desenvolvimento e o pacote pode ser alterado.|  
|`Tipo do projeto`| São os jar, war, ear, pom (projeto de configuração).|  
|`Classificador`| Identificação opcional para diferenciar variações da mesma versão. Por exemplo, se o programa é compilado para diferentes versões do Java podemos usar os classificadores Jdk8 e Jdk9. Se há variações específicas para Sistemas Operacionais, podemos ter os classificadores linux e windows.|


### Fontes:

* http://maven.apache.org/guides/getting-started/index.html
* http://luizricardo.org/2014/06/instalando-configurando-e-usando-o-maven-para-gerenciar-suas-dependencias-e-seus-projetos-java/
