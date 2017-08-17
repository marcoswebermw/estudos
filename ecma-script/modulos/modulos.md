## Módulos

* São arquivos que podem ser importados por outros.

Só existiam dois padrões de módulos o AMD e o CommonJS.

## AMD(Asynchronous Module Definition)

* Antigo.
* Projetado para o navegador.
* Ele usa o `define()`.
* Especificação: https://github.com/amdjs/amdjs-api/blob/master/AMD.md

## CommonJS

* Especificação universal para módulos.
* Não se limita ao navegador.
* Ele usa o `require('modulo')`.
* Somente funciona no node(CommonJS). Não foi implementada nos navegadores.
* Especificação: http://www.commonjs.org ou https://github.com/nodejs/node/blob/master/doc/api/modules.md

## ES6(ES2015)

* Passou a existir o *EcmaScript Modules*. É uma especificação oficial para Modulos. São o `import` e o `export`.
* O problema é que alguns navegadores a implementam e outros não. O mesmo vale para o node que também não implementa.
* Uma solução encontrada foi através do `Babel` que converte o `import` e o `export` para o padrão `CommonJS` que usa o `require` por exemplo.
* Infelizmente ainda não é possível usar o novo padrão de módulos pois eles não funcionam nos navegadores e node sem transpiladores.

