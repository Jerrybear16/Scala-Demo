



object practice extends App{

    println("class extends app")

    val myList = List(1,2,5)
    val anotherList = List(3,4)

    for(i <- myList ; j <- anotherList){
        if(i%2 == 0) println(i+" Yes")
        else println(i+" no")
        if(j%2 == 0) println(j+" Even")
        else println(j+" odd")

    }
}