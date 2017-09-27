<?php

// Loop tem que ser executado pelo menos uma vez.
// Imprime até "Rey".
$robos = [ "C-3P0",
           "R2-D2",
           "BB-8",
           "K-2SO",
           "Jyn Erso",
           "Saw Gererra" ];

$i = 0;

echo "<h1>Robôs</h1>";
echo "<ul>";

do {
    echo "<br><li>". $robos[$i] ."</li>";
    $i++;
} while ( $robos[$i] != "Jyn Erso" );

echo "</ul>";

?>
