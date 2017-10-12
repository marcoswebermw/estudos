## Algumas funções de array em php.

### Inserir novo elemento em um array.

```php
$paises = ['Brasil', 'Alemanha', 'Itália', 'Argentina'];

array_push($paises, 'Espanha');

print_r($paises);
```


### Inserir novo elemento em um array.

```php
$pais_capital = ['Brasil' => 'Brasília', 'Alemanha' => 'Berlim', 'Argentina' => 'Buenos Aires'];

$existe = array_key_exists('Alemanha', $pais_capital);

if($existe){
    echo 'Existe: ';    
} else {
    echo 'Não Existe.';
}

// Resultado: Existe.

```
