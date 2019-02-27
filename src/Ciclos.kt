
fun main(args: Array<String>){

    // Ejemplo par aun foreach de números
    var numeros = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    /*for( i in numeros.indices){
        println(numeros[i])
    }*/

    /*Ejemplo par auna lista de nombres */
    var nombres = mutableListOf("David", "Iván", "Isaac", "Anita", "Norma", "Vladimir")

    for(nombre in nombres){
        println("Hola $nombre")
    }


    /*Ejemplo  par un while*/
    var count = 5

    while( count > 0 ){
        println(count--)
    }


    var sum:Int         = 0
    var input:String?   = ""

    do{
        print("Ingresa un número: ")
        input = readLine()
        sum += input?.toInt() ?: 0
    }while(input != "0")

    println("La suma total es  $sum")

}

