# Exercícios Kotlin - Semana 1

### Diferenças entre arquivos Kotlin e Java
<hr>
Kotlin é uma linguagem relativamente nova, sendo lançado apenas em fevereiro de 2016 pela empresa JetBrains. Tornou-se muito popular por ser compatível com Java, o que significa que o código Java e suas bibliotecas podem ser usatilizados em programas Kotlin.

### Diferenças entre variáveis e constantes em Kotlin
<hr>
Ambos são contêineres para armazenar valores de dados, mas cada um apresenta suas particularidades.

###### Variável
Armazena um dado que pode se alterar (mútavel).
- ``var``: Utilizada para a declaração de uma variável convencional.
###### Constantes
Armazena um dado imutável.
    
- ``val``: Usada para declarada constantes em tempo de execução.
- ``const``: Usada para declarar constante em tempo de compilação.

### Tipos de Dados
<hr>

###### Declaração de variável tipo cadeia.
~~~kotlin
var cadeia:String = "Olá Mundo"
~~~

###### Declaração de variável tipo caracter
~~~kotlin
var caractere:Char = 'c'
~~~

###### Declaração de variável tipo inteiro.
Número inteiro, subdivididos em ``Byte``(8 bits), ``Short``(16 bits), ``Int``(32 bits) e ``Long``(64 bits)
~~~kotlin
var inteiro:Int = 0
~~~
###### Declaração de variáveis decimais
Diferente de inteiros, ``Double`` já aceita casas decimais(64 bits).
~~~kotlin
var real:Double = 2.1
~~~
Assim como o ``Double``, o ``Float`` consegue armazenar valores com casas decimais. No entanto, seu espaço de armazenamento é menor(32 bits).
~~~kotlin
var reais:Float = 3.1
~~~
###### Declaração de  variáveis tipo Booleano
Booleano existe apenas 2 possibilidade: ``True`` ou ``False``
~~~kotlin
var boleano:Boolean = true
~~~
### Outros temas abordados na aula
<hr>

##### ``Operadores``; 
##### ``Entrada, processamento e saída``; 
##### ``Comentários``;
##### ``Controle de Fluxo (Condicionais)``; 

    