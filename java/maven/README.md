## Maven

Ferramenta de integração de projetos.  
Gerencia dependências, controla versão de artefatos, gera relatórios, executa testes etc.  
Não é substituto para o Ant ou Ivy.  


### Ciclo de vida do build:

**Goals(Fases)**  

- `validade:` Valida os arquivos pom.xml;
- `compile:` Compila todos os códigos do projeto;
- `test:` Roda os testes em 'src/test/java' e para o build em caso de falha;
- `package:` Empacota o projeto em arquivos(jar, war, etc) a partir de 'src/main/java';
- `integration-test:` Executa os testes de integração.
- `verify:` Verifica a qualidade dos pacotes gerados, para ver se não contém erros;
- `install:` Copia o projeto para o repositório local para ser usado em outros projetos;
- `deploy:` Copia o projeto para um repositório remoto para compartilhamento com outros devs.

> `clean` é um goal, no entanto, não pertence ao build. Ele serve para limpar arquivos anteriores da pasta `target` 
onde serão gerados novos artefatos.

Não é necessário rodar todos os passos sempre. É possível determinar até que fase o Maven deve ir.

#### Escopos das dependências

|Escopo|Detalhes|
|-----------|-----------|
|compile  |Escopo padrão do maven para o momento em que o código é compilado e vai junto com o artefato;  |
|provided |Adicionado no momento da compilação, mas não vai junto com o artefato. | 
|runtime  |Não inclui no artefato, pois estará disponível em tempo de execução;  |
|test     |Inclui apenas no escopo de testes;  |
|system   |Não inclui no artefato, pois estará disponível no ambiente;  |
|import   |Incluirá TODAS as dependências do ‘depencyManagement‘ que está definido no pom ‘parent’.  |


> Plugins no Maven também são chamados de `mojos`.


### Fontes:

* http://maven.apache.org/guides/getting-started/index.html
* http://luizricardo.org/2014/06/instalando-configurando-e-usando-o-maven-para-gerenciar-suas-dependencias-e-seus-projetos-java/
* http://maven.apache.org/guides/introduction/introduction-to-the-pom.html


