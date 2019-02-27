
/*Función principal*/
fun main(args: Array<String>){

    "Hola mundo".imprime()
    3.isPrime()

    println(4 multiply 4)

    val fullNameList = mutableListOf("David","Ivàn","Morales","Campos")

    fullNameList.swap(1,0)
    fullNameList.toString()

    var nums = mutableListOf<Int>(5,6,8,1,2,9,10,14)
    println(nums.elMasGrande())

    var name = null
    println(name?.esNulo())
}

fun String.saludar(){
    println("Hola $this")
}

fun Any.esNulo():Boolean{
    return this != null
}


//función que regresa el numero más grande
fun MutableList<Int>.elMasGrande():Int{

    var maxNum = 0
    for(num in this){
        if(num > maxNum){
            maxNum = num
        }
    }
    return maxNum
}

/*Función que regresa la multiplicación de dos números*/
infix fun Int.multiply(num:Int): Int{
    return this * num
}

/*Función que cambia el indice de elementos de nuestra lista*/
fun <T> MutableList<T>.swap(index: Int, indexToCangue: Int ) {
    /*Tomamos el primer de nuestro index*/
    val tmp:T           = this[index]
    this[index]         = this[indexToCangue]
    this[indexToCangue] =   tmp

}



//Funcón que regresa a un número primo
fun Int.isPrime(){
    if(this % 2 == 0)
        println("$this es primo")
    else
        println("$this no es primo¡")

}

//Función que sólo imprime una cadena
fun String.imprime(cadena:String = ""){
    println("$this $cadena ")
}
