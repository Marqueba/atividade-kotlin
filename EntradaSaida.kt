/* Exercício Entrada, processamento e saída
*   1 - Faça um programa que peça ao usuário para digitar dois números e mostre a soma desses números.
*   2 - Faça um programa que calcule o quadrado de um número informado pelo usuário.
*   3 - Faça um programa que peça ao usuário para informar seu nome e sua idade, e que exiba uma mensagem de boas-vindas com o nome e a idade informados.
* */

fun main () {
    // Exercício 1
    println("Digite 2 números para ser efetuado a soma entre eles")
    print("Digite o primeiro número: ")
    var num1 = readln().toInt()
    print("Digite o Segundo número: ")
    var num2 = readln().toInt()
    var resultado = num1 + num2

    print("Soma desse números é igual a $resultado")

    // Exercício 2
    println("Digite um número pra descobrir seu quadrado")
    var num = readln().toInt()

    var quadrado = num*num

    print("O quadrado de $num é igual a  $quadrado")

    // Exercício 3
    print("Digite seu nome: ")
    var nome = readln().toString()
    print("Digite sua idade: ")
    var idade = readln().toInt()

    print("Seja bem-vindo $nome, você tem $idade anos de idade.")
}
