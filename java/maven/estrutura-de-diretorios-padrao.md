## Estrutura padrão de diretórios de um projeto Maven


O Maven cria uma estrutura de diretórios comum que permite que os usuários se sintam imediatamente
familiarizados com um projeto Maven mesmo trabalhando em outros projetos diferentes.

Abaixo os diretórios que normalmente são criados e os principais estão em negrito:

|    Diretórios do Projeto Maven  |Função|
|------|------|
| **`src/main/java`**|Código-fonte e bibliotecas.|
| **`src/main/resources`**|Arquivos auxiliares do sistema, como .properties, XMLs e configurações.|
| src/main/filters|Arquivos de recursos com filtros.|
| **`src/main/webapp`**|Se for uma aplicação web, os arquivos JSP, HTML, JavaScript CSS vão aqui, incuindo o web.xml.|
| **`src/test/java`**|As classes com seus testes unitários ficam aqui e são executadas automaticamente com JUnit e TestNG. Outros frameworks podem exigir configuração adicional.|
| **`src/test/resources`**|Arquivos auxiliares usados nos testes. Você pode ter properties e configurações alternativas, por exemplo.|
| src/test/filters|Arquivos de testes de recursos com filtros.|
| src/it|Testes de integração (principalmente para pluguins).|
| src/assembly|Descritores Assembly.|
| src/site|Site.|
| LICENSE.txt|Licença do projeto|
| NOTICE.txt|Avisos e atribuições exigidos pelas bibliotecas de que o projeto depende|
| README.txt|Readme do projeto|
| **`pom.xml`**|Arquivo que concentra as informações do seu projeto.|
| **`target`**|Diretório onde fica tudo que é gerado, isto é, onde vão parar os arquivos compilados, JARs, WARs, JavaDoc, etc.|


  
  
    
### Fontes:

* [Maven Docs](http://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)
* http://luizricardo.org/2014/06/instalando-configurando-e-usando-o-maven-para-gerenciar-suas-dependencias-e-seus-projetos-java/
