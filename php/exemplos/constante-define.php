<?php

// Constantes não podem ser alteradas depois de definidas.
// Com ´define´ é possível definir constantes em tempo de execução.
// Constantes não precisam do ´$´ antes do identificador.

define("MINHA_CONSTANTE", 5);
echo MINHA_CONSTANTE."<br>"; // Saída 5;


// Em tempo de execução.
// O valor de ´$i´ é concatenado a palavra ´CONSTANTE_0´.
for ($i=0; $i < 3; $i++) {
  define("CONSTANTE_0".$i, $i * 2);
}

echo "<br>".CONSTANTE_00; // Saída 0;
echo "<br>".CONSTANTE_01; // Saída 2;
echo "<br>".CONSTANTE_02; // Saída 4;

?>
