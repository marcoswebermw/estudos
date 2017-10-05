<?php
// Formas de se criar array em php.
// Forma 1.
$frutas = array("Maçã", "Goiaba", "Laranja", "Tomate");

foreach($frutas as $indice => $fruta){
  echo "<br>Fruta: ".$fruta;
};
echo "<br>";

// Forma 2.
$paises = ["Brasil", "Inglaterra", "Australia", "Japão"];
foreach ($paises as $indice => $pais) {
  echo "<br>País: ".$pais;
}
echo "<br>";

// Forma 3. Índices colocados manualmente.
$filmes[5] = "Godfather";
$filmes[10] = "Matrix";
$filmes[20] = "Alien";
$filmes[15] = "Star Wars";
echo "<pre>";
print_r($filmes);
echo "<pre>";
echo "<br>";

// Forma 4. Índices gerados automaticamente.
$dias[] = "Segunda";
$dias[] = "Terça";
$dias[] = "Quarta";
$dias[] = "Quinta";
$dias[] = "Sexta";
$dias[] = "Sábado";
$dias[] = "Domingo";
echo "<pre>";
print_r($dias);
echo "<pre>"


?>
