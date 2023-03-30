/* Exercício Operadores
  *   a) Crie duas variáveis inteiras e faça a soma utilizando o operador +.
  *   b) Crie uma variável do tipo Boolean e atribua o resultado da expressão 5 > 3 && 2 < 4.
  *   c) Crie uma variável do tipo Boolean e atribua o resultado da expressão !(10 > 5 || 3 < 1).
  * */
fun main () {
    // Letra A
    var a: Int = 6
    var b: Int = 3
    var soma = a+b
    // Letra B
    var verifica: Boolean = 5 > 3 && 2 < 4
    print(verifica)

    // Letra C
    var verificaDenovo: Boolean = !(10 > 5 || 3 < 1)
    println(verificaDenovo)
}