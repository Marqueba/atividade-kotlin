/* Exercícios If/Else
*   1 - Faça um programa que receba duas notas de um aluno e calcule a média. Se a média for maior ou igual a 7, exiba "Aprovado". Caso contrário, exiba "Reprovado". Use if/else.
*   2 - Faça um programa que receba um número inteiro e verifique se ele é par ou ímpar usando if/else.
*   3 - Faça um programa que receba um número inteiro e verifique se ele é positivo, negativo ou zero usando if/else.
*   4 - Faça um programa que verifique se uma pessoa é maior de idade (18 anos ou mais) usando if/else.
* */

fun main () {
    // Exercício 1
    print("Digite a 1º nota: ")
    var num1 = readln().toFloat()
    print("Digite a 2º nota: ")
    var num2 = readln().toFloat()

    var media: Float = (num1+num2)/2

    if (media>=7) {
        println("Aprovado.")
    } else {
        println("Reprovado.")
    }
    // Exercício 2
    print("Digite um número: ")
    var num = readln().toInt()

    if (num%2 == 0) {
        println("Esse número é par.")
    } else {
        println("Esse número é ímpar.")
    }
    // Exercício 3
    print("Digite um número: ")
    var valor = readln().toInt()
    if (valor == 0) {
        println("O valor digitado é igual a 0.")
    }
    else if (valor > 0) {
        println("O valor digitado é positivo.")
    } else {
        println("O valor digitado é negativo.")
    }
    // Exercício 4
    print("Digite sua idade: ")
    var idade = readln().toInt()
    if (idade >= 18) {
        println("Você é maior de idade.")
    } else {
        println("Você é maior de idade.")
    }
}
