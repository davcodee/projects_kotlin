fun main(args: Array<String>) {
    typeData("Hola mundo ")
    typeData(Persona("David"))
    typeData(9)
    typeData(true)

    println(openTheDoor(Persona("David")))
    println(openTheDoor(Persona("Monica")))
    println(openTheDoor(Persona("Testigo de jehova")))

    println(rango(5))


}

/*Ejemplo de función que define el tipo de dato
* Que le asignas.
* */
fun typeData(data: Any){
    when (data){
        is String ->{
            println("Soy una cadena")
        }
        is Int -> println("Soy un entero")
        is Boolean -> println("Soy un booleano")
        is Persona -> println("Soy una persona")
    }
}

/*Función que habre la puerta solo a personas conocidas*/
fun openTheDoor(person: Persona) =
        when(person.name){
            "David", "Monica" -> "Open the door"
            else    -> "No ni merga"

        }

fun rango(num: Int) =
        when(num){
            in 1..10 -> "EL número esta en el rango"
            else -> "No esta en el rango"
        }