<?php

echo "<h1>Números Pares<h1>";

for ($i=0; $i <= 10; $i++) {
    $resto = $i % 2;

    if ( $resto != 0 ) {
      continue;
    }

    echo $i."<br>";
    $i++;
}

?>
