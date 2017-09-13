<!DOCTYPE html>
<html>
<body>
<%
dim horas
horas = hour(now())

response.write("<p>" & now())
response.write("</p>")

If horas < 12 then
   response.write("Bom dia!")
else
   response.write("Aproveite o resto do dia!")
end if
%>

</body>
</html>
