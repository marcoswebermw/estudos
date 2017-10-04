<?php

require_once('IAnimal.php');

class Cachorro implements IAnimal{

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
    echo "<br>Au! Au! Au!";
  }

  public function anda(){
    ++$this->passos;
    echo "<br>O cachorro está andando...";
    echo "<br>Já deu ".$this->passos." passo(s).";
  }


}

?>
