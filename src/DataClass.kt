

/*Es una clase con getters, setter y */
data class Auto(val marca:String, val puertas: Int){
    /*Vamos a sobre escribir el número de puertas que tenemos*/

    var numPuertas = puertas
    get(){
        /*Aquí fiel hace referencia al número de puertas que tenemos*/
        return if(field > 0)  field else 1 //  función que revisa el número de puertas.
    }

}

/*Class vengador*/
data class Vengador(var name: String,var poder: String ){
    fun poder(){
        println("$name uso $poder")
    }
}

data class Round (var peleadores: MutableList<Vengador>){
    fun peleen(){
        //Variables que maneja los turnos
        var a = 0
        

    }
}

/*Funcion principal*/
fun main (args: Array<String>){

    var mazda = Auto("Mazda",0 )

    println(mazda.numPuertas)
}


