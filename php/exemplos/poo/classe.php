<?php

class Fabricante{
    private $nome;
    
    public function setNome(){
        $this->nome = $nome;
    }
  
    public function getNome(){
        return $this->nome;
    }

}


class Produto{ 
    private $descricao; 
    private $preco; 
    private $fabricante; 
    
    // O construtor também poderia ter o mesmo nome da classe:
    // public function Produto($descricao, $preco, Fabricante $fabricante) {
    public function __construct($descricao, $preco, Fabricante $fabricante) {
        $this->descricao = $descricao; 
        $this->preco = $preco; 
        $this->fabricante = $fabricante;
    }
    
    public function getDetalhes(){
        return "O produto {$this->descricao} custa {$this->preco} reais. Fabricante: {$this->fabricante->getNome()}";
    } 
    
    public function setDescricao($valor){
        $this->descricao = $valor;
    }
    
    public function setPreco($valor){
        $this->preco = $valor;
    }
    
    public function getDescricao(){
        return $this->descricao;
    }
    
    public function getPreco(){
        return $this->preco;
    }
    
} 

$f1 = new Fabricante('Editora B');
$p1 = new Produto('Livro', 50, $f1); 

// var_dump($p1);

echo $p1->getDetalhes(); 

?>
