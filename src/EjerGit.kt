import kotlin.random.Random

fun main (){

    val aleatorio: Int
    var contador = 1
    var cara = 0
    var sello = 0

    while (contador <= 20){
        val aleatorio = Random.nextInt(1, 3)
        if (aleatorio == 1){
            println("cara")
            cara++
        }else if (aleatorio == 2){
            println("Sello")
            sello++
        }
        contador++;
    }

    println("Resultado final: Cara: $cara y Sello: $sello")
    if (cara > sello){
        println("Gana Cara")
    }else if (cara < sello){
        println("Gana sello")
    }else if (cara == sello){
        println("Empate")
    }
}