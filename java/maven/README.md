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
- `integration-test:` executa os testes de integração.
- `verify:` Verifica a qualidade dos pacotes gerados, para ver se não contém erros;
- `install:` Copia o projeto para o repositório local para ser usado em outros projetos;
- `deploy:` Copia o projeto para um repositório remoto para compartilhamento com outros devs.

> `clean` é um goal, no entanto, não pertence ao build. Ele serve para limpar arquivos anteriores da pasta `target` 
onde serão gerados novos artefatos.

### POM(Project Object Model)

Define coisas como propriedades e características do projeto.  
É um arquivo xml.

### Dependências

Exemplo:  

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.8.1</version>
    <scope>test</scope>
</dependency>
```

#### Escopos das dependências

|Escopo|Detalhes|
|-----------|-----------|
|compile  |Escopo padrão do maven para o momento em que o código é compilado e vai junto com o artefato;  |
|provided |Adicionado no momento da compilação, mas não vai junto com o artefato. | 
|runtime  |Não inclui no artefato, pois estará disponível em tempo de execução;  |
|test     |Inclui apenas no escopo de testes;  |
|system   |Não inclui no artefato, pois estará disponível no ambiente;  |
|import   |Incluirá TODAS as dependências do ‘depencyManagement‘ que está definido no pom ‘parent’.  |
