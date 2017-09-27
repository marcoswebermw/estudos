<?php

// Não pode ser implementada. Tem que ser especializada.
abstract class Conta{
    protected $agencia;
    protected $conta;
    protected $saldo;
    
    // O padrão de visibilidade é o publico com o uso do 'var'.
    // Pode ser substituido por 'public', 'private' e 'protected'.
    // Exemplo do uso com o 'var':
    // var $agencia;
    // var $conta;
    // var $saldo;
    
    
    // Função construtora.
    public function __construct($agencia, $conta, $saldo){
        $this->agencia = $agencia;
        $this->conta = $conta;
        $this->saldo = $saldo;
    }
    
    public function getDetalhes(){
        return "Agência: {$this->agencia} | Conta: {$this->conta} | Saldo: {$this->saldo}";
    }
    
    // Não pode ser modificada.
    public final function depositar($valor){
        $this->saldo += $valor;
        echo "Depósito de: {$valor} | Saldo atual: {$this->saldo}";
    }
    
    // Obriga as filhas a implementar.
    public abstract function saque($valor);
    
} 

// Não pode ser extendida.
final class Poupanca extends Conta{
    
    public function saque($valor){
        if($this->saldo >= $valor): 
            $this->saldo -= $valor;
            echo "Saque de: {$valor} | Saldo atual: {$this->saldo}";
        else:
            echo "Saque não autorizado | Saldo atual: {$this->saldo}";
        endif;
    }
}

// Não pode ser extendida.
final class Corrente extends Conta{
     protected $limite;
     
     public function __construct($agencia, $conta, $saldo, $limite){
         parent::__construct($agenica, $conta, $saldo); // Acessa o construtor da classe pai.
         $this->limite = $limite;
     }
     
     public function saque($valor){
         if( ($this->saldo + $this->limite) >= $valor):
             $this->saldo -= $valor;
             echo "Saque de: {$valor} | Saldo atual: {$this->saldo}";
         else:
             echo "Saque não autorizado | Saldo atual: {$this->saldo} | Limite: {$this->limite}";
         endif;
     }
}


// O arquivo 'NomeDaClasse.php' poderia ser usado em um outro arquivo com o "require_once".
// require_once('NomeDaClasse.php');
// new NomeDaClasse;

// $c1 = new Conta(100, 2586, 5000);
// $c1 = new Poupanca(100, 2586, 5000);
$c1 = new Corrente(100, 2586, 5000, 500);
$c1->depositar(1800);
$c1->saque(2500);
echo $c1->getDetalhes(); 

?>
