# Exercícios Kotlin - Semana 1
<hr>

### Diferenças entre arquivos Kotlin e Java
Kotlin é uma linguagem relativamente nova, sendo lançado apenas em fevereiro de 2016 pela empresa JetBrains. Tornou-se muito popular por ser compatível com Java, o que significa que o código Java e suas bibliotecas podem ser usatilizados em programas Kotlin.

### Diferenças entre variáveis e constantes em Kotlin
Ambos são contêineres para armazenar valores de dados, mas cada um apresenta suas particularidades.

###### Variável
Armazena um dado que pode se alterar (mútavel).
- ``var``: Utilizada para a declaração de uma variável convencional.
###### Constantes
Armazena um dado imutável.
    
- ``val``: Usada para declarada constantes em tempo de execução.
- ``const``: Usada para declarar constante em tempo de compilação.

### Tipos de Dados
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
###### Diferente de inteiros, double já aceita casas decimais(64 bits).
var real:Double = 2.1
###### Assim como o Double, o float consegue armazenar valores com casas decimais. No entanto, seu espaço de armazenamento é menor(32 bits).
var reais:Float = 3.1F
###### Booleano existe apenas 2 possibilidade: True ou false
var boleano:Boolean = true

    