/*Basic example of functions in kootlin*/


fun hello_word(){
    println("Hola mundo")
}

/*Función que imprime hello word*/
fun sum(a:Int , b: Int){
    println("La suma de los números $a + $b = ${a+b}")
}

/*Función que te da el máximo de dos números */
fun max(a: Int , b: Int): Int{
    return if (a > b)
        a
    else
        b
}

fun max2 (a: Int , b: Int) = if (a > b) a else b

fun main(args: Array<String>){
    println("número máximo 1:" + max(4,5))
    println("Número máximo 2: ${max2(4,5)}a")

}