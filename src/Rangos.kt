
fun main(args: Array<String>) {

    /*Iterando una lista de manera creciente*/
   // for(i in 1..10)
   //     println(i)

    /*Iterando una lista de manera decreciente*/
    //for(i in 10 downTo 1)
      //  println(i)

//for (i in 1..10 step 3 )
  //  println(i)

//for ( i in 4 downTo 1  step 2)
  //  print("$i ")

    for(i in  1 until 10) {
        println(i)
    }

    var esOnce = (1..12 step 2).last == 11
    println(esOnce)

}