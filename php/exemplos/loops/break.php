<?php

echo "<h1>Mulheres de Star Wars</h1>";

$women = array( "Rey", "Leia", "Jyn Erso", "Padmé Amidala", "Han Solo");
$tamanho_array = count($women);

for ($i=0; $i < $tamanho_array; $i++) {
    if ($women[$i] == "Han Solo") {
      break;
    }
    echo $i." : ".$women[$i]."<br>";
}

?>
