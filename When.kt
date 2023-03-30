/* Exercícios utilizando When
*   1 - Faça um programa que receba um número de 1 a 7 e exiba o dia da semana correspondente usando when.
*   2 - Faça um programa que verifique se um animal é um mamífero, ave ou réptil usando when.
*   3 - Faça um programa que receba uma letra e verifique se ela é uma vogal ou consoante usando when.
*   4 - Faça um programa que receba um número de 1 a 12 e exiba o mês correspondente usando when.
* */

fun main () {
    // Exercício 1
    print("Digite um número de 1 a 7: ")
    var num = readln().toInt()

    when (num) {
        1-> {
            println("Domingo.")
        }
        2-> {
            println("Segunda-feira.")
        }
        3-> {
            println("Terça-feira")
        }
        4-> {
            println("Quarta-feira")
        }
        5-> {
            println("Quinta-Feira")
        }
        6-> {
            println("Sexta-feira")
        }
        7-> {
            println("Sábado.")
        }
        else-> {
            println("Número informado fora do escopo.")
        }
    }

    // Exercício 2
    // Exercício 3
    print("Digite uma letra: ")
    var letra = readln().toString()

    when (letra) {
        "a" -> {
            println("Essa letra é uma vogal")
        }
        "e" -> {
            println("Essa letra é uma vogal")
        }
        "i" -> {
            println("Essa letra é uma vogal")
        }
        "o" -> {
            println("Essa letra é uma vogal")
        }
        "u" -> {
            println("Essa letra é uma vogal")
        }
        else -> {
            println("Essa letra é uma consoante.")
        }
    }
    // Exercício 4
    print("Digite um número de 1 a 12: ")
    var mes = readln().toInt()

    when (mes) {
        1-> {
            println("Janeiro")
        }
        2-> {
            println("Fevereiro")
        }
        3-> {
            println("Março")
        }
        4-> {
            println("Abril")
        }
        5-> {
            println("Maio")
        }
        6-> {
            println("Junho")
        }
        7-> {
            println("Julho")
        }
        8-> {
            println("Agosto")
        }
        9-> {
            println("Setembro")
        }
        10-> {
            println("Outubro")
        }
        11-> {
            println("Novembro")
        }
        12-> {
            println("Dezembro")
        }
        else-> {
            println("Número informado fora do escopo.")
        }
    }
}