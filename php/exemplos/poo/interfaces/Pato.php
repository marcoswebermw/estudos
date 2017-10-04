<?php

require_once('IAnimal.php');

class Pato implements IAnimal{

  private $nome;
  private $passos;

  public function Pato($nome){
    $this->nome = $nome;
    $this->passos = 0;
  }

  public function respira(){
    echo "<br>O ".$this->nome." está respirando...";
  }

  public function emiteSom(){
    echo "<br>Quack! Quack! Quack!";
  }

  public function anda(){
    ++$this->passos;
    echo "<br>O pato está andando...";
    echo "<br>Já deu ".$this->passos." passo(s).";
  }

}

?>
