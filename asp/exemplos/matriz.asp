<html>
<body>

<%
' Tabela 2x2.
Dim tabela(1,1)

x(0,0)="Java"
x(0,1)="Python"
x(1,0)="Php"
x(1,1)="JavaScript"

for i=0 to 1
    response.write("<p>")
    for j=0 to 1
        response.write( x(i,j) & "<br />")
    next
    response.write("</p>")
next
%>

</body>
</html>
