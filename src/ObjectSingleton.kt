import Validacion.validatePass

object Validacion{

    /*Verificamos que la contraseña sea distinta de null*/
    fun validatePass(pass: String):Boolean =  pass.isEmpty()
    /*verificamos cuando es numeo */
    fun esNumero(data: Any) = data is Int
}


class ClaseGlobal(){
    companion object {
        fun create()= ClaseGlobal()
        fun crea() : ClaseGlobal = ClaseGlobal()
    }
}

fun main(args: Array<String>) {
    print("Ingresa tu contraseña: ")
    /*Checamos que onda con */
    var data:String = readLine()!!
    println(Validacion.validatePass(data))

    /*Verificamos a readLine*/
    try {
        var num:Any = readLine()?.toInt() ?: ""
        println(num)
        println(Validacion.esNumero(num))

    }catch (nf:NumberFormatException){
        println("No ingreses una cadena ")
    }

}