<?php

require_once('IAnimal.php');

class Gato implements IAnimal{

  private $nome;
  private $passos;

  public function __construct($nome){
    $this->nome = $nome;
    $this->passos = 0;
  }

  public function respira(){
    echo "<br>O ".$this->nome." está respirando...";
  }

  public function emiteSom(){
    echo "<br>Miau! Miau! Miau!";
  }

  public function anda(){
    ++$this->passos;
    echo "<br>O gato está andando...";
    echo "<br>Já deu ".$this->passos." passo(s).";
  }


}

?>
