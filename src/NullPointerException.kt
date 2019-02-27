
fun main(args: Array<String>){

    var name: String? = "David"
    name = null

    var fullName: String = " David Iván Morales Campos"

    var lnName      = name?.length ?: 0
    var lnFullName  = fullName.length

    println(lnName)
    println(lnFullName)

    /*Persona normal*/
    var davo: Persona = Persona("David Iván Morales Campos")
    /*Persona nulla*/
    var desconocido: Persona? = null

    /*Validación par cuando el objeto es nulo*/
    var nombrePersona: String? = desconocido?.name ?: "No tenfo nombre"
    println(davo.name)
    println(nombrePersona)


    /*Check null a patita para el desconocido*/
    var namePersona2 = if(desconocido?.name != null){
       println( desconocido.name)
    }else{
        println("No tengo nombre x2")
    }


    /*Check != null  sintaxSugar*/
    davo?.let {
        println("Hola mi nombre es ${davo.name}")
    }


    /*Aqui cheamos si es igual a null*/
    desconocido.let {
        println("No tengo nombre x3")
    }



}