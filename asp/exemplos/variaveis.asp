<!DOCTYPE html>
<html>
<body>

<%
' Variáveis podem ser declaradas com DIM.
' Também é possível da seguinte forma: minhavariavel="valor", porém é uma forma desaconselhada.
' Use a declaração Option Explicit que força o uso de uma das seguintes palavras na declaração de variáves:
' Dim, private ou public.

Option Explicit
dim mensagem

mensagem="Olá Mundo!"

response.write("Mensagem: " & mensagem)

%>

</body>
</html>
