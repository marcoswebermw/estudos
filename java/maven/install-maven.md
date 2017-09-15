## Instalando o Maven

> Verifique se a variável de ambiente JAVA_HOME esta apontando para o jdk corretamente.

**Fazer o download:**

`wget -c http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.tar.gz -O maven.tar.gz`

ou 

`curl -o maven.tar.gz http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.tar.gz`


**Extraindo**

`tar -xzvf maven.tar.gz`

**Adicionar diretório ao PATH**

Adicione o diretório bin do maven à variável de ambiente PATH.

`export PATH=$PATH:$PWD/apache-maven-3.5.0/bin/`

**Verificando o mvn**

Verifique se o comando mvn está funcionando.

`mvn -v`
