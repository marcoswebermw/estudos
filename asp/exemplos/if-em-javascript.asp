<%@ language="javascript" %>
<!DOCTYPE html>
<html>
<body>

<%
' If feito usando recursos da linguagem javascript.

var novaData = new Date()
var horas = novaData.getHours()

Response.Write("<p>")
Response.Write(novaData)
Response.Write("</p>")

if (horas < 12)
{
   Response.Write("Bom dia!")
}
else
{
   Response.Write("Aproveite o resto do dia!")
}
%>

</body>
</html>
