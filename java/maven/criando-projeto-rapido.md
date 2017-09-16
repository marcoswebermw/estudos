## Criando o projeto de exemplo do Maven

Guia de criação de um projeto de amostra de uso do Maven em cinco minutos.

**1. Entre em um diretório vazio e execute o seguinte comando:**

`mvn archetype:generate -DgroupId=br.com.mw.app -DartifactId=meu-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

**2. Entre dentro do diretório gerado:**

`cd meu-app`

**3. Execute o Maven até a fase de empacotamento:**

`mvn package`

**4. Teste se aplicação está funcionando:**

`java -cp target/meu-app-1.0-SNAPSHOT.jar br.com.mw.app.App`

**5. Opcionalmente gere um site:**

`mvn site`

### Fontes:

* [maven.apache.org](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
