<?php

$naves = array("Millenium Falcon",
               "X-Wing", "TIE Fighter",
               "Star Destroyer",
               "Tie Advanced",
               "Slave I");

$tamanho_array = count($naves);

echo "<h1>Naves Star Wars</h1>";
echo "<ul>";

for( $i = 0; $i < $tamanho_array; $i++ ){
        echo "<li>".$naves[$i]."</li><br>";
}

echo "</ul>";

?>
