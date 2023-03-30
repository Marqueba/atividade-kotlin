fun main(args: Array<String>) {
    print("1 - Temperatura\n2 - Distância\n3 - Tempo\nEscolha unidade de medida deseja converter:")
    var escolha = readln().toInt()

    when (escolha) {
        1-> {
            println("Opção Escolhida - Temperatura")
            println("1 - Celsius para Fahrenheit\n2 - Fahrenheit para Celsius\nEscolha uma dessas opções: ")
            var decisao = readln().toInt()
            when (decisao) {
                1 -> {
                    println("Qual a temperatura em graus Celsius? ")
                    var temperatura = readln().toFloat()
                    var convercao =  temperatura * 9/5 + 32
                    println("A conversão de Celsius para Fahrenheit é igual a $convercao")
                }
                2 -> {
                    println("Qual a temperatura em graus Fahrenheit? ")
                    var temperatura = readln().toFloat()
                    var convercao =  (temperatura * - 32) / 1.8
                    println("A conversão de Fahrenheit para Celsius é igual a $convercao")
                }
                else -> {
                    println("Escolha uma das alternativas.")
                }
            }

        }
        2-> {
            println("Opção Escolhida - Distância")
            println("1 - Quilômetros para Metros\n2 - Metros para Quilômetros\nEscolha uma dessas opções: ")
            var decisao = readln().toInt()
            when (decisao) {
                1 -> {
                    println("Qual a distância em Km? ")
                    var distancia = readln().toFloat()
                    var convercao = distancia*1000
                    println("A distância em metros é igual a $convercao")
                }
                2 -> {
                    println("Qual a distância em Metros? ")
                    var distancia = readln().toFloat()
                    var convercao = distancia/1000
                    println("A distância em km é igual a $convercao")
                }
                else -> {
                    println("Escolha uma das alternativas.")
                }
            }
        }
        3-> {
            println("Opção Escolhida - Tempo")
            println("1 - Minutos para Hora\n2 - Horas para minutos\nEscolha uma dessas opções: ")
            var decisao = readln().toInt()
            when (decisao) {
                1 -> {
                    println("Qual o tempo em minutos? ")
                    var tempo = readln().toFloat()
                    var convercao =  tempo/60
                    println("A conversão de minutos para hora é igual a $convercao")
                }
                2 -> {
                    println("Qual o tempo em horas? ")
                    var tempo = readln().toFloat()
                    var convercao =  tempo*60
                    println("A conversão de horas para minutos é igual a $convercao")
                }
                else -> {
                    println("Escolha uma das alternativas.")
                }
            }
        }
        else -> {
            println("Por favor, escolha uma das alternativas acima.")
        }
    }
}
