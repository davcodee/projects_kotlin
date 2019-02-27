fun main(args: Array<String>) {
    /*arreglo de numeros enteros*/
    val numbers = intArrayOf(1,2,4,5,6,7,8,89)
    /*lista de  lenguajes de programación*/
    val programing_Lenguages = arrayListOf("Java", "kotlin", "python", "php" )

    /*Asignando elementos a nuestro array*/
    numbers[0] = 10
    /*Obtenendo elementos de nuestro array*/

    var num = numbers[1]

    /*listas dinamicas*/
    val mutableListExaample = mutableListOf(1,3,4,5,6,7,10)

    //agregando elementos
    mutableListExaample.add(70)
    mutableListExaample[0] = 2

    for(elemen in mutableListExaample)
        println(elemen)


    //Diccionarios en kotlin
    val diccionarios = mutableMapOf(Pair(1,"hola"))

    diccionarios.put(2,"kotlin")

    println(diccionarios.get(1) + diccionarios.get(2))

    
}