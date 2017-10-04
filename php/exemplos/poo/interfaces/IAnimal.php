<?php

// Cria um contrato obrigando à quem implementá-la
// que implemente todos os métodos abstratos abaixo.
// Facilita o polimorfismo. Classes que precisem
// dessa interface poderão ter a certeza de que classes
// que a implementem cumprirão o contrato dela. Isso
// permite várias possibilidades.
// Permite que conheçam a interface mas não precisem conhecer
// o funcionamento, a implementação dos métodos para poder utilizá-los.
interface IAnimal{

  public function respira();
  public function emiteSom();
  public function anda();

}

?>
