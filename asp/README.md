## Informações e dicas sobre a linguagem ASP.

* É uma linguagem de scripts para servidor similar ao PHP.
> Procurar por uma ferramenta chamada `WebMatrix` que vem com `ISS` para rodar o asp.
* É uma linguagem da Microsoft ultrapassada que foi substituída pelo ASP.NET.
* Na verdade ela usa o `VbScript` como linguagem de scripts.
* Fica inserida no arquivo com os `<%` e `%>`.
* Comentários são feitos pelo sinal `'` (aspa simples).
* Usa o `dim` para declarar uma variável;
* É case insensitive. Ou seja, não difere entre letras maiusculas e minusculas;
* Imprime na tela com o `Response.Write("Hello World!")`;
* Concatena com `&`;
* Todas as variáveis são do tipo `variant` e podem armazenar vários tipos de dados;



### Exemplo de código

```asp
<!DOCTYPE html>
<html>
<body>

<%
dim name
name="Donald Duck"
response.write("My name is: " & name)
%>

</body>
</html>
```



### Fontes:

[W3Schools](https://www.w3schools.com/asp/asp_introduction.asp) - A maioria dos exemplos desse repositório foram tirados da W3Schools.
