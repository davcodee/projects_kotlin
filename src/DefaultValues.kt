/*Example of default values kotlin*/

fun saludar(name: String ="nope"){

    if (name =="nope")
        println("Oye bro no definiste tu nombre")

    else
        println("Hola  $name")
}


fun main(args : Array<String>){

    saludar()
    saludar("David")

}