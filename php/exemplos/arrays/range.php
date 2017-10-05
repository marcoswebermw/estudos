<?php
// Gerando sequências aleatórias.
// range(início, fim, passo_opcional);
$zero_a_dez = range(0, 10);
echo "0 à 10 - Crescente<pre>";
print_r($zero_a_dez);
echo "<pre>";

$dez_a_zero = range(10, 0);
echo "10 à 0 - Decrescente<pre>";
print_r($dez_a_zero);
echo "<pre>";

$par = range(0, 10, 2);
echo "0 à 10 - Par<pre>";
print_r($par);
echo "<pre>";

$impar = range(1, 10, 2);
echo "0 à 10 - Ímpar<pre>";
print_r($impar);
echo "<pre>";


$a_a_z = range("A", "Z");
echo "A à Z<pre>";
print_r($a_a_z);
echo "<pre>";

?>
