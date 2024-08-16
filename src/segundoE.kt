fun main() {
    val peso:Int
    println("Digite su peso: ")
    peso = readln().toInt()


    val estatura:Double
    println("Digite su estatura: ")
    estatura = readln().toDouble()

    val estatura2 = estatura * estatura

    println("Su promedio es: ${(peso)/estatura2}")


    if (estatura2 <= 18.5){
        println("Promedio bajo")
    }
    else if (estatura2 >= 24.9){
        println("Normopeso")
    }
    else if (estatura2 >= 29.9){
        println("Normopeso")
    }
    else if (estatura2 >= 34.9){
        println("Normopeso")
    }
    else if (estatura2 >= 39.9){
        println("Normopeso")
    }
    else if (estatura2 >= 49.9){
        println("Normopeso")
    }
    else if (estatura2 >= 50.9){
        println("Normopeso")
    }

}