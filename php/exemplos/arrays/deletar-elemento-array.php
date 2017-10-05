<?php

// Deletando elemento do array.
$paises = array("Brasil", "Inglaterra", "Argentina", "Australia", "Japão");

// O array não é re-indexado automaticamente.
// Deletando a string "Argentina";
unset($paises[2]);

echo "<pre>";
print_r($paises);
echo "<pre>"


?>
