import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var aleatorio: Int
    aleatorio = Random.nextInt(0, 94)
    println(aleatorio)

    //println("Digite un valor: ")
    //aleatorio = readln().toInt()



    if (aleatorio <= 10){
        println("Generación T")
    }
    else if (aleatorio <= 27){
        println("Generación Z (Centennials)")
    }
    else if (aleatorio <= 40){
        println("Generación Y (Millennials)")
    }
    else if (aleatorio <= 52){
        println("Generación X")
    }
    else if (aleatorio <= 72){
        println("Generación Baby Boomers")
    }
    else if (aleatorio <= 93){
        println("Generación Silenciosa")
    }
}