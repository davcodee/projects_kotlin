
/*Main fuction*/
fun main(args : Array<String>){
    println( 4 esMayor 5)
    defineTipo(true)

    defineTipo2(true)
}

/*Función que regresa un número mayor*/
 infix  fun Int.esMayor( secondNumber : Int): Boolean{
    return this > secondNumber
}

/*Función que define el tipo de dato que tenemos*/
fun defineTipo(dato : Any){

    if(dato is String){
        println(dato.length)
    }else if(dato is Int){
        println("${dato * 2}")
    }else if (dato is Boolean){
        println("Soy un booleano")
    }
}

fun defineTipo2(dato: Any){
    when(dato){
        /*Revisamos cuando nuestro dato es un entero*/
        is Int -> {
            println("Soy un dato de tipo entero")
        }
        /*Revisamos cuando nuestro dato es un boolean*/
        is Boolean -> {
            println("Soy un dato de tipo booleano")
        }
        /*Revisamos cuando nuestro dato es una cadena*/
        is String -> {
            println("Soy un dato de tipo cadena")
        }
    }
}