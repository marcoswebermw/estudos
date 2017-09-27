<?php

echo "<h1>Personagens</h1>";

$personagens = array( "Luke Skywalker",
                      "Yoda",
                      "Obi-Wan Kenobi",
                      "Rey",
                      "Finn",
                      "Anakin Skywalker",
                      "Darth Maul" );

foreach ($personagens as $posicao => $nome) {
  echo "<br>".$posicao." : ".$nome;
}

?>
