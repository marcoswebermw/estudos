<?php

  require_once('Cachorro.php');
  require_once('Gato.php');
  require_once('Pato.php');

  $rex = new Cachorro("Rex");
  $rex->respira();
  $rex->emiteSom();
  $rex->anda();
  $rex->anda();
  $rex->anda();

  echo "<br>";
  $bethoven = new Cachorro("Bethoven");
  $bethoven->respira();
  $bethoven->emiteSom();
  $bethoven->anda();

  echo "<br>";
  $bethoven = new Gato("Miau");
  $bethoven->respira();
  $bethoven->emiteSom();
  $bethoven->anda();
  $bethoven->anda();

  echo "<br>";
  $donald = new Pato("Donald");
  $donald->respira();
  $donald->emiteSom();
  $donald->anda();


?>
