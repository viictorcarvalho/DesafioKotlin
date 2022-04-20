import kotlin.system.exitProcess

fun main() {
val novoCalculo = readln().toDouble()

    println("Média final = $media")
    }

    fun notas(n1 : Double , n2 : Double, n3 : Double, n4 : Double) : Double {

        println("Nota 1: ")
        val n1 = readln().toDouble()

        println("Nota 2: ")
        val n2 = readln().toDouble()

        println("Nota 3: ")
        val n3 = readln().toDouble()

        println("Nota 4: ")
        val n4 = readln().toDouble()

        val media = (n1+n2+n3+n4)/4

        when (nota in 0..10) {
            if(n1 < 0) {
                println("Nota inválida")
            } else if (n1, n2, < 0) {
                println("Nota inválida")
            } else if (n3 < 0) {
                println("Nota inválida")
            } else if (n4 < 0) {
                println("Nota inválida")
            }

            while (true) {
                println("------------------------------------------------------")
                println("Para realizar um novo cálculo, digite 1")
                println("Para sair do programa, digite 2")

                val alternativa = readln().toInt()

                if (alternativa == 1) {
                    println(novoCalculo)
                    val n1 = readln().toDouble()
                } else if {
                 (alternativa == 2)
                        exitProcess(0)
                    }

