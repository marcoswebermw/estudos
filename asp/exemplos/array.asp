<!DOCTYPE html>
<html>
<body>

<%

' Array com 6 elementos.
Dim frutas(5),i
frutas(0) = "Laranja"
frutas(1) = "Maçã"
frutas(2) = "Uva"
frutas(3) = "Morango"
frutas(4) = "Manga"
frutas(5) = "Banana"

For i = 0 to 5
     response.write( frutas(i) & "<br>" )
Next
%>

</body>
</html>
