
/*Clase saludar*/
class saludar{

    fun saluda(){
        println("hola mundo")
    }
}


/*Clase persasona*/
class Persona constructor(val name: String){
    /*Este método se ejecuta cuando  se inicia nuestra clase*/
    init {
        println("Hola mi nombre es $name ")
    }

    //Constructor con parámetros diferentes
    constructor(name: String, edad: Int):this(name){
        println("Hola mi nombre es $name y tengo la edad de $edad")
    }

}

// Ejemplo utilizando herencia
open class  Nombre(val nombre: String){

    init {
        println("Hola desde la clase padre")
    }

        open fun imprimeNombre(){
        println(nombre)
    }
}

class NombreCompleto(val name:String): Nombre(name){

    init {
        println("Hola desde la clase hija")
    }
    override fun imprimeNombre() {
        super.imprimeNombre()

    }
}

fun main(args: Array<String>) {
    val  nombre = NombreCompleto("")
}