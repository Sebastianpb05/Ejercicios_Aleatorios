//fun multiplicar(a: Int, b: Int) = a * b

//fun main() {
    //println(multiplicar(6, 8)) // Imprime 48
//}

import kotlin.random.Random

fun main() {
    var contador = 1
    var caras = 0
    var sellos = 0

    while (contador <= 20) {
        val aleatorio = Random.nextInt(1, 3) // Generar un número aleatorio entre 1 y 2

        if (aleatorio == 1) {
            println("Cara")
            caras++
        } else if (aleatorio == 2) {
            println("Sello")
            sellos++
        }

        contador++
    }

    println("Resultado final:")
    println("Caras: $caras")
    println("Sellos: $sellos")
}
