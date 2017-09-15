## POM(Project Object Model)

- É a o principal arquivo de configuração do Maven.  
- Define coisas como propriedades e características do projeto como identificação, dependências, repositórios, etc.   
- É um arquivo xml.  
- Está presente em todo projeto.  
- Pode herdar configurações de um parent `pom`, isto é, como se houvesse um projeto “pai”.  
  
### Exemplo:  

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
 
  <groupId>br.com.mw.app</groupId>
  <artifactId>meu-app</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>jar</packaging>
 
  <name>Maven Quick Start Archetype</name>
  <url>http://maven.apache.org</url>
 
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.8.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
```
