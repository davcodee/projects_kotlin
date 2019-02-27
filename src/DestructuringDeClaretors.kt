import jdk.net.SocketFlow

data class Familiar(var name:String = "Isaac", var edad:Int = 17, var colorOjos:String = "Verdes")

 data class Result(val result: Int, val status:Boolean )

fun calcular(a: Int, b:Int): Result{
    if(a * 2  > b){
        return Result(a*2, true)
    }else{
       return Result(a,false)
    }

}

 fun main(args: Array<String>) {

     var (name, edad,colorOjos) =  Familiar()
     println(name)
     println(edad)
     println(colorOjos)

     var (resul , status) = calcular(4,9)
     println(resul)
     println(status)

 }