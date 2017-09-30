<?php

// Variáveis variaveis usam o valor atribuido à uma variável como identificador
// de outra variável.
// É usado dois "$$" para definir uma variável variável.

$variavel_normal = 'Outra_variavel';
$$variavel_normal = "Olá, sou uma variável variável";
// Testando se foi mesmo criada a `Outra_variavel`.
echo $Outra_variavel; // Será impresso: 'Olá, sou uma variável variável'.

echo "<br>";

// Também podemos usar o identificador $$variavel_normal.
// Só que dessa forma perde um pouco o sentido das variáveis-variáveis.
echo $$variavel_normal; // Será impresso: 'Olá, sou uma variável variável'.
?>
